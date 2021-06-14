package com.advance_warn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.ArrayList;
import java.util.List;

/**
 * 读取指定的properties文件
 *
 * @Author Join.Yao
 * @CreateTime 2020年03月27日 10:46
 * @Version 1.0.0
 */
@Configuration
public class PropertiesReaderConfig {

	@Bean
	public ResourceBundleMessageSource messageSource(){
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		List<String> baseNames = new ArrayList<>();
		messageSource.setDefaultEncoding("utf-8");

		baseNames.add("application-errors");
		messageSource.setBasenames(baseNames.toArray(new String[baseNames.size()]));
		return messageSource;
	}
}
