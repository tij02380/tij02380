import java.util.Scanner;


public class HW4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String type;
		int n,a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("도형의 타입입력 : ");
		type = sc.next();
		
		if(type.equals("피라미드"))
		{
			while(true)
			{
				System.out.print("출력할 줄 수 입력 : ");
				n = sc.nextInt();
				
				if(n>0)
				{
					for(int i=0; i<n; i++)
					{
						for(int j=n-1; j>i; j--)
							System.out.print(" ");
						for(int k=i; k>=0; k--)
							System.out.printf("%d", k);
						for(int l=1; l<=i; l++)
							System.out.printf("%d", l);
						System.out.println();
					}
					break;
				}
				else
					System.out.println("잘못된 값 입력");
			}
		}
		else if(type.equals("사각형"))
		{
			while(true)
			{
				System.out.print("가로, 세로, 반복횟수 입력");
				a = sc.nextInt();
				b = sc.nextInt();
				n = sc.nextInt();
				
				if(a>0 && b>0 && n>0)
				{
					for(int i=0; i<b; i++)
					{
						for(int j=0; j<n; j++)
						{
							for(int k=0; k<a; k++)
								System.out.print("*");
							System.out.print(" ");
						}
						System.out.println();
					}
					break;
				}
				else
					System.out.println("잘못된 값 입력");
			}
		}
		else if(type.equals("다이아몬드"))
		{
			while(true)
			{
				System.out.print("출력할 줄 수 입력");
				n = sc.nextInt();
				
				if(n>0 && n%2!=0)
				{
					for(int i=0; i<n; i+=2)
					{
						for(int j=n-2; j>i; j-=2)
							System.out.print(" ");
						for(int k=0; k<=i; k++)
							System.out.print("*");
						System.out.println();
					}
					for(int l=1; l<n; l+=2)
					{
						for(int m=0; m<l; m+=2)
							System.out.print(" ");
						for(int o=n-2; o>=l; o--)
							System.out.print("*");
						System.out.println();
					}
					
					break;
				}
				else
					System.out.println("잘못된 값 입력");
			}
		}
		else
			System.out.print("잘못된 타입 입력");
	}

}
