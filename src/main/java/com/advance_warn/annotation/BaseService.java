package com.advance_warn.annotation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.*;

/**
 * 服务注解
 *
 * @Author Join.Yao
 * @Version 1.0.0
 * @CreateTime 2020年02月14日 14:08
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Transactional(rollbackFor = {Exception.class})
@Documented
@Service
public @interface BaseService {

    String value() default "";
}
