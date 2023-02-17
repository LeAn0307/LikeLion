package com.example.LikeLion.config;

import com.example.LikeLion.interceptor.EmployeeDtoServiceInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class EmployeeDtoServiceInterceptorAppConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private EmployeeDtoServiceInterceptor employeeDtoServiceInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(employeeDtoServiceInterceptor);
    }
}
