import java.util.Scanner;

class BankAccount{
	int balance;
	int deposit;
	int withDraw;
	
	public void deposit(int d)
	{
		deposit=d;
	}
	public void withDraw(int w)
	{
		withDraw=w;
	}
	public int getBalance()
	{
		return deposit-withDraw;
	}
}

public class HW4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount man = new BankAccount();
		man.balance = 0;
		Scanner m = new Scanner(System.in);
		int money;
		
		System.out.print("�Ա��� �ݾ��� : ");
		money = m.nextInt();
		man.deposit(money);
		System.out.print("����� �ݾ��� : ");
		money = m.nextInt();
		man.withDraw(money);
		System.out.printf("�����ܾ��� %d",man.getBalance());
	}

}
