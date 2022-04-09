package com.toby.aop.dao;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	@Before("execution(public void addAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println("add ur mother");
	}
}
