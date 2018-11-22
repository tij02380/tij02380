import java.util.Scanner;


public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1번 답
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 입력 : ");
		a = sc.nextInt();
		b = ~a+0b1;
		
		if((a >> 31)==0)
		{
			System.out.printf("\"%d의 절댓값은 %d이고,\n", a, a);
			System.out.printf("\t그 수를 8로 나눈 몫은 %d이고,\n", (int)(a >> 3));
			System.out.printf("\t\t나머지는 %d입니다.\"", (int)(a & 0b111));
		}
		else
		{
			System.out.printf("\"%d의 절댓값은 %d이고,\n", a, (int)b);
			System.out.printf("\t그 수를 8로 나눈 몫은 %d이고,\n", (int)(b >> 3));
			System.out.printf("\t\t나머지는 %d입니다.\"", (int)(b & 0b111));
		}
		*/
		
		/* 2번 답
		double a,b,c,d;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("대각선을 이루는 점의 왼쪽, 오른쪽 좌표 구별하여 입력.");
		System.out.print("왼쪽 대각선의 좌표 입력 : (x1 y1)");
		a = sc.nextDouble();
		b = sc.nextDouble();
		System.out.print("오른쪽 대각선의 좌표 입력 : (x2 y2)");
		c = sc.nextDouble();
		d = sc.nextDouble();
		// 실수 좌표계의 경우 한 대각선당 무수히 많은 직사각형이 존재(a^2+b^2=r^2)
		// 그 중에서 입력된 좌표들의 x,y축쪽으로 내리는 수선이 만나 생기는 직사각형의 조건을 이용
		
		if(a!=c && b!=d)
		{
			if((d-b)>0)
			{
				System.out.printf("둘레의 길이 : %.1f\n", 2*(c-a)+2*(d-b));
				System.out.printf("넓이 : %.1f", (c-a)*(d-b));
			}
			else
			{
				System.out.printf("둘레의 길이 : %.1f\n", 2*(c-a)+2*(b-d));
				System.out.printf("넓이 : %.1f", (c-a)*(b-d));
			}
		}
		else
			System.out.printf("직사각형의 조건을 만족하지 않습니다.");
		*/
		
		
		/*3번 답
		double hight;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하시오(cm) : ");
		hight = sc.nextDouble();
		
		System.out.printf("\n");
		System.out.printf("%.2fcm는 %.2f feet이고,\n", hight, hight/2.54/12);
		System.out.printf("%.2fcm는 %.2f inch입니다.", hight, hight/2.54);
		*/
		
		/* 4번 답
		double radius, hight;
		final double PI = 3.14;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("밑면의 반지름을 입력하시오(cm) : ");
		radius = sc.nextDouble();
		System.out.print("원기둥의 높이를 입력하시오(cm) : ");
		hight = sc.nextDouble();
		
		System.out.printf("\n");
		System.out.printf("밑면의 반지름이 %.1fcm이고 높이가 %.2fcm인,\n", radius, hight);
		System.out.printf("원기둥의 부피는 %.2f㎤입니다.", PI*radius*radius*hight);
		*/
	}

}
