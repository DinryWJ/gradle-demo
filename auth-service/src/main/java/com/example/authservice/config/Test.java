package com.example.authservice.config;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * @author 吴佳杰
 * @date 2023/1/9 14:27
 */
public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String encode = URLEncoder.encode("2022-12-12 10:10:10", "GBK");
        System.out.println(encode);

    }
}
