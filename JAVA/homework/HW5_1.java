
public class HW5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade g1 = new Grade();
		double avg;
		avg = g1.averageCal(90.3, 80.6, 98.5);
		System.out.printf("1번 학생의 평균 점수는 %.2f\n", avg);
		
		Grade g2 = new Grade();
		avg = g2.averageCal(70.3, 50.80);
		System.out.printf("2번 학생의 평균 점수는 %.2f\n", avg);
	}

}

class Grade {
	double sum = 0;
	int i = 0;
	double averageCal(double... v)
	{
		for (double x : v)
		{
			sum += x;
			i++;
		}
		return sum / i;
	}
}