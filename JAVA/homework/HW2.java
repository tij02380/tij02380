import java.util.Scanner;


public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1�� ��
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� : ");
		a = sc.nextInt();
		b = ~a+0b1;
		
		if((a >> 31)==0)
		{
			System.out.printf("\"%d�� ������ %d�̰�,\n", a, a);
			System.out.printf("\t�� ���� 8�� ���� ���� %d�̰�,\n", (int)(a >> 3));
			System.out.printf("\t\t�������� %d�Դϴ�.\"", (int)(a & 0b111));
		}
		else
		{
			System.out.printf("\"%d�� ������ %d�̰�,\n", a, (int)b);
			System.out.printf("\t�� ���� 8�� ���� ���� %d�̰�,\n", (int)(b >> 3));
			System.out.printf("\t\t�������� %d�Դϴ�.\"", (int)(b & 0b111));
		}
		*/
		
		/* 2�� ��
		double a,b,c,d;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�밢���� �̷�� ���� ����, ������ ��ǥ �����Ͽ� �Է�.");
		System.out.print("���� �밢���� ��ǥ �Է� : (x1 y1)");
		a = sc.nextDouble();
		b = sc.nextDouble();
		System.out.print("������ �밢���� ��ǥ �Է� : (x2 y2)");
		c = sc.nextDouble();
		d = sc.nextDouble();
		// �Ǽ� ��ǥ���� ��� �� �밢���� ������ ���� ���簢���� ����(a^2+b^2=r^2)
		// �� �߿��� �Էµ� ��ǥ���� x,y�������� ������ ������ ���� ����� ���簢���� ������ �̿�
		
		if(a!=c && b!=d)
		{
			if((d-b)>0)
			{
				System.out.printf("�ѷ��� ���� : %.1f\n", 2*(c-a)+2*(d-b));
				System.out.printf("���� : %.1f", (c-a)*(d-b));
			}
			else
			{
				System.out.printf("�ѷ��� ���� : %.1f\n", 2*(c-a)+2*(b-d));
				System.out.printf("���� : %.1f", (c-a)*(b-d));
			}
		}
		else
			System.out.printf("���簢���� ������ �������� �ʽ��ϴ�.");
		*/
		
		
		/*3�� ��
		double hight;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű�� �Է��Ͻÿ�(cm) : ");
		hight = sc.nextDouble();
		
		System.out.printf("\n");
		System.out.printf("%.2fcm�� %.2f feet�̰�,\n", hight, hight/2.54/12);
		System.out.printf("%.2fcm�� %.2f inch�Դϴ�.", hight, hight/2.54);
		*/
		
		/* 4�� ��
		double radius, hight;
		final double PI = 3.14;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ظ��� �������� �Է��Ͻÿ�(cm) : ");
		radius = sc.nextDouble();
		System.out.print("������� ���̸� �Է��Ͻÿ�(cm) : ");
		hight = sc.nextDouble();
		
		System.out.printf("\n");
		System.out.printf("�ظ��� �������� %.1fcm�̰� ���̰� %.2fcm��,\n", radius, hight);
		System.out.printf("������� ���Ǵ� %.2f���Դϴ�.", PI*radius*radius*hight);
		*/
	}

}
