
public class HW7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal[]={new Cat("고양이"), new Dolphin("돌고래"), new Dove("비둘기")};
		for(Animal a: animal)
			a.move();
	}

}

abstract class Animal {
	public abstract void move();
};

class Cat extends Animal{
	String cat;
	public Cat(String c) {
		cat = c;
	}
	public void move() {
		System.out.println("나는" +cat + "이고, 달립니다." );
	}
};

class Dolphin extends Animal {
	String dolphin;
	public Dolphin(String d) {
		dolphin=d;
	}
	public void move() {
		System.out.println("나는" + dolphin + "이고, 수영합니다."  );
	}
};

class Dove extends Animal {
	String dove;
	public Dove(String d) {
		dove = d;
	}
	public void move() {
		System.out.println("나는" + dove + "이고, 날아다닙니다."  );
	}
};