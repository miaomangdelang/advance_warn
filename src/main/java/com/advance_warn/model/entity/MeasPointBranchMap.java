package com.advance_warn.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 监测回路
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/10 15:07
 */
@Data
@TableName(value = "meas_point_branch_map")
public class MeasPointBranchMap implements Serializable {

	private static final long serialVersionUID = -999639730968081898L;

	/**
	 *  id自增长
	 */
	@TableField(value = "branch_id")
	private Integer branchId;

	/**
	 * 所属从机ID
	 */
	@TableField(value = "meas_point_seq")
	private Integer measPointSeq;

	/**
	 * 所属主机ID
	 */
	@TableField(value = "terminal_id")
	private Integer terminalId;

	/**
	 * 监测回路类型ID
	 */
	@TableField(value = "branch_type_id")
	private Integer branchTypeId;

	/**
	 * 监测回路名称
	 */
	@TableField(value = "branch_name")
	private String branchName;

	/**
	 * 时间
	 */
	@TableField(value = "latest_time")
	private Date latestTime;

	/**
	 * 备注
	 */
	@TableField(value = "remarks")
	private String remarks;

	@TableField(value = "alertlevel")
	private Integer alertlevel;

	/**
	 * 是否启用
	 */
	@TableField(value = "isenable")
	private Integer isEnable;

	/**
	 *
	 */
	@TableField(value = "level")
	private Integer level;

	/**
	 * 地址
	 */
	@TableField(value = "address")
	private String address;

	/**
	 *
	 */
	@TableField(value = "abnormal")
	private Integer abnormal;

}
