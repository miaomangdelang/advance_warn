package com.advance_warn.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 监测回路数据码表
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/10 14:30
 */
@Data
@TableName(value = "branch_dot_dict")
public class BranchDotDict implements Serializable {

	private static final long serialVersionUID = 8584973160520257774L;

	/**
	 * 分支类型id
	 */
	@TableField(value = "branch_type_id")
	private Integer branchTypeId;

	/**
	 * 数据编号
	 */
	@TableField(value = "dot_no")
	private Integer dotNo;

	/**
	 * 备注
	 */
	@TableField(value = "remarks")
	private String remarks;

	/**
	 * 最新时间
	 */
	@TableField(value = "latest_time")
	private Date latestTime;

	/**
	 * 冻结数据标识位
	 */
	@TableField(value = "process")
	private Integer process;

	/**
	 * 实时数据标志位
	 */
	@TableField(value = "transient")
	private Integer transients;

}
