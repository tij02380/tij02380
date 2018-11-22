
public class HW5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player();
		p1.setName("홍길동");
		
		Player p2 = new Player();
		p2.setName("장발장");
		//사용자 이름을 입력 받으라는 조건이 없었기 때문에 문제 예시처럼 임의로 지정함
		
		System.out.printf("1회차 결과 : %s(%d), %s(%d)\n", p1.getName(),p1.number1(),p2.getName(),p2.number1());
		System.out.printf("2회차 결과 : %s(%d), %s(%d)\n", p1.getName(),p1.number2(),p2.getName(),p2.number2());
		System.out.println("최종결과");
		if(p1.getN()>p2.getN())
		{
			System.out.printf("승자 : %s(%d)\n",p1.getName(),p1.getN());
			System.out.printf("패자 : %s(%d)\n",p2.getName(),p2.getN());
		}
		else if(p1.getN()<p2.getN())
		{
			System.out.printf("승자 : %s(%d)\n",p2.getName(),p2.getN());
			System.out.printf("패자 : %s(%d)\n",p1.getName(),p1.getN());
		}
		else
			System.out.printf("비겼습니다 : %s(%d) = %s(%d)\n",p1.getName(),p1.getN(),p2.getName(),p2.getN());
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