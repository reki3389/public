package Hello;

public class Exercise4I4 {
	public static void main(String[] args) {
		int sum = 0; // sum ���� ��ó�� 0���� �ְ�
		while (true) { // while���� ���� ���� ���� �������� �Ҷ�
		int num1 = (int) (Math.random()*6) +1; //num1�� �ֻ����� ���� ���ڸ� �̾� 
		int num2 = (int) (Math.random()*6) +1; //num2�� �ֻ����� ���� ���ڸ� �̾�
		System.out.println("(" + num1 + "," + num2 + ")"); // �� �ֻ����� ���� ���ڸ� �̴´�.
		sum = num1 + num2; // �׸��� �� ���ڸ� ���ؼ�
		if (sum == 5) { // �հ谡 5�� �Ǹ� 
			break; // �극��ũ���� ����ؼ� ����
						}
				}
		}
}
