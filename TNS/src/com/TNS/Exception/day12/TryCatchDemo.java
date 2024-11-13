package com.TNS.Exception.day12;

public class TryCatchDemo {

	public static void main(String[] args) {
		System.out.println("In main method");
		int result;
		result=TryCatch.performDivision(10,0);
		if (result!=0)
			System.out.println("Div is "+result);
		System.out.println("--------------------------");
		result=TryCatch.performDivision(12,4);
		if (result!=0)
			System.out.println("division is:"+result);
		System.out.println("---------------------------------");
		System.out.println(TryCatch.performDivision(10f, 5f));
		System.out.println("---------------------------------");
		System.out.println(TryCatch.performDivision(12f , 0f));
	}

}
