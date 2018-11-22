
public class HW7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal[]={new Cat("�����"), new Dolphin("����"), new Dove("��ѱ�")};
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
		System.out.println("����" +cat + "�̰�, �޸��ϴ�." );
	}
};

class Dolphin extends Animal {
	String dolphin;
	public Dolphin(String d) {
		dolphin=d;
	}
	public void move() {
		System.out.println("����" + dolphin + "�̰�, �����մϴ�."  );
	}
};

class Dove extends Animal {
	String dove;
	public Dove(String d) {
		dove = d;
	}
	public void move() {
		System.out.println("����" + dove + "�̰�, ���ƴٴմϴ�."  );
	}
};