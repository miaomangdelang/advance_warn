package com.advance_warn.model.input;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 所有请求入参类需要实现的基类
 *
 * @author Join.Yao
 * @date 2020年02月14日 14:08
 */
@ApiModel(value = "BaseInput", description = "请求入参类基类")
@Data
public class BaseInput implements Serializable {

    /**
     * 登录凭据
     * 注意：便于微服务网关获取用户token，已将token置于请求的HEADER中，目前只做后端单元测试
     */
    @ApiModelProperty(value = "登录凭据", example = "R8y4wzfQ6D2qXkkPp29Q1oy8hlTYHa", required = true, hidden = true)
    private String requestToken;

    /**
     * 时间戳
     */
    @ApiModelProperty(value = "时间戳", required = true, hidden = true)
    private String timestamp;

    private static final long serialVersionUID = -4629176238620554840L;

}
