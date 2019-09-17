  
package Hello;

public class Exercise3I4 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudent = (pencils / students); // ---- 학생한명이 가지는 연필 구하는 출력은 연필 나누기 학생
		System.out.println(pencilsPerStudent);
		
		//남은 연필 수
		int pencilsLeft = (pencils % students); // ---- 남은 연필수는 산술연삭자 %로 연필을 학생으로 나눈 다음 남은 수 
		System.out.println(pencilsLeft);
	}
}