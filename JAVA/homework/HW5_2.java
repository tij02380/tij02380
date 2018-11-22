
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
		System.out.printf("2차원 공간에서 x,y좌표 (%d, %d)\n", a, b);
	}
	public void setCoord(int a, int b, int c)
	{
		System.out.printf("3차원 공간에서 x,y,z좌표 (%d, %d, %d)\n", a, b, c);
	}
}
