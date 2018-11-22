import java.util.Scanner;

public class HW7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number, mode;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++)
		{
			System.out.println("���� ���� ��й�ȣ�� �Է��Ͻÿ�.");
			number = sc.next();
			if(number.equals("oop"))
			{
				Homenetwork [] n = new Homenetwork[5];
				n[0] = new Gas();
				n[1] = new Boiler();
				n[2] = new Light();
				n[3] = new Cooker();
				n[4] = new Refrigerator();
				System.out.println("������ �����Ͽ����ϴ�.");
				while(true)
				{
					System.out.println("=========================");
					System.out.println("����/�Ͱ�/����?");
					mode = sc.next();
					if(mode.equals("����"))
					{
						for(int j =0; j<5; j++)
							n[j].turnOff();
					}
					else if(mode.equals("�Ͱ�"))
					{
						for(int j =0; j<5; j++)
							n[j].turnOn();
					}
					else if(mode.equals("����"))
					{
						System.out.println("Ȩ������ ������ �����մϴ�.");
						break;
					}
					else
						System.out.println("�߸��� �Է��Դϴ�.");
				}
				break;
			}
			else
			{
				if(i==2)
					System.out.println("��й�ȣ�� 3ȸ �߸��Է��ϼ̽��ϴ�.\n���������� �����մϴ�.");
				else
					System.out.printf("��й�ȣ�� %dȸ �߸��Է��ϼ̽��ϴ�.\n",i+1);
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
		System.out.println("Gas : �����ϴ�.");
	}
	public void turnOff()
	{
		System.out.println("Gas : ��ݸ�弳��");
	}
}

class Boiler implements Homenetwork {
	public void turnOn()
	{
		System.out.println("Boiler : �����ϴ�.");
	}
	public void turnOff()
	{
		System.out.println("Boiler : �����ϴ�.");
	}
}

class Light implements Homenetwork {
	public void turnOn()
	{
		System.out.println("Light : �����ϴ�.");
	}
	public void turnOff()
	{
		System.out.println("Light : �����ϴ�.");
	}
}

class Cooker implements Homenetwork {
	public void turnOn()
	{
		System.out.println("Cooker : ����弳��");
	}
	public void turnOff()
	{
		System.out.println("Cooker : �����ϴ�.");
	}
}

class Refrigerator implements Homenetwork {
	public void turnOn()
	{
		System.out.println("Refrigerator : ����, �Ļ� ��ȿ�Ⱓ�� �� �Ǿ����ϴ�. ���������.");
	}
	public void turnOff()
	{
		System.out.println("Refrigerator : ��� �۵��մϴ�.");
	}
}