package com.advance_warn.model.input;

import com.advance_warn.enums.EventStateEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * 事件分页列表入参
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/11 08:57
 */
@ApiModel(description = "事件分页列表入参")
@Getter
@Setter
public class RealtimeEventBranchPageInput extends PageInput {

	private static final long serialVersionUID = 1524223554256310793L;

	/**
	 * 查询开始时间
	 */
	@ApiModelProperty(value = "查询开始时间", example = "1970-01-01")
	@Pattern(regexp = "[0-9]{4}-[0-9]{2}-[0-9]{2}", message = "日期格式错误，yyyy-MM-dd")
	@NotBlank(message = "开始时间不能为空")
	private String beginDate;

	/**
	 * 查询结束时间
	 */
	@ApiModelProperty(value = "查询结束时间", example = "2020-01-31")
	@Pattern(regexp = "[0-9]{4}-[0-9]{2}-[0-9]{2}", message = "日期格式错误，yyyy-MM-dd")
	@NotBlank(message = "结束时间不能为空")
	private String endDate;

	/**
	 * 事件状态
	 */
	@ApiModelProperty(value = "事件状态")
	private Integer eventState;

	/**
	 * 事件名称
	 */
	@ApiModelProperty(value = "事件名称")
	private String eventName;

	/**
	 * 用户名称
	 */
	@ApiModelProperty(value = "用户名称")
	private String loginName;

}
