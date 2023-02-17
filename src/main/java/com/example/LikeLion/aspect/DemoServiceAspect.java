package com.example.LikeLion.aspect;

import com.example.LikeLion.service.impl.DepartmentDtoServiceImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class DemoServiceAspect {
    private Logger logger = LoggerFactory.getLogger(DemoServiceAspect.class);

    @Before("execution(* com.example.LikeLion.controller.*.*(..))")
    public void before(JoinPoint joinPoint) {
        logger.info("Before called: " + joinPoint.toString());
    }

    @After("execution(* com.example.LikeLion.controller.*.*(..))")
    public void after(JoinPoint joinPoint) {
        logger.info("After called: " + joinPoint.toString());
    }

    @AfterThrowing("execution(* com.example.LikeLion.controller.*.*(..))")
    public void afterThrowing(JoinPoint joinPoint) {
        logger.info("After throwing called: " + joinPoint.toString());
    }
}
