// 1������ ���ǹ� (if��, switch��), �ݸ� (for��, while��, do-while��)
// 2������  2�� switch������ ����� �� �ִ� ������ Ÿ���� int, double�� �� �� �ִ�. X double�� �Ǽ� Ÿ���̹Ƿ� switch������ ��� �Ұ�

package Hello;

public class Exercise4I3 {
	public static void main(String[] args) {
		int a = 0;
		for(int i=0; i<=100; i+=3) {
			//if(i%3==0) //i�� 3���� ���� ���� 0���� �������� ���� ã�´�.
				a+=i; } //a�� 0�̹Ƿ� i�� ���� 100���� ī��Ʈ �ɵ��� 3���� �������� 0���� �������� ���ڸ� üũ�ؼ� += ���Կ����ڸ� �̿��Ͽ� �� ���� ���Ѵ�.
				System.out.println(a); //�׷��� 3�� ����� ���� a�� ���´�.
		}
	}
