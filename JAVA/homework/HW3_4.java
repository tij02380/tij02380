import java.util.Scanner;


public class HW3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double score;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		score = sc.nextDouble();
		
		if(score>=90)
			System.out.print("\'��\'");
		else if(score>=80)
			System.out.print("\'��\'");
		else if(score>=70)
			System.out.print("\'��\'");
		else if(score>=60)
			System.out.print("\'��\'");
		else
			System.out.print("\'��\'");
	}

}
