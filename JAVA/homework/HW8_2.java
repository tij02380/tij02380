
public class HW8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = new String[5];
		arr[0] = "123";
		arr[1] = "가나다";
		arr[2] = "456";
		arr[3] = "abc";
		arr[4] = "1.2";
		for(int i = 0; i<5; i++) {
			try {
				int d = Integer.parseInt(arr[i]);
				System.out.println(d);
			}
			catch(NumberFormatException e) {
			System.out.println("예외발생");
			}
		}
	}

}
