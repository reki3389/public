package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

public class LambdaExample1 {
	private static int[] scores = {10, 50, 3};
	
	public static int maxOrMin(IntBinaryOperator oper) {
		int result = scores[0];
		for(int score : scores) {
			result = oper.applyAsInt(result, score);
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		int max = maxOrMin((a, b) -> {
			return (a >= b ? a : b);
		});
		
		System.out.println("max :" + max);
		
		int min = maxOrMin((a, b) -> {
			return (a <= b ? a : b);
		
		});
		System.out.println("min : " + min);
	}
}
