import java.util.Scanner;


public class HW4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int dan = 2;
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 입력 : (1~8)");
		n = sc.nextInt();
		
		if(n>0 && n<9)
		{
			for(int a=0; a<9; a++)
			{

					for(int j=1; j<10; j++)
					{
						for(int i=dan; i<=dan+n-1; i++)
						{
							System.out.printf("%d*%d = %2d   ",i,j,i*j);
							if(i<9) continue;
							else break;
						}
						System.out.println();
					}

					if(dan<=9-n)
						dan+=n;
					else
						break;
					System.out.println();
			}
		}
		else
			System.out.print("잘못입력하셨습니다.");
		
	}

}

