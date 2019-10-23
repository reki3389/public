package com.yedam.lambda;


interface MyLocalInterface {
	public void method();
}
public class UsingLocalVariable	{
	void method(int arg) {
		int localvar = 40;

//		arg = 31;
//		localvar = 41;

		MyLocalInterface fi= () -> {
			System.out.println("arg : " + arg);
			System.out.println("localvar : " + localvar);

		};
		fi.method();
	}
}
