package com.advance_warn.model.input;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * 分页查询基础类
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/11 09:00
 */
@ApiModel(description = "分页查询参数基类")
@Data
public class PageInput extends BaseInput {

	/**
	 * 页码
	 */
	@ApiModelProperty(value = "页码", example = "1", notes = "默认为第1页")
	@Min(value = 1, message = "页码必须大于0")
	private Integer pageNum = 1;

	/**
	 * 每页数量
	 */
	@ApiModelProperty(value = "每页数量", example = "10", notes = "默认每页展示10条")
	@Min(value = 1, message = "每页容量至少为1")
	@Max(value = 100, message = "每页容量最大为100")
	private Integer showNum = 10;

	private static final long serialVersionUID = -8128404564106235414L;
}
