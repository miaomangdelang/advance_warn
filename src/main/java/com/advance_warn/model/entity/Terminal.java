package com.advance_warn.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 终端信息表
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/10 17:14
 */
@Data
@TableName(value = "terminal")
public class Terminal implements Serializable {

	private static final long serialVersionUID = 5446886013945752722L;

	/**
	 * 所属主机ID
	 */
	@TableField(value = "terminal_id")
	private Integer terminalId;

	/**
	 * 所属主机名称
	 */
	@TableField(value = "terminal_name")
	private String terminalName;

	/**
	 * 终端类型
	 */
	@TableField(value = "terminal_type_id")
	private Integer terminalTypeId;

	/**
	 *
	 */
	@TableField(value = "channel_id")
	private Integer channelId;

	@TableField(value = "collect_prog_id")
	private String collectProgId;

	@TableField(value = "comm_way")
	private String commWay;

	@TableField(value = "comm_addr")
	private String commAddr;

	@TableField(value = "comm_port")
	private String commPort;

	@TableField(value = "terminal_seq")
	private String terminalSeq;

	@TableField(value = "terminal_addr")
	private String terminalAddr;

	@TableField(value = "terminal_area_code")
	private String terminalAreaCode;

	@TableField(value = "is_enabled")
	private String isEnabled;

	@TableField(value = "enabled_time")
	private String enabledTime;

	@TableField(value = "latest_time")
	private String latestTime;

	@TableField(value = "terminal_desc")
	private String terminalDesc;

	/**
	 * 经度
	 */
	@TableField(value = "lng")
	private String lng;

	/**
	 * 纬度
	 */
	@TableField(value = "lat")
	private String lat;

	@TableField(value = "deptid")
	private String deptId;

	/**
	 * 所属部门名称（全称包括）
	 */
	@TableField(value = "deptname")
	private String deptName;

	@TableField(value = "base_id")
	private String baseId;

	/**
	 * 用于设备通信（烧录设备）
	 */
	@TableField(value = "imei")
	private String imei;

	@TableField(value = "cmobile_1")
	private String cmobile1;

	@TableField(value = "cmobile_2")
	private String cmobile2;

	@TableField(value = "cmobile_3")
	private String cmobile3;

	@TableField(value = "cmobile_4")
	private String cmobile4;

	@TableField(value = "cmobile_5")
	private String cmobile5;

	@TableField(value = "cmobile_6")
	private String cmobile6;

	@TableField(value = "weatherstation")
	private String weatherstation;

	@TableField(value = "tip_sms")
	private String tipSms;

	@TableField(value = "tip_voice")
	private String tipVoice;

	@TableField(value = "broadtimes")
	private String broadtimes;

	@TableField(value = "broadspeed")
	private String broadspeed;

	@TableField(value = "soundtype")
	private String soundtype;

	@TableField(value = "volume")
	private String volume;

	@TableField(value = "dwelltime")
	private String dwelltime;

	@TableField(value = "param_modified_flag")
	private String paramModifiedFlag;

	@TableField(value = "device_status")
	private String deviceStatus;

	@TableField(value = "add_tml_flag")
	private String addTmlFlag;

	@TableField(value = "project_id")
	private String projectId;

	@TableField(value = "level")
	private String level;

	@TableField(value = "address")
	private String address;

	@TableField(value = "depttypeid")
	private Integer depttypeid;

}
