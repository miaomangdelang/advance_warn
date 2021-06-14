package com.advance_warn.controller;

import com.advance_warn.model.OperationResult;
import com.advance_warn.model.input.RealtimeEventBranchPageInput;
import com.advance_warn.model.input.RealtimeEventBranchUpdateStateInput;
import com.advance_warn.model.output.RealtimeEventBranchPageResponse;
import com.advance_warn.service.RealtimeEventBranchService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 *
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/11 11:48
 */
@Api(tags = "事件接口入口")
@RestController
@RequestMapping("/event")
public class RealtimeEventBranchController {

	@Resource
	private RealtimeEventBranchService realtimeEventBranchService;

	/**
	 * 事件列表查询
	 *
	 * @return
	 */
	@ApiOperation(value = "事件列表查询", notes = "事件列表查询")
	@GetMapping("/queryList")
	public OperationResult<RealtimeEventBranchPageResponse> queryList(@Valid RealtimeEventBranchPageInput input) {
		return realtimeEventBranchService.findRealtimeEventBranchPage(input);
	}

	/**
	 * 快速处理
	 *
	 * @param input
	 * @return
	 */
	@ApiOperation(value = "快速处理", notes = "快速处理")
	@PostMapping("/updateState")
	public OperationResult updateState(RealtimeEventBranchUpdateStateInput input) {
		return realtimeEventBranchService.updateState(input);
	}

	/**
	 * 事件列表页初始化信息
	 *
	 * @param
	 * @return
	 */
	@ApiOperation(value = "事件列表页初始化信息", notes = "事件列表页初始化信息")
	@GetMapping("/init")
	public OperationResult init() {
		return realtimeEventBranchService.init();
	}

}
