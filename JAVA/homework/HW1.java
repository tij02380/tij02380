import java.util.Scanner;


public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1번답
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 두개를 입력하시오.");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("number    10nbr     8nbr      16nbr     ");
		System.out.printf("first     %+10d%10o%10x\n",a,a,a);
		System.out.printf("second    %+10d%10o%10x\n",b,b,b);
		System.out.printf("add       %+-10d%-10o%-10x\n",a+b,a+b,a+b);
		*/
		
		
		/* 2번답
		double a, b, d;
		int c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하시오.");
		a = sc.nextDouble();
		b = sc.nextDouble();
		System.out.println("연산자선택(1=+, 2=-, 3=* 4=% 5=/)");
		c = sc.nextInt();
		
		if(c==1)
		{
			d = a+b;
			if(d==(int)d)
				System.out.printf("두수의 덧셈 = %d", (int)d);
			else
				System.out.printf("두수의 덧셈 = %.2f", d);
		}
		else if(c==2)
		{
			d = a-b;
			if(d==(int)d)
				System.out.printf("두수의 뺄셈 = %d", (int)d);
			else
				System.out.printf("두수의 뺄셈 = %.2f", d);
		}
		else if(c==3)
		{
			d = a*b;
			if(d==(int)d)
				System.out.printf("두수의 곱셈 = %d", (int)d);
			else
				System.out.printf("두수의 곱셈 = %.2f", d);
		}
		else if(c==4)
		{
			d = a%b;
			if(d==(int)d)
				System.out.printf("두수 나누기의 나머지 = %d", (int)d);
			else
				System.out.printf("두수 나누기의 나머지 = %.2f", d);
		}
		else
		{
			d = a/b;
			if(d==(int)d)
				System.out.printf("두수의 나눗셈 = %d", (int)d);
			else
				System.out.printf("두수의 나눗셈 = %.2f", d);
		}
		*/
		
		/* 3번답
		String name;
		int age;
		double weight;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하시오");
		name = sc.nextLine();
		System.out.println("나이를 입력하시오");
		age = sc.nextInt();
		System.out.println("몸무게를 입력하시오");
		weight = sc.nextDouble();
		
		System.out.println("\"나의 이름은 \'"+name+"\',");
		System.out.printf("나이는 %#x\n", age);
		System.out.printf("\t몸무게는 %-10.3f이다.\"", weight);
		*/
	}

}
