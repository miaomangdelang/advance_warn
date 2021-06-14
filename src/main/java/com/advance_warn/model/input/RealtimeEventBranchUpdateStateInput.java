package com.advance_warn.model.input;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * 事件快速处理入参
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/11 08:57
 */
@ApiModel(description = "事件快速处理入参")
@Getter
@Setter
public class RealtimeEventBranchUpdateStateInput {

	/**
	 * 事件id
	 */
	@ApiModelProperty(value = "事件id")
	@NotNull(message = "事件id不能为空")
	private Integer id;

	/**
	 * 处理意见
	 */
	@ApiModelProperty(value = "处理意见")
	private String eventHandle;

}
