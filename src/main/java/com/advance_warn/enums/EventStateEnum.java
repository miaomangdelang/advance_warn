package com.advance_warn.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * 事件状态枚举
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/11 09:02
 */
@Getter
public enum EventStateEnum implements BaseEnum {

	/**
	 * 未处理
	 */
	UNTREATED(0, "未处理"),

	/**
	 * 已处理
	 */
	PROCESSED(1, "已处理");

	/**
	 * 自定义状态码
	 */
	@ApiModelProperty("算法状态码")
	@EnumValue
	private final Integer code;

	/**
	 * 算法名称
	 */
	@ApiModelProperty("算法状态名称")
	@JsonValue
	private final String name;

	EventStateEnum(Integer code, String name) {
		this.code = code;
		this.name = name;
	}

	/**
	 * 自定义JSON反序列化
	 *
	 * @param code 类型code
	 * @return {@link EventStateEnum} code所对应的枚举
	 */
	@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
	public static EventStateEnum getByCode(Integer code) {
		Optional<EventStateEnum> enumOptional = Stream.of(EventStateEnum.values()).filter(typeEnum -> typeEnum.getCode().equals(code)).findFirst();
		return enumOptional.orElse(null);
	}

}
