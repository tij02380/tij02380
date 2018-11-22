import java.util.Scanner;

public class HW7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number, mode;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++)
		{
			System.out.println("서버 접속 비밀번호를 입력하시오.");
			number = sc.next();
			if(number.equals("oop"))
			{
				Homenetwork [] n = new Homenetwork[5];
				n[0] = new Gas();
				n[1] = new Boiler();
				n[2] = new Light();
				n[3] = new Cooker();
				n[4] = new Refrigerator();
				System.out.println("서버에 접속하였습니다.");
				while(true)
				{
					System.out.println("=========================");
					System.out.println("외출/귀가/종료?");
					mode = sc.next();
					if(mode.equals("외출"))
					{
						for(int j =0; j<5; j++)
							n[j].turnOff();
					}
					else if(mode.equals("귀가"))
					{
						for(int j =0; j<5; j++)
							n[j].turnOn();
					}
					else if(mode.equals("종료"))
					{
						System.out.println("홈서버와 연결을 종료합니다.");
						break;
					}
					else
						System.out.println("잘못된 입력입니다.");
				}
				break;
			}
			else
			{
				if(i==2)
					System.out.println("비밀번호를 3회 잘못입력하셨습니다.\n인증과정을 종료합니다.");
				else
					System.out.printf("비밀번호를 %d회 잘못입력하셨습니다.\n",i+1);
			}	
		}
		
	}

}

interface Homenetwork {
	public void turnOn();
	public void turnOff();
}

class Gas implements Homenetwork {
	public void turnOn()
	{
		System.out.println("Gas : 켜집니다.");
	}
	public void turnOff()
	{
		System.out.println("Gas : 잠금모드설정");
	}
}

class Boiler implements Homenetwork {
	public void turnOn()
	{
		System.out.println("Boiler : 켜집니다.");
	}
	public void turnOff()
	{
		System.out.println("Boiler : 꺼집니다.");
	}
}

class Light implements Homenetwork {
	public void turnOn()
	{
		System.out.println("Light : 켜집니다.");
	}
	public void turnOff()
	{
		System.out.println("Light : 꺼집니다.");
	}
}

class Cooker implements Homenetwork {
	public void turnOn()
	{
		System.out.println("Cooker : 취사모드설정");
	}
	public void turnOff()
	{
		System.out.println("Cooker : 꺼집니다.");
	}
}

class Refrigerator implements Homenetwork {
	public void turnOn()
	{
		System.out.println("Refrigerator : 우유, 식빵 유효기간이 다 되었습니다. 장봐오세요.");
	}
	public void turnOff()
	{
		System.out.println("Refrigerator : 계속 작동합니다.");
	}
}