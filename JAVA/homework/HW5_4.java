
public class HW5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player();
		p1.setName("ȫ�浿");
		
		Player p2 = new Player();
		p2.setName("�����");
		//����� �̸��� �Է� ������� ������ ������ ������ ���� ����ó�� ���Ƿ� ������
		
		System.out.printf("1ȸ�� ��� : %s(%d), %s(%d)\n", p1.getName(),p1.number1(),p2.getName(),p2.number1());
		System.out.printf("2ȸ�� ��� : %s(%d), %s(%d)\n", p1.getName(),p1.number2(),p2.getName(),p2.number2());
		System.out.println("�������");
		if(p1.getN()>p2.getN())
		{
			System.out.printf("���� : %s(%d)\n",p1.getName(),p1.getN());
			System.out.printf("���� : %s(%d)\n",p2.getName(),p2.getN());
		}
		else if(p1.getN()<p2.getN())
		{
			System.out.printf("���� : %s(%d)\n",p2.getName(),p2.getN());
			System.out.printf("���� : %s(%d)\n",p1.getName(),p1.getN());
		}
		else
			System.out.printf("�����ϴ� : %s(%d) = %s(%d)\n",p1.getName(),p1.getN(),p2.getName(),p2.getN());
	}

}

class Player {
	private String name;
	private int n;
	
	public String getName() {
		return name;
	}
	public void setName(String a) {
		name = a;
	}
	
	public int number1() {
		return n =(int)(Math.random()*6)+1;
	}
	public int number2() {
		int b= (int)(Math.random()*6)+1;
		n += b;
		return b;
	}
	public int getN() {
		return n;
	}
	
	
}