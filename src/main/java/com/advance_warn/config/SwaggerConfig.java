package com.advance_warn.config;

import com.google.common.base.Predicates;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger配置
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/11 11:48
 */
@Getter
@Setter
//@Profile({"dev", "develop"})
@EnableSwagger2
@Configuration
public class SwaggerConfig {

	/**
	 * 开启swagger
	 */
	private boolean enabled = true;

	/**
	 * 应用名称
	 */
	private String title;

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.enable(enabled)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.paths(Predicates.not(PathSelectors.regex("/error.*")))
				.build();
	}

	private ApiInfo apiInfo() {
		ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder().description("后端接口说明");
		if (StringUtils.isNotBlank(this.title)) {
			apiInfoBuilder.title(this.title);
		}

		return apiInfoBuilder.build();
	}
}
