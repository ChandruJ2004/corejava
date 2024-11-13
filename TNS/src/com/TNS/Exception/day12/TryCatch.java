package com.TNS.Exception.day12;

public class TryCatch {
	// performDivision - is overloaded method bcz two methods with same name but different parameters.
		static int performDivision(int x,int y) {
			System.out.println("In Method");
			int z=0;
			try {//the code inside this block will execute until an exception occurs.
				System.out.println("In Try block");
				z=x/y;// if y=0,ArithmeticException will occur
			}
			catch(ArithmeticException a) {//if exception occurs,catch block is executed
				System.out.println("In catch Block"+a.getMessage());
			}
			return z;
		}
		static float performDivision(float a,float b) {
			return a/b;
		}
}
