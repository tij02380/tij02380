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
			System.out.println("출금할 수 있는 금액을 초과하였습니다.");
		}
	}

}

class BankAccount {
	int balance;
	Scanner sc = new Scanner(System.in);
	public void deposit() {
		System.out.println("현재 통장에 남은 잔액입력");
		balance = sc.nextInt();
		System.out.println("입금할 금액 입력");
		int i = sc.nextInt();
		balance = balance + i;
	}
	public void withdraw() throws NegativeBalanceException {
		System.out.println("출금할 금액 입력");
		int i = sc.nextInt();
		int j = balance - i;
		if(i>balance)
			throw new NegativeBalanceException();
		else
			System.out.println("출금 후 남은 잔액 : " + j);
	}
}

class NegativeBalanceException extends Exception {
	NegativeBalanceException() {
		super("인출금액이 잔액보다 큽니다.");
	}
}