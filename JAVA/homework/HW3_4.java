import java.util.Scanner;


public class HW3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double score;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		score = sc.nextDouble();
		
		if(score>=90)
			System.out.print("\'수\'");
		else if(score>=80)
			System.out.print("\'우\'");
		else if(score>=70)
			System.out.print("\'미\'");
		else if(score>=60)
			System.out.print("\'양\'");
		else
			System.out.print("\'가\'");
	}

}
