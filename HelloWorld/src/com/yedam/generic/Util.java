package com.yedam.generic;

public class Util {
	public static <T> Box<T> boxing(T t) { //메소드로 제네릭을 활용하기 위해서는 리턴값을 받을 클래스 Box<T> 로 선언해주고, 받을 매개값(메소드가 선언하는 시점)으로 선언할때 boxing(T t)로 선언함. <T>는 제네릭으로 받겠다 선언
		Box<T> box = new Box<T>();
		box.setObj(t);
		return box;
	}
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean bool1 = p1.getKey().equals(p2.getKey());
		boolean bool2 = p1.getValue().equals(p2.getValue());
		return bool1 && bool2;
	}
	
	public static <K, V> boolean compareValue(Pair<K, V> p1, Pair<K, V> p2) {
		boolean bool2 = p1.getValue().equals(p2.getValue());
		return bool2;
	}
	
	public static <T extends Number> int compare(T t1, T t2) {
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();
		return Double.compare(d1, d2);
		
	}
	
	public static Box boxing2(int a) {
		return null;
	}
}
