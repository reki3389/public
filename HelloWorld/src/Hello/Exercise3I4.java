package Hello;

public class Exercise3I4 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		//�л� �� ���� ������ ���� ��
		int pencilsPerStudent = (pencils / students); // ---- �л��Ѹ��� ������ ���� ���ϴ� ����� ���� ������ �л�
		System.out.println(pencilsPerStudent);
		
		//���� ���� ��
		int pencilsLeft = (pencils % students); // ---- ���� ���ʼ��� ��������� %�� ������ �л����� ���� ���� ���� �� 
		System.out.println(pencilsLeft);
	}
}
