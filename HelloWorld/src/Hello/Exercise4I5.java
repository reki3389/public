package Hello;

public class Exercise4I5 {
	public static void main(String[] args) {
		for (int x=1; x<=10; x++) { //ù��° ������ ���� ��Ʈ x�� ���� 10���� ������ �ϸ鼭 
			for (int y=1; y<=10; y++) { //�ι�° ������ ���� ��Ʈ x�� ���� 10���� ������ �ϸ鼭
				if((4*x) + (5*y) == 60) // ��Ʈ 4x �� 5y�� ���� 60���� ���߱� ���� �� if ������ ����Ͽ� ����� ����� �� �ֵ��� �Ѵ�.
					System.out.println("("+ x + "," + y + ")"); // ��� ����� �̴´�.
						}
				}
		}
}