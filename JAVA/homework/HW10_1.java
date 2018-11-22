
public class HW10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath<Double> m1 = new MyMath<>();
		m1.set(12.2, 9.2, 5.78);
		System.out.println("Æò±Õ°ª : "+m1.getAverage());
		MyMath<Integer> m2 = new MyMath<>();
		m2.set(12, 3, 6, 31);
		System.out.println("Æò±Õ°ª : "+m2.getAverage());
	}

}

class MyMath<T extends Number> {
	private int n = 0;
	private double sum = 0;
	public void set(T... d) {
		for(T x : d) {
			sum = sum + x.doubleValue();
			n++;
			System.out.print(x+" ");
		}
		System.out.println();
	}
	public double getAverage() {
		return sum/n;
	}
}