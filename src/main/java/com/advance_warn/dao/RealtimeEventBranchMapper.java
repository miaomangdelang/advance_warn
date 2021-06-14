package com.advance_warn.dao;

import com.advance_warn.model.dto.RealtimeEventBranchPageDetailDTO;
import com.advance_warn.model.entity.RealtimeEventBranch;
import com.advance_warn.model.query.RealtimeEventBranchPageQuery;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

/**
 * 事件mapper
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/11 08:49
 */
@Mapper
public interface RealtimeEventBranchMapper extends BaseMapper<RealtimeEventBranch> {

	/**
	 * 分页查询事件信息
	 *
	 * @param page 分页
	 * @param query 开始时间，结束时间，事件状态，用户名
	 * @return 事件列表
	 */
	IPage<RealtimeEventBranchPageDetailDTO> findRealtimeEventBranchPage(Page page, @Param("query") RealtimeEventBranchPageQuery query);

}
