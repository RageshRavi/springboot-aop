package com.rag.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ragesh on 2/3/2019.
 */
@Aspect
@Configuration
public class Configurations {
    @Before(value = "execution(* com.rag.repo.*.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println(String.format("Execution for %s", joinPoint));
        Object[] args = joinPoint.getArgs();
        System.out.println("Parameter is " + args[0].toString());
    }
}
