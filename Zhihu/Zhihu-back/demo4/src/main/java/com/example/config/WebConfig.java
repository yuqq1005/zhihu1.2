package com.example.config;

import com.example.interceptors.Logininterceptors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private Logininterceptors logininterceptors;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
   //        registry注册器
        registry.addInterceptor(logininterceptors).excludePathPatterns("/user/login","/user/register");//注册进去
        //登录，注册不拦截，放行

    }
}
