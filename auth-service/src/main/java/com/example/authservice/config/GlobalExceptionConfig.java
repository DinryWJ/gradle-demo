package com.example.authservice.config;

import com.example.authservice.Response;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author dinry
 * @date 2022/12/20 10:38
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionConfig {

    @ExceptionHandler(StatusRuntimeException.class)
    public ResponseEntity<Response<Void>> handleException(StatusRuntimeException e) {
        log.error("调用grpc服务失败", e);
        return Response.error("系统异常，请稍后再试");
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response<Void>> handleException(Exception e) {
        return Response.error(e.getMessage());
    }

}
