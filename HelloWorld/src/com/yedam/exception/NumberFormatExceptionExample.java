package com.yedam.exception;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "a10";
		String data2 = "a20";
		
		int val1 = Integer.parseInt(data1);
		int val2 = Integer.parseInt(data2);
		System.out.println("sum:" + (val1 + val2));
	}
}
