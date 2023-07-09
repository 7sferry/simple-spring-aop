package app.vercel.ferry.ferryspringaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/************************
 * Made by [MR Ferry™]  *
 * on Juli 2023         *
 ************************/

@Aspect
@Configuration
public class InterceptionConfig{

	@Before("@annotation(interception)")
	public void before(Interception interception){
		System.out.println(interception.printValue());
	}

	@After("@annotation(interception)")
	public void after(Interception interception){
		System.out.println("executed");
	}

	@AfterThrowing("@annotation(interception)")
	public void afterThrowing(Interception interception){
		System.out.println("ada error");
	}

	@AfterReturning("@annotation(interception)")
	public void afterReturning(Interception interception){
		System.out.println("tidak ada error");
		System.out.println();
	}

	@Around("@annotation(interceptionAround)")
	public Object around(ProceedingJoinPoint proceedingJoinPoint, InterceptionAround interceptionAround) throws Throwable{
		System.out.println("kalkulasinya dimulai");
		Object proceed = proceedingJoinPoint.proceed();
		System.out.println("kalkulasinya selesai");
		System.out.println();
		return proceed;
	}

}
