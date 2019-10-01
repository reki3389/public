package com.yedam.generic;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> Pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> ChildPair = new ChildPair<>("홍삼원", 20);
		Integer ChildAge = Util.getValue(Childpair, 홍삼순);
		System.out.println(ChildAge);
		
		/*OtherPair<String, Integer> otherPair = new OtherPair<>("홍삼원", 20);
		 //OtherPair는 Pair를 상속하지 않으므로 예외가 발생해야 합니다.
		 int otherAge = Util.getValue(otherPair, "홍삼원");
		 System.out.println(otherAge);*/
	}
}
