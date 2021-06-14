package com.advance_warn.service;

import com.advance_warn.model.OperationResult;
import com.advance_warn.model.input.RealtimeEventBranchPageInput;
import com.advance_warn.model.input.RealtimeEventBranchUpdateStateInput;
import com.advance_warn.model.output.RealtimeEventBranchPageResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.beans.Transient;

/**
 * 事件模块测试类
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/11 14:47
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class RealtimeEventBranchTest {

	@Resource
	private RealtimeEventBranchService realtimeEventBranchService;

	/**
	 * 查询事件列表
	 */
	@Test
	public void findRealtimeEventBranchPage() {
		RealtimeEventBranchPageInput input = new RealtimeEventBranchPageInput();
		input.setBeginDate("1970-01-01");
		input.setEndDate("2021-06-13");
		OperationResult<RealtimeEventBranchPageResponse> page = realtimeEventBranchService.findRealtimeEventBranchPage(input);
		Assert.assertEquals(OperationResult.OK, page.getResultCode());
	}

	/**
	 * 快速处理
	 */
	@Test
	@Transient
	public void updateState() {
		RealtimeEventBranchUpdateStateInput input = new RealtimeEventBranchUpdateStateInput();
		input.setId(8162839);
		OperationResult operationResult = realtimeEventBranchService.updateState(input);
		Assert.assertEquals(OperationResult.OK, operationResult.getResultCode());
	}





}
