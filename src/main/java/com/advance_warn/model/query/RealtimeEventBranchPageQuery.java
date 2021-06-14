package com.advance_warn.model.query;

import com.advance_warn.enums.EventStateEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 *
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/11 16:05
 */
@Data
public class RealtimeEventBranchPageQuery implements Serializable {

	private static final long serialVersionUID = -1131001018104772688L;

	/**
	 * 查询开始时间
	 */
	private String beginDate;

	/**
	 * 查询结束时间
	 */
	private String endDate;

	/**
	 * 事件状态
	 */
	private Integer eventState;

	/**
	 * 事件名称
	 */
	private String eventName;

	/**
	 * 用户名称
	 */
	private String loginName;

}
