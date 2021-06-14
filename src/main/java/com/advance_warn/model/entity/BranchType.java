package com.advance_warn.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 监测回路类型表
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/10 08:38
 */
@Data
@TableName(value = "branch_type")
public class BranchType implements Serializable {

	private static final long serialVersionUID = 2187670092183583887L;

	/**
	 * 分支类型id
	 */
	@TableField(value = "branch_type_id")
	private Integer branchTypeId;

	/**
	 * 分支类型名称
	 */
	@TableField(value = "branch_type_name")
	private String branchTypeName;

	/**
	 * 备注
	 */
	@TableField(value = "remarkes")
	private String remarkes;

	/**
	 * 从机类型ID
	 */
	@TableField(value = "meas_point_type_id")
	private Integer measPointTypeId;

}
