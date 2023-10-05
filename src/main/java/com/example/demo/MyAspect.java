package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	@Around("execution(* com.example.demo.CanonPrinter.*(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("I,m around before");
		
		// 執行切入點的方法
		Object obj = pjp.proceed();

		System.out.println("I,m around after");
		return obj;
	}


	 
}
