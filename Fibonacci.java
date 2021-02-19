package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	
	public void run() {
		int fib = 0;
		int fib1 = 1;
		int sumofprev = fib+fib1;
		
		println("This program prints the fibonacci sequence.");
	    
		 
		 while (fib+fib1 < MAX_VALUE) {
			 sumofprev = fib+fib1;
			 fib = fib1;
			 fib1 = sumofprev;
			 println(sumofprev);
			}
		 
		 } 
	private static final int MAX_VALUE = 10000;
}
