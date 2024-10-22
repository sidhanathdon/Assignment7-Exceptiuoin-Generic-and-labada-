package exception;
//@file ExecptionHandling.java
//@author Sidhanath Verekar
//@brief This file demonstrates use of Exception handling using try, catch handling
//@Date:22/10/24
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int a = 5;
	        int b = 0;
	        try {
	            System.out.println(a / b);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero");
	        }
	        
	}

}
