package Hello;

public class Exercise3I7 {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		System.out.println((x>7) && (y<=5));
		// ----(true) x�� 7���� ������� �׸��� y�� 5���� �۰ų� ���� ��� �������� &&�� ����� ���� �Ѵ� ���� ��� ��
		System.out.println((x%3 == 2) || (y%2 != 1));
		//----(false) x�� 3���� ���� ������ ���� 2�� ��������(�񱳿����� ==2 �� ���� ����), y��2�� ���� ���� 1�� ����(������ != �޶�� ���̹Ƿ� Ʋ��) �׸��� ||�� �������� or�̹Ƿ� ���߿� �ϳ��� ������ �������� �Ѵ� Ʋ���� false
	}
}
