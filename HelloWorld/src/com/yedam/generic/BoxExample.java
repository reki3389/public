package com.yedam.generic;

public class BoxExample {
	public static void main(String[] args) {

		Box box = new Box();
		box.setObj(new String("Hello"));
		String strValue = (String) box.getObj();
		System.out.println(strValue);
		box.setObj(new Integer(10));
		int intValue = (int) box.getObj();
		System.out.println(intValue);
		
		box.setObj(new Double(1.1));
		String newStr = (String) box.getObj();
		
	}
}
