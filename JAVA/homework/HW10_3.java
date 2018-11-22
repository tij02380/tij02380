import java.util.Vector;

public class HW10_3 {

	public static void main(String[] args) throws DoNotCarryException{
		// TODO Auto-generated method stub
		Vector vc = new Vector();
		vc.add(new Circle("가방1",12.2, 14.6, 10.2, true)); //이름,지름,높이,무게,바퀴
		vc.add(new Circle("가방2",8.5, 10.4, 25.4, false));
		vc.add(new Square("가방3",14.3, 20.8, 18.7, 23.2, true));//이름,가로,세로,높이,무게,바퀴
		vc.add(new Square("가방4",13.1, 16.5, 17.0, 18.2, false));
		
		for(int i = 0; i<4;i++) {
			Bag b = (Bag)vc.get(i);
			try{
				b.len();
				if(b.len()==false) throw new DoNotCarryException();
				b.weight();
				if(b.weight()==false) throw new DoNotCarryException();
				b.wheel();
				if(b.len()==true && b.wheel()==true)
					System.out.println(b.name + "은 기내에 들고 타실 수 있습니다.");
				if(b.weight() == true)
					System.out.println(b.name + "은 화물칸에 실을 수 있습니다.");
			}
			catch (DoNotCarryException dnce) {
				System.out.print(b.name+"은 ");
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
class Circle extends Bag { //원기둥 가방
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
class Square extends Bag { //사각기둥 가방
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
		super("가방의 크기나 무게가 적절하지 않습니다.");
	}
}