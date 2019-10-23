package com.yedam.lambda;

import java.util.function.ToIntFunction;

public class LamdbaExample2 {
	private static Student[] student = { new Student("홍길동", 90, 96), new Student("신용권", 95, 93) };

	public static double avg(ToIntFunction<Student> function) {
		int cnt = 0;
		int sumen = 0;
		for (Student student : student) {
			cnt++;
			sumen += function.applyAsInt(student);
		}
		double avg = (double) sumen / cnt;
		return avg;
	}

	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("영어 평균 점수 : " + englishAvg);
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균 점수 : " + mathAvg);
	}

	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;

		public Student(String name, int englishScore, int mathScore) {
			super();
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}

		public String getName() {
			return name;
		}

		public int getEnglishScore() {
			return englishScore;
		}

		public int getMathScore() {
			return mathScore;
		}
	}
}
