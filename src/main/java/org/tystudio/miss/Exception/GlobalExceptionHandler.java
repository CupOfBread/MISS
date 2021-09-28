package org.tystudio.miss.Exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.tystudio.miss.component.RetResponse;

import java.io.IOException;

/**
 * <p>
 * 全局异常控制
 * </p>
 *
 * @author Cup Of Bread
 * @since 2021-09-28
 */

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
    public RetResponse RequestMethodNotSupported(HttpRequestMethodNotSupportedException e) {
        return new RetResponse().makeErrRsp(100, "请求METHOD不支持:"+e.getCause());
    }

    @ExceptionHandler(value = NullPointerException.class)
    public RetResponse NullPointer(NullPointerException e) {
        return new RetResponse().makeErrRsp(500, "参数缺失或其他错误:" + e.getMessage());
    }

    @ExceptionHandler(value = IOException.class)
    public RetResponse IO(IOException e) {
        return new RetResponse().makeErrRsp(500, "IO错误:"+e.getCause());
    }

    @ExceptionHandler(value = DatabaseOperationException.class)
    public RetResponse NullPointer(DatabaseOperationException e) {
        return new RetResponse().makeErrRsp(500, "数据库操作异常" + e.getMessage());
    }
}
