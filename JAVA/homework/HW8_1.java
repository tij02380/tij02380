import java.util.*;

public class HW8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("�� ������ �Է��Ͻÿ�.");
			a = sc.nextInt();
			b = sc.nextInt();
			int result = a/b;
			System.out.println("���� ��� : "+ result);
		}
		catch(ArithmeticException e) {
			System.out.println("���� �߻� : ������ 0���� �Է�");
		}
		catch(InputMismatchException e1) {
			System.out.println("�����߻� : ������ �Է����� ���� ���");
		}
	}

}
