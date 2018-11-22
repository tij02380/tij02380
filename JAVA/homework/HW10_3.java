import java.util.Vector;

public class HW10_3 {

	public static void main(String[] args) throws DoNotCarryException{
		// TODO Auto-generated method stub
		Vector vc = new Vector();
		vc.add(new Circle("����1",12.2, 14.6, 10.2, true)); //�̸�,����,����,����,����
		vc.add(new Circle("����2",8.5, 10.4, 25.4, false));
		vc.add(new Square("����3",14.3, 20.8, 18.7, 23.2, true));//�̸�,����,����,����,����,����
		vc.add(new Square("����4",13.1, 16.5, 17.0, 18.2, false));
		
		for(int i = 0; i<4;i++) {
			Bag b = (Bag)vc.get(i);
			try{
				b.len();
				if(b.len()==false) throw new DoNotCarryException();
				b.weight();
				if(b.weight()==false) throw new DoNotCarryException();
				b.wheel();
				if(b.len()==true && b.wheel()==true)
					System.out.println(b.name + "�� �⳻�� ��� Ÿ�� �� �ֽ��ϴ�.");
				if(b.weight() == true)
					System.out.println(b.name + "�� ȭ��ĭ�� ���� �� �ֽ��ϴ�.");
			}
			catch (DoNotCarryException dnce) {
				System.out.print(b.name+"�� ");
				System.out.println(dnce);
			}
		}

	}
}

abstract class Bag {
	String name;
	double hight, weight;
	boolean t;
	Bag(String n, double h, double w, boolean t){
		name = n;
		hight = h;
		weight = w;
		this.t = t;
	}
	public String toString(){
		return name;
	}
	abstract boolean len();
	abstract boolean weight();
	abstract boolean wheel();

}
class Circle extends Bag { //����� ����
	double radius;
	Circle(String n, double r, double h, double w, boolean t) {
		super(n, h, w, t);
		radius = r;
	}
	boolean len() {
		if(radius>hight && radius<=17) return true;
		else if(radius<hight && radius<=17) return true;
		else return false;
	}
	boolean weight() {
		if(weight <= 20) return true;
		else return false;
	}
	boolean wheel() {
		return t;
	}
	
}
class Square extends Bag { //�簢��� ����
	double a, b;
	Square(String n, double a, double b, double h, double w, boolean t) {
		super(n, h, w, t);
		this.a = a;
		this.b = b;
	}
	boolean len() {
		double max;
		max = a;
		max = (max<b? b : max);
		max = (max<hight? hight : max);
		if(max<=17) return true;
		else return false;
	}
	boolean weight() {
		if(weight <= 20) return true;
		else return false;
	}
	boolean wheel() {
		return t;
	}
	
}

class DoNotCarryException extends Exception {
	DoNotCarryException() {
		super("������ ũ�⳪ ���԰� �������� �ʽ��ϴ�.");
	}
}