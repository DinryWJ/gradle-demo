package com.example.user.config;

import io.grpc.Status;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;

/**
 * @author dinry
 * @date 2022/12/19 16:44
 */
@Slf4j
@GrpcAdvice
public class GrpcExceptionConfig {
    @GrpcExceptionHandler
    public Status handleRuntimeException(RuntimeException e) {
        log.error("系统异常", e);
        return Status.INTERNAL.withDescription(e.getMessage()).withCause(e);
    }
}
