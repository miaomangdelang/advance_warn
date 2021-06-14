package com.advance_warn.service.impl;

import com.advance_warn.annotation.BaseService;
import com.advance_warn.dao.RealtimeEventBranchMapper;
import com.advance_warn.enums.EventStateEnum;
import com.advance_warn.model.OperationResult;
import com.advance_warn.model.dto.RealtimeEventBranchPageDetailDTO;
import com.advance_warn.model.entity.RealtimeEventBranch;
import com.advance_warn.model.input.RealtimeEventBranchPageInput;
import com.advance_warn.model.input.RealtimeEventBranchUpdateStateInput;
import com.advance_warn.model.output.RealtimeEventBranchInitResponse;
import com.advance_warn.model.output.RealtimeEventBranchPageDetailResponse;
import com.advance_warn.model.output.RealtimeEventBranchPageResponse;
import com.advance_warn.model.query.RealtimeEventBranchPageQuery;
import com.advance_warn.service.RealtimeEventBranchService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 事件服务
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/11 09:59
 */
@Slf4j
@BaseService
public class RealtimeEventBranchServiceImpl implements RealtimeEventBranchService {

	@Resource
	private RealtimeEventBranchMapper realtimeEventBranchMapper;

	/**
	 * 查询事件分页列表
	 *
	 * @param input 开始时间，结束时间，事件状态，用户名
	 * @return
	 */
	@Override
	public OperationResult<RealtimeEventBranchPageResponse> findRealtimeEventBranchPage(RealtimeEventBranchPageInput input) {
		RealtimeEventBranchPageQuery query = new RealtimeEventBranchPageQuery();
		BeanUtils.copyProperties(input, query);
		IPage<RealtimeEventBranchPageDetailDTO> page = realtimeEventBranchMapper.findRealtimeEventBranchPage(new Page<>(input.getPageNum(), input.getShowNum()), query);
		List<RealtimeEventBranchPageDetailResponse> collect = page.getRecords().stream().map(realtimeEventBranchPageDetailDTO -> {
			RealtimeEventBranchPageDetailResponse detailResponse = new RealtimeEventBranchPageDetailResponse();
			BeanUtils.copyProperties(realtimeEventBranchPageDetailDTO, detailResponse);
			detailResponse.setEventStateName(EventStateEnum.getByCode(realtimeEventBranchPageDetailDTO.getEventState()).getName());
			return detailResponse;
		}).collect(Collectors.toList());
		RealtimeEventBranchPageResponse response = new RealtimeEventBranchPageResponse();
		response.setDataList(collect);
		response.setTotalNum(page.getTotal());
		response.setTotalPage(page.getPages());
		return OperationResult.success(response);
	}

	/**
	 * 快速处理
	 *
	 * @return
	 */
	@Override
	public OperationResult updateState(RealtimeEventBranchUpdateStateInput input) {
		RealtimeEventBranch eventBranch = new RealtimeEventBranch();
		eventBranch.setEventId(input.getId());
		eventBranch.setEventState(1);
		eventBranch.setEventHandle(input.getEventHandle());
		realtimeEventBranchMapper.update(eventBranch, new QueryWrapper<RealtimeEventBranch>().lambda().eq(RealtimeEventBranch::getEventId, input.getId()));
		return OperationResult.success();
	}

	/**
	 * 事件列表页初始化信息
	 *
	 * @return
	 */
	@Override
	public OperationResult init() {
		RealtimeEventBranchInitResponse initResponse = new RealtimeEventBranchInitResponse();
		Integer allCount = realtimeEventBranchMapper.selectCount(null);
		initResponse.setAllCount(allCount);
		LambdaQueryWrapper<RealtimeEventBranch> untreated = new QueryWrapper<RealtimeEventBranch>().lambda().eq(RealtimeEventBranch::getEventState, EventStateEnum.UNTREATED.getCode());
		Integer untreatedCount = realtimeEventBranchMapper.selectCount(untreated);
		initResponse.setUntreatedCount(untreatedCount);
		LambdaQueryWrapper<RealtimeEventBranch> processed = new QueryWrapper<RealtimeEventBranch>().lambda().eq(RealtimeEventBranch::getEventState, EventStateEnum.PROCESSED.getCode());
		Integer processedCount = realtimeEventBranchMapper.selectCount(processed);
		initResponse.setProcessedCount(processedCount);

		Map<Integer, String> eventStateEnumMap = Arrays.stream(EventStateEnum.values()).collect(Collectors.toMap(enums -> enums.getCode(), enums -> enums.getName()));
		initResponse.setEventState(eventStateEnumMap);
		return OperationResult.success(initResponse);
	}


}
