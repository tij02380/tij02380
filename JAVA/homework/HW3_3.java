import java.util.Scanner;


public class HW3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int sum1=-3;
		int sum2=1;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1���� ū �� �ڿ��� �ϳ��� �Է� : ");
		n = sc.nextInt();
		
		if(n%2==0)
		{
			System.out.print("1^2-2^2");
			for(int i=3; i<=n; i++)
			{
				System.out.print("+"+i+"^2");
				sum1=sum1+i*i;
				i++;
				System.out.print("-"+i+"^2");
				sum1=sum1-i*i;

			}
			System.out.printf("=%d",sum1);
		}
		else
		{
			System.out.print("1^2");
			for(int i=2; i<=n; i++)
			{
				System.out.print("-"+i+"^2");
				sum2=sum2-i*i;
				i++;
				System.out.print("+"+i+"^2");
				sum2=sum2+i*i;
				
			}
			System.out.printf("=%d",sum2);
		}
			
	}

}
