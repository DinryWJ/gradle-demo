package com.example.authservice;

import lombok.Data;
import org.springframework.http.ResponseEntity;

/**
 * @author dinry
 * @date 2022/12/20 10:42
 */
@Data
public class Response<T> {
    private Integer code;
    private String msg;
    private T data;

    private Response() {
    }

    public static <T> ResponseEntity<Response<T>> ok(T t) {
        Response<T> res = new Response<>();
        res.setCode(0);
        res.setMsg("成功");
        res.setData(t);
        return ResponseEntity.ok(res);
    }

    public static <T> ResponseEntity<Response<T>> ok() {
        Response<T> res = new Response<>();
        res.setCode(0);
        res.setMsg("成功");
        return ResponseEntity.ok(res);
    }

    public static <T> ResponseEntity<Response<T>> error(String s) {
        Response<T> res = new Response<>();
        res.setCode(1);
        res.setMsg(s);
        return ResponseEntity.ok(res);
    }
}
