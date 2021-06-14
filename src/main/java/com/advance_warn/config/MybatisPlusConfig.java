package com.advance_warn.config;

/**
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/11 14:12
 */

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * mybatis plus配置
 *
 * @Author Join.Yao
 * @Version 1.0.0
 * @CreateTime 2020年02月14日 14:08
 */
@Configuration
@MapperScan("com.advance_warn.dao*")
public class MybatisPlusConfig {

	/**
	 * 分页插件
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor().setDialectType("mysql");
	}
}
