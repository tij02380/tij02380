import java.util.Scanner;

public class HW8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			searchArray(); 
		}
		catch(NotFoundException e){
			System.out.println("���ܹ߻�");
		}

	}
	static void searchArray() throws NotFoundException{
		int n = 0;
		int [] arr = new int[5];
		arr[0] = 1;
		arr[1] = 9;
		arr[2] = 34;
		arr[3] = 45;
		arr[4] = 62;
		Scanner s = new Scanner(System.in);
		System.out.println("���ϴ� ���ڸ� �Է��Ͻÿ�.");
		int a = s.nextInt();
		for(int i = 0; i<5; i++) {
			if(arr[i]==a) n++;
		}
		if(n==0)
			throw new NotFoundException();
		else
			System.out.println("������ ���� �� ���ϴ� ���ڰ� �����մϴ�.");
	}
}

class NotFoundException extends Exception {
	NotFoundException() {
		super("����� ���ڰ� �����ϴ�.");
	}
}