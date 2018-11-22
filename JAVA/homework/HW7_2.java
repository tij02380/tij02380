import java.util.*;

public class HW7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie [] m = new Movie[5];
		m[0] = new Movie("�� ����","�г��� ����",7.08);
		m[1] = new Movie("�� �ƽø�","�г��� ����",6.25);
		m[2] = new Movie("�𸮹�Ƽ��","�г��� ����",5.38);
		m[3] = new Movie("��������� ����","ȣ��",6.00);
		m[4] = new Movie("����� ����","ȣ��",7.30);
		
		for(int i=0; i<5; i++)
		{
			for(int j=i+1; j<5; j++)
			{
				if(m[i].equals(m[j]))
					System.out.println(m[i].getName()+"�� "+m[j].getName()+"�� ������ ��ȭ�Դϴ�.");
				else
					System.out.println(m[i].getName()+"�� "+m[j].getName()+"�� ���� �ٸ� ��ȭ�Դϴ�.");
			}
		}
		System.out.println("==========================================================");
		Arrays.sort(m);
		for(Movie movie : m)
			System.out.println("��ȭ�̸� : "+ movie.getName() + " / �ø��� : " + movie.getSeries()
					+" / ���� : " + movie.getScore());
	}

}

class Movie implements Comparable {
	private String name, series;
	private double score;
	public Movie(String a, String b, double c) {
		name = a;
		series = b;
		score = c;
	}
	public String getName() {return name;}
	public String getSeries() {return series;}
	public double getScore() {return score;}
	public int compareTo(Object obj) {
		Movie other = (Movie) obj;
		if (score< other.score)
			return 1;
		else if (score > other.score)
			return -1;
		else
			return 0;
	}
	public boolean equals(Object obj) {
		if (obj instanceof Movie)
			return series.equals(((Movie) obj).series);
		else
			return false;
	}
}