package com.msci.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AlarmAspect {
	@Before("execution(* Employee.sleep(..))")
	public void beforeSleeping(JoinPoint joinPoint){
		Employee emp = (Employee)joinPoint.getTarget();
		if (emp.getId() != 102)
			System.out.println("ZZZZZZZZZZZzzzzzzzzzzzzzzzzzz");
	}
	@After("execution(* Employee.work(..))")
	public void afterWork(JoinPoint joinPoint){
		Employee emp = (Employee)joinPoint.getTarget();
		if (emp.getId() != 102)
			System.out.println("101010010101010010101");
	}
	@Around("execution(* Employee.*(..))")
	public void monitorEmployee(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		Employee emp = (Employee)proceedingJoinPoint.getTarget();
		if (emp.getId() == 102){
			System.out.println("102 You are FIRED");
		}
		else{
			proceedingJoinPoint.proceed();
		}
	}
}
