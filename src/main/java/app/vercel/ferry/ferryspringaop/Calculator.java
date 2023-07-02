package app.vercel.ferry.ferryspringaop;

import org.springframework.stereotype.Component;

/************************
 * Made by [MR Ferry™]  *
 * on Juli 2023         *
 ************************/

@Component
public class Calculator{

	@Interception(printValue = "penambahan")
	public int add(int x, int y){
		int result = x + y;
		System.out.println("x + y = " + result);
		return result;
	}

	@Interception(printValue = "pengurangan")
	public int subtract(int x, int y){
		int result = x - y;
		System.out.println("x - y = " + result);
		return result;
	}

	@Interception(printValue = "pembagian")
	public int divide(int x, int y){
		int result = x / y;
		System.out.println("x - y = " + result);
		return result;
	}

	@InterceptionAround
	public int multiply(int x, int y){
		int result = x * y;
		System.out.println("x * y = " + result);
		return result;
	}

}
