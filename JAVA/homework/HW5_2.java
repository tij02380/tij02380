
public class HW5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.setCoord(6, 3);
		p.setCoord(3, 6, 2);
	}

}

class Point {
	int a, b, c;
	
	public void setCoord(int a, int b)
	{
		System.out.printf("2���� �������� x,y��ǥ (%d, %d)\n", a, b);
	}
	public void setCoord(int a, int b, int c)
	{
		System.out.printf("3���� �������� x,y,z��ǥ (%d, %d, %d)\n", a, b, c);
	}
}
