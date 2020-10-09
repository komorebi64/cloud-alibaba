package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 该控制器用于在沙箱环境中的健康检查使用，请勿删除
 *
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@RestController
public class SandboxCommonController {

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/health_check")
    public String healthCheck() {
        return "ok";
    }

    @RequestMapping("/app_name")
    public String appName() {
        return "your app name : " + appName;
    }
}