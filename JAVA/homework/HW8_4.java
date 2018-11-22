import java.util.Scanner;

public class HW8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount();
		b.deposit();
		try {
			b.withdraw();
		}
		catch(NegativeBalanceException n) {
			System.out.println("����� �� �ִ� �ݾ��� �ʰ��Ͽ����ϴ�.");
		}
	}

}

class BankAccount {
	int balance;
	Scanner sc = new Scanner(System.in);
	public void deposit() {
		System.out.println("���� ���忡 ���� �ܾ��Է�");
		balance = sc.nextInt();
		System.out.println("�Ա��� �ݾ� �Է�");
		int i = sc.nextInt();
		balance = balance + i;
	}
	public void withdraw() throws NegativeBalanceException {
		System.out.println("����� �ݾ� �Է�");
		int i = sc.nextInt();
		int j = balance - i;
		if(i>balance)
			throw new NegativeBalanceException();
		else
			System.out.println("��� �� ���� �ܾ� : " + j);
	}
}

class NegativeBalanceException extends Exception {
	NegativeBalanceException() {
		super("����ݾ��� �ܾ׺��� Ů�ϴ�.");
	}
}