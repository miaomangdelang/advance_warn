package com.advance_warn.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 从机类型表
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/10 14:51
 */
@Data
@TableName(value = "meas_point_type")
public class MeasPointType implements Serializable {

	/**
	 * 从机类型ID
	 */
	@TableField(value = "meas_point_type_id")
	private Integer measPointTypeId;

	/**
	 * 从机类型名称
	 */
	@TableField(value = "meas_point_type_name")
	private String measPointTypeName;

	@TableField(value = "is_enabled")
	private Integer isEnabled;

	@TableField(value = "latest_time")
	private Date latestTime;

	/**
	 * 备注
	 */
	@TableField(value = "remark")
	private String remark;

	@TableField(value = "is_type")
	private String isType;

	@TableField(value = "product_name")
	private String productName;

	@TableField(value = "level")
	private Integer level;

	@TableField(value = "address")
	private String address;

	private static final long serialVersionUID = 1336478919590500063L;
}
