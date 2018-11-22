import java.util.Scanner;

class Information {
	private String name;
	private int age;
	private double grade;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("학점 : ");
		grade = sc.nextDouble();
	}
	
	public void output() {
		System.out.printf("이름은 %s, 나이는 %d세, 학점은 %.2f학점입니다.", name, age, grade);
	}
}

public class HW4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Information i = new Information();
		
		i.input();
		i.output();
	}

}
