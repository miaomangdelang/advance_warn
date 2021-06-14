package com.advance_warn.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 事件分页列表详情回参
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/11 09:29
 */
@Data
@ApiModel(description = "事件分页列表详情回参")
public class RealtimeEventBranchPageDetailDTO implements Serializable {

	private static final long serialVersionUID = 5905743853757852770L;

	/**
	 * 事件Id
	 */
	@ApiModelProperty("事件Id")
	private Integer id;

	/**
	 * 支路名称
	 */
	@ApiModelProperty("支路名称")
	private String branchName;

	/**
	 * 事件名称
	 */
	@ApiModelProperty("事件名称")
	private String eventName;

	/**
	 * 事件时间
	 */
	@ApiModelProperty("事件时间")
	private Date eventTime;

	/**
	 * 告警值
	 */
	@ApiModelProperty("告警值")
	private Float eventValue;

	/**
	 * 事件状态
	 */
	@ApiModelProperty("事件状态")
	private Integer eventState;

}
