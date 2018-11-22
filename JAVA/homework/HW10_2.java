import java.util.ArrayList;

public class HW10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		ArrayList <Double> list = new ArrayList<>();
		for(int i = 0; i < (int)(Math.random()*10)+3; i++) {
			double score = Math.random()*10;
			list.add(i, score);
		}
		double max = list.get(0);
		double min = list.get(0);
		for(int i = 0; i<list.size(); i++) {
			max = (max<list.get(i)? list.get(i) : max);
			min = (min>list.get(i)? list.get(i) : min);
			sum = sum + list.get(i);
		}
		System.out.println("심사위원들의 점수" + list);
		System.out.println("평균점수 : " + (sum-max-min)/(list.size()-2));

		
	}

}