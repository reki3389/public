package com.yedam.generic;

public class CompareMethod {
	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<>("apple", 10);
		Pair<String, Integer> p2 = new Pair<>("apple", 10);
		boolean result = Util.compare(p1, p2);
		if(result)
			System.out.println("두 객체가 논리적으로 동일함.");
		else
			System.out.println("두 객체가 논리적으로 동일하지 않음.");
		
		System.out.println("-----------------------------------");
		
		Pair<String, String> p3 = new Pair<>("user1", "orange");
		Pair<String, String> p4 = new Pair<>("user1", "oragen");
		result = Util.compare(p3, p4);
		if(result)
			System.out.println("두 객체가 논리적으로 동일함.");
		else
			System.out.println("두 객체가 논리적으로 동일하지 않음.");
		
//		("user1", "orange");
//		("user1", "orange");
		
		System.out.println("-----------------------------------");
		
		Pair<String, Integer> p5 = new Pair<>("oragne", 10);
		Pair<String, Integer> p6 = new Pair<>("apple", 10);
		Pair<String, String> p7 = new Pair<>("orange", "good");
		Pair<String, String> p8 = new Pair<>("apple", "good");
		result = Util.compareValue(p5, p6);
		if(result)
			System.out.println("두 객체가 논리적으로 동일함.");
		else
			System.out.println("두 객체가 논리적으로 동일하지 않음.");
		
		System.out.println("-----------------------------------");
		boolean result1 = Util.compareValue(p7, p8);
		if(result1)
			System.out.println("두 객체가 논리적으로 동일함.");
		else
			System.out.println("두 객체가 논리적으로 동일하지 않음.");
		
		Integer intV1 = Util.compare(12.2, 2.3);
		System.out.println(intV1);
		}
}
