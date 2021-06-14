package com.advance_warn.service;

import com.advance_warn.model.OperationResult;
import com.advance_warn.model.input.RealtimeEventBranchPageInput;
import com.advance_warn.model.input.RealtimeEventBranchUpdateStateInput;
import com.advance_warn.model.output.RealtimeEventBranchPageResponse;

/**
 * 事件模块
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/11 08:49
 */
public interface RealtimeEventBranchService {

	/**
	 * 查询事件分页列表
	 *
	 * @param input 开始时间，结束时间，事件状态，用户名
	 * @return 事件列表
	 */
	OperationResult<RealtimeEventBranchPageResponse> findRealtimeEventBranchPage(RealtimeEventBranchPageInput input);


	/**
	 * 快速处理
	 *
	 * @param input
	 * @return
	 */
	OperationResult updateState(RealtimeEventBranchUpdateStateInput input);

	/**
	 * 事件列表页初始化信息
	 *
	 * @return
	 */
	OperationResult init();

}
