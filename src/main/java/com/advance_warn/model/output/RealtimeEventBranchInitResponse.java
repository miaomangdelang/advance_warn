package com.advance_warn.model.output;

import com.advance_warn.enums.EventStateEnum;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 事件分页列表初始化信息回参
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/11 16:43
 */
@Data
@ApiModel(description = "事件分页列表初始化信息回参")
public class RealtimeEventBranchInitResponse {

	/**
	 * 事件状态列表
	 */
	Map<Integer, String> eventState;

	/**
	 * 全部事件
	 */
	Integer allCount;

	/**
	 * 已处置
	 */
	Integer untreatedCount;

	/**
	 * 未处置
	 */
	Integer processedCount;

}
