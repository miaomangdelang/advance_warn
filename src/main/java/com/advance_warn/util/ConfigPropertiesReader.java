package com.advance_warn.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.NoSuchMessageException;
import org.springframework.stereotype.Component;

/**
 * 系统中一些特定的.properties文件中定义的信息提取工具<br>
 * error定义.properties，业务信息定义.properties
 *
 * @Author Join.Yao
 * @Version 1.0.0
 * @CreateTime 2020年02月14日 14:08
 */
@Component
public class ConfigPropertiesReader implements ApplicationContextAware {

    /**
     * Spring ApplicationContext
     */
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        ConfigPropertiesReader.applicationContext = applicationContext;
    }

    /**
     * 获取配置值
     *
     * @param code
     * @return
     */
    public static final String getPropertyValue(String code) {
        try {
            return applicationContext.getMessage(code, null, null);
        } catch (NoSuchMessageException e) {
            return null;
        }
    }

    /**
     * 获取配置值
     *
     * @param code         配置值名称
     * @param defaultValue 配制中不存在时的默认值
     * @return
     */
    public static final String getPropertyValue(String code, String defaultValue) {
        try {
            return applicationContext.getMessage(code, null, defaultValue, null);
        } catch (NoSuchMessageException e) {
            return null;
        }
    }

    /**
     * 获取配置值
     *
     * @param code             配置值名称
     * @param placeHolderValue 配置值占位符实际值
     * @return
     */
    public static final String getPropertyValue(String code, Object[] placeHolderValue) {
        try {
            return applicationContext.getMessage(code, placeHolderValue, null);
        } catch (NoSuchMessageException e) {
            return null;
        }
    }

    /**
     * 获取配置值
     *
     * @param code             配置值名称
     * @param defaultValue     如果配置文件中没有找到时,要设置的默认值
     * @param placeHolderValue 配置值占位符实际值
     * @return
     */
    public static final String getPropertyValue(String code, String defaultValue, Object[] placeHolderValue) {
        try {
            return applicationContext.getMessage(code, placeHolderValue, defaultValue, null);
        } catch (NoSuchMessageException e) {
            return null;
        }
    }

}
