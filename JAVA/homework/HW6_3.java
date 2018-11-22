
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
		return "이 도형은 Circle이고, 둘레는 " + around + ", 넓이는 " + area + "입니다.\n"
				+ "이 원의 반지름은 " + radius +"입니다.";
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
		return "이 도형은 EquilateralTriangle이고, 둘레는 " + around + ", 넓이는 " + area + "입니다.\n"
				+ "이 삼각형의 한변의 길이는 " + length +"이고, 높이는 " + height + "입니다.";
	}
}