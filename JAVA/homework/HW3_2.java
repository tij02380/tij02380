import java.util.Scanner;


public class HW3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int n=0;
		double sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("�����Է� : ");
			a = sc.nextInt();
			if(a%2==0 || a%7==0) continue;
			if(a==1111) break;
			sum+=a;
			n++;
		}
		if(sum==0)
			System.out.printf("����� ������� ���Ͽ����ϴ�.");
		else
			System.out.printf("��� : %.1f",sum/n);

	}

}
