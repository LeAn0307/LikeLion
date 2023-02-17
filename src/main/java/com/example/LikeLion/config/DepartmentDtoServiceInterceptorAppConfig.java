package com.example.LikeLion.config;

import com.example.LikeLion.interceptor.DepartmentDtoServiceInterceptor;
import com.example.LikeLion.interceptor.DepartmentDtoServiceInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class DepartmentDtoServiceInterceptorAppConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private DepartmentDtoServiceInterceptor departmentDtoServiceInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(departmentDtoServiceInterceptor);
    }
}