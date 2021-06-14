package com.advance_warn.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/10 16:49
 */
@Data
@TableName(value = "sysuser")
public class SysUser implements Serializable {

	/**
	 * 用户id
	 */
	@TableField(value = "userid")
	private Integer userId;

	/**
	 * 用户名称
	 */
	@TableField(value = "username")
	private String userName;

	/**
	 * 用户登录名
	 */
	@TableField(value = "loginname")
	private String loginName;

	/**
	 * 密码(32位大写MD5加密)
	 */
	@TableField(value = "pwd")
	private String pwd;

	/**
	 * 手机号
	 */
	@TableField(value = "phone")
	private String phone;

	/**
	 * 地址
	 */
	@TableField(value = "address")
	private String address;

	/**
	 * 性别
	 */
	@TableField(value = "sex")
	private String sex;

	/**
	 * email
	 */
	@TableField(value = "email")
	private String email;

	/**
	 *
	 */
	@TableField(value = "identitynum")
	private String identityNum;

	@TableField(value = "issms")
	private String issms;

	@TableField(value = "createdate")
	private Date createDate;

	@TableField(value = "updatedate")
	private Date updateDate;

	@TableField(value = "userdesc")
	private String userDesc;

	@TableField(value = "usertype")
	private Integer userType;

	private static final long serialVersionUID = 7413120084972335265L;
}
