package com.advance_warn.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 事件表
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/10 16:20
 */
@Data
@TableName(value = "realtime_event_branch")
public class RealtimeEventBranch implements Serializable {

	private static final long serialVersionUID = -8990024651104930078L;

	/**
	 * 事件ID
	 */
	@TableField(value = "eventid")
	private Integer eventId;

	/**
	 * 监测回路ID
	 */
	@TableField(value = "branch_id")
	private Integer branchId;

	/**
	 * 监测回路名称
	 */
	@TableField(value = "branch_name")
	private String branchName;

	/**
	 * 监测回路类型ID
	 */
	@TableField(value = "branch_type_id")
	private Integer branchTypeId;

	/**
	 * 预警值
	 */
	@TableField(value = "event_value")
	private Float eventValue;

	/**
	 * 事件名称
	 */
	@TableField(value = "event_name")
	private String eventName;

	/**
	 * 事件时间
	 */
	@TableField(value = "event_time")
	private Date eventTime;

	@TableField(value = "event_no")
	private Integer eventNo;

	@TableField(value = "event_state")
	private Integer eventState;

	@TableField(value = "event_handle")
	private String eventHandle;

	/**
	 * 所属主机ID
	 */
	@TableField(value = "terminal_id")
	private Integer terminalId;

	/**
	 * 所属从机ID
	 */
	@TableField(value = "meas_point_seq")
	private Integer measPointSeq;

	/**
	 * 是否启用
	 */
	@TableField(value = "alertlevel")
	private Integer alertlevel;

	/**
	 * 时间
	 */
	@TableField(value = "latest_time")
	private Date latestTime;

	@TableField(value = "event_desc")
	private String eventDesc;

	/**
	 * 从机类型ID
	 */
	@TableField(value = "meas_point_type_id")
	private Integer measPointTypeId;

	@TableField(value = "raw_branch_id")
	private Integer rawBranchId;

	@TableField(value = "is_run")
	private Integer isRun;
}
