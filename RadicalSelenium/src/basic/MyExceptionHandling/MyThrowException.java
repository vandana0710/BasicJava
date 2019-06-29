package basic.MyExceptionHandling;

import java.io.IOException;
import java.sql.SQLException;

public class MyThrowException {
	
	public static void result(int marks) {
		if(marks<35) {
			System.out.println("i m in if");
			throw new ArithmeticException ("Failed in Math11");
			
		} else {
			System.out.println("Welcome to next division");
			
		}
	}
	public static void main(String args[]) {
		try {
			result(33);
			
		}catch (ArithmeticException e) {
System.out.println("in catch" +e);
			
		}
		System.out.println("rest of the code.!");
		}
	}

