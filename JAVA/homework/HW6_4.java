import java.util.Scanner;

public class HW6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, major;
		int age, number;
		double s1, s2, s3, s4, s5, s6, s7, s8;
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		name = sc.next();
		age = sc.nextInt();
		major = sc.next();
		number = sc.nextInt();
		s1 = sc.nextDouble();
		s2 = sc.nextDouble();
		s3 = sc.nextDouble();
		s4 = sc.nextDouble();
		s5 = sc.nextDouble();
		s6 = sc.nextDouble();
		s7 = sc.nextDouble();
		s8 = sc.nextDouble();
		Student s = new Student(name, age, major, number, s1, s2, s3, s4, s5, s6, s7, s8);
		System.out.println(s);
		System.out.printf("8�б� �� ��� ������ : %.4f���Դϴ�.", (s1+s2+s3+s4+s5+s6+s7+s8)/8);
	}
}

class Person {
	String name, major;
	int age, number;
}
class Student extends Person {
	double s1, s2, s3, s4, s5, s6, s7, s8;
	public Student (String a, int b, String c, int d, double e, double f, double g, double h, double i, double j, double k, double l) {
		name = a;
		age = b;
		major = c;
		number = d;
		s1 = e;
		s2 = f;
		s3 = g;
		s4 = h;
		s5 = i;
		s6 = j;
		s7 = k;
		s8 = l;
	}
	
	public String toString() {
		return "�̸� : " + name + "\n" + "���� : " + age + "\n" + "�а� : " + major + "\n"
				+ "�й� : " + number;
	}
}