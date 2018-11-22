import java.util.*;

public class HW8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("두 정수를 입력하시오.");
			a = sc.nextInt();
			b = sc.nextInt();
			int result = a/b;
			System.out.println("나눈 결과 : "+ result);
		}
		catch(ArithmeticException e) {
			System.out.println("오류 발생 : 제수를 0으로 입력");
		}
		catch(InputMismatchException e1) {
			System.out.println("오류발생 : 정수를 입력하지 않은 경우");
		}
	}

}
