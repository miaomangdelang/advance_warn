package com.advance_warn.exception;

import com.advance_warn.constant.ApplicationErrorConstant;
import com.advance_warn.model.OperationResult;
import com.advance_warn.util.ConfigPropertiesReader;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.List;

/**
 * 异常信息处理
 *
 * @Author Join.Yao
 * @Version 1.0.0
 * @CreateTime 2020年02月14日 14:08
 */
@Slf4j
@Order(-1)
@ControllerAdvice(annotations = {Controller.class, RestController.class})
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public OperationResult exceptionHandler(Exception e) {
        String errorStack = getErrorStack(e);
        log.error(errorStack);
        String originMsg = e.getMessage();
        String tempMsg = ConfigPropertiesReader.getPropertyValue(e.getMessage());
        if (StringUtils.isNotBlank(tempMsg)) {
            return new OperationResult(originMsg, tempMsg);
        } else {
            String errorMsg = ConfigPropertiesReader.getPropertyValue(ApplicationErrorConstant.SYSTEM_ERROR_CODE);
            return new OperationResult(ApplicationErrorConstant.SYSTEM_ERROR_CODE, errorMsg);
        }
    }

    /**
     * 参数校验框架
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseBody
    public OperationResult methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        List<ObjectError> errors = e.getBindingResult().getAllErrors();
        return new OperationResult(ApplicationErrorConstant.SYSTEM_ERROR_CODE, getValidMsg(errors, e));
    }

    /**
     * 参数校验框架: @NotBlank
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = BindException.class)
    @ResponseBody
    public OperationResult bindExceptionHandler(BindException e) {
        List<ObjectError> errors = e.getBindingResult().getAllErrors();
        return new OperationResult(ApplicationErrorConstant.SYSTEM_ERROR_CODE, getValidMsg(errors, e));
    }

    /**
     * 获取校验框架错误信息
     *
     * @param errors
     * @return
     */
    private String getValidMsg(List<ObjectError> errors, Exception e) {
        StringBuffer errorMsg = new StringBuffer();
        for (ObjectError error : errors) {
            errorMsg.append(error.getDefaultMessage());
            errorMsg.append("|");
        }
        String errorStack = getErrorStack(e);
        log.error(errorStack);
        return errorMsg.substring(0, errorMsg.length() - 1);
    }

    /**
     * 获取异常详细信息
     *
     * @param e
     * @return
     */
    private static String getErrorStack(Exception e) {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(bo);
        e.printStackTrace(ps);
        String errorStack = new String(bo.toByteArray(), Charset.defaultCharset());
        return errorStack;
    }

}