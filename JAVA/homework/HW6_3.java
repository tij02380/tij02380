
public class HW6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		EquilateralTriangle e = new EquilateralTriangle();
		c.around(12.57);
		c.area(12.57);
		c.radius(2.00);
		e.around(6.00);
		e.area(1.73);
		e.length(2.00);
		e.height(1.73);
		System.out.println(c);
		System.out.println(e);
	}
}

class Figure {
	double around;
	double area;
	public void around(double a) {
		around = a;
	}
	public void area(double b) {
		area = b;
	}
}

class Circle extends Figure {
	double radius;
	public void radius(double c) {
		radius = c;
	}
	public String toString(){
		return "�� ������ Circle�̰�, �ѷ��� " + around + ", ���̴� " + area + "�Դϴ�.\n"
				+ "�� ���� �������� " + radius +"�Դϴ�.";
	}
}

class EquilateralTriangle extends Figure {
	double length;
	double height;
	public void length(double d) {
		length = d;
	}
	public void height(double e) {
		height = e;
	}
	public String toString(){
		return "�� ������ EquilateralTriangle�̰�, �ѷ��� " + around + ", ���̴� " + area + "�Դϴ�.\n"
				+ "�� �ﰢ���� �Ѻ��� ���̴� " + length +"�̰�, ���̴� " + height + "�Դϴ�.";
	}
}