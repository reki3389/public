package Hello;

import java.util.Scanner; // ��ĳ�� �Լ��� �������ش�.
public class Exercise4I7 {
	public static void main(String[] args) {
		boolean run = true; // ���� ��쿡�� ��� ����� �ǰԲ� �Ѵ�.
		
		int balance = 0; // �� �ܰ� ���� ���ش�.
		
		Scanner input = new Scanner(System.in); //��ĳ�� �Լ��� ����Ͽ� ��ǲ�� �־��ִ� �Լ��� �ۼ��Ѵ�. 
		
		while(run) { //while ���� ���� ���� ��¹����� ������ش�.
			System.out.println("---------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------");
			System.out.print("����> ");
			
			int a = input.nextInt(); // ��Ʈ a�� ���� ��ǲ ���� �����Ѵ�.
			
			if(a == 1) { // if������ a�� 1�� ���ٴ� ������ ���ָ� 1�� �־����� ���� ��¹��� ������  ���ݾ��� ��µȴ�.
				System.out.print("���ݾ�> "); 
				balance += input.nextInt();// ��µ� ���ݾ��� �ݾ��� ���Կ����� += �� ���� �뷱���� �ݾ��� �������ش�.
				System.out.println("�ܾ�> " + balance);
			} else if(a == 2) { // 2�� a�� ���ٴ� ������ ���� 2�� �Է��ϸ�
				System.out.print("��ݾ�> "); // ��ݾ��� ������ 
				balance -= input.nextInt(); // �뷱���� �ִ� ���ڸ� ��ǲ���� ���ڸ� -= ���Կ����ڸ� ���� �ݾ��� �������ش�.
				System.out.println("�ܾ�> " + balance);
			} else if(a == 3) { // 3�� a�� ���ٴ� ������ ���� 3�� �Է��ϸ�
				System.out.println("�ܰ�>"+balance); // ���� �뷱���� ǥ�����ش�.
			} else if(a == 4) { // 4���� ���� run = false��� ���� ���� ������ �����Ѵ�.
			  run = false; 
			  break;
			}
		}
		System.out.println("���α׷� ����"); // 4���� �Է½� ������ ����ǰ� �������� ��°� ���α׷� ������ ���� �����´�.
	}
	
}
