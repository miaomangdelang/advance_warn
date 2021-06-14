package com.advance_warn.model.output;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 列表分页返回结果基础类
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/11 09:22
 */
@Data
public class PageResponse<T> implements Serializable {

	/**
	 * 返回用户分页列表
	 */
	@ApiModelProperty(value = "数据列表")
	private List<T> dataList;

	/**
	 * 总数量
	 */
	@ApiModelProperty(value = "总数量")
	private Long totalNum;

	/**
	 * 总页数
	 */
	@ApiModelProperty(value = "总页数")
	private Long totalPage;

	private static final long serialVersionUID = 4615157902958790325L;
}
