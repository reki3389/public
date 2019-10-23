package com.yedam.collections.tree;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		if (this.age > o.age)
			return 1;
		else if (this.age == o.age)
			return 0;
		else
			return -1;
	}

}

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> tSet = new TreeSet<>();
		tSet.add(new Person("aaa", 30));
		tSet.add(new Person("bbbb", 25));
		tSet.add(new Person("cc", 35));
		
		Iterator<Person> iter = tSet.iterator();
		while(iter.hasNext()) { // person의 인스턴스에 데이터를 가져올수 있는지를 체크하는 구문
			Person p = iter.next(); // 
			System.out.println(p.name + ", " + p.age);
		}
	}
}
