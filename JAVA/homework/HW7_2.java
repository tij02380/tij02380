import java.util.*;

public class HW7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie [] m = new Movie[5];
		m[0] = new Movie("더 세븐","분노의 질주",7.08);
		m[1] = new Movie("더 맥시멈","분노의 질주",6.25);
		m[2] = new Movie("언리미티드","분노의 질주",5.38);
		m[3] = new Movie("스마우그의 폐허","호빗",6.00);
		m[4] = new Movie("뜻밖의 여정","호빗",7.30);
		
		for(int i=0; i<5; i++)
		{
			for(int j=i+1; j<5; j++)
			{
				if(m[i].equals(m[j]))
					System.out.println(m[i].getName()+"은 "+m[j].getName()+"과 동일한 영화입니다.");
				else
					System.out.println(m[i].getName()+"은 "+m[j].getName()+"과 서로 다른 영화입니다.");
			}
		}
		System.out.println("==========================================================");
		Arrays.sort(m);
		for(Movie movie : m)
			System.out.println("영화이름 : "+ movie.getName() + " / 시리즈 : " + movie.getSeries()
					+" / 평점 : " + movie.getScore());
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