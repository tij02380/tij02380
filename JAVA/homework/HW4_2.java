import java.util.Scanner;

class Information {
	private String name;
	private int age;
	private double grade;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		name = sc.next();
		System.out.print("���� : ");
		age = sc.nextInt();
		System.out.print("���� : ");
		grade = sc.nextDouble();
	}
	
	public void output() {
		System.out.printf("�̸��� %s, ���̴� %d��, ������ %.2f�����Դϴ�.", name, age, grade);
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
