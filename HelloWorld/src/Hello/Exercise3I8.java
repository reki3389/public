package Hello;

public class Exercise3I8 {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		
		if (Double.isNaN(z)) { // NaN �˻� �޼ҵ带 ���� ���� NaN�̸� true�� ǥ���ϰ� 
			System.out.println("0.0���� ���� �� �����ϴ�."); // �׿� ���� ��°��� ���� ��°��� ǥ�� �Ѵ�.
		} else {
			double result = z + 10;
			System.out.println("���: " + result);
	}
}
}