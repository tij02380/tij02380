
public class FA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		int e,f,g,h;
		int id1, id2;
		int d1, d2;

		Play p = new Play();		
		Car c1 = new Car();
		a = c1.speed;
		b = c1.speed;
		c = c1.speed;
		d = c1.speed;
		id1 = c1.id;
		
		Car c2 = new Car();
		e = c2.speed;
		f = c2.speed;
		g = c2.speed;
		h = c2.speed;
		id2 = c2.id;

		p.A(id1, id2, a, e);
		p.time(id1, id2, a, e, 5, 'B');
		
		if(p.total1<p.total2)
		{
			d1 = c1.direction;
			d2 = 3-d1;
			if(d1==1)
			{
				p.C1(id1, b, 40, 10);
				p.B1(id2, f, 40, 10);
			}
			else
			{
				p.B1(id1, b, 40, 10);
				p.C1(id2, f, 40, 10);
			}
		}
		else
		{
			d2 = c2.direction;
			d1 = 3-d2;
			if(d2==1)
			{
				p.C1(id2, f, 40, 10);
				p.B1(id1, b, 40, 10);
			}
			else
			{
				p.B1(id2, f, 40, 10);
				p.C1(id1, b, 40, 10);
			}
		}
		p.time(id1, id2, b, f, 50, 'C');
		
		if(p.total1<p.total2)
		{
			if(d1==1)
			{
				d1 = c1.direction;
				d2 = 3-d1;
				if(d1==1)
				{
					p.C2(id1, c, 30, 20);
					p.C1(id2, g, 30, 20);
				}
				else
				{
					p.B2(id1, c, 30, 20);
					p.B1(id2, g, 30, 20);
				}
			}
			else
			{
				d1 = c1.direction;
				d2 = 3-d1;
				if(d1==1)
				{
					p.C1(id1, c, 30, 20);
					p.C2(id2, g, 30, 20);
				}
				else
				{
					p.B1(id1, c, 30, 20);
					p.B2(id2, g, 30, 20);
				}
			}
		}
		else
		{
			if(d2==1)
			{
				d2 = c2.direction;
				d1 = 3-d2;
				if(d2==1)
				{
					p.C2(id2, c, 30, 20);
					p.C1(id1, g, 30, 20);
				}
				else
				{
					p.B2(id2, c, 30, 20);
					p.B1(id1, g, 30, 20);
				}
			}
			else
			{
				d2 = c2.direction;
				d1 = 3-d2;
				if(d2==1)
				{
					p.C1(id2, c, 30, 20);
					p.C2(id1, g, 30, 20);
				}
				else
				{
					p.B1(id2, c, 30, 20);
					p.B2(id1, g, 30, 20);
				}
			}
		}
		p.time(id1, id2, c, g, 50, 'D');
		
		if(p.total1<p.total2)
		{
			if(d1==1)
			{
				d1 = c1.direction;
				d2 = 3-d1;
				if(d1==1)
				{
					p.C2(id1, d, 30, 20);
					p.C1(id2, h, 30, 20);
				}
				else
				{
					p.B2(id1, d, 30, 20);
					p.B1(id2, h, 30, 20);
				}
			}
			else
			{
				d1 = c1.direction;
				d2 = 3-d1;
				if(d1==1)
				{
					p.C1(id1, d, 30, 20);
					p.C2(id2, h, 30, 20);
				}
				else
				{
					p.B1(id1, d, 30, 20);
					p.B2(id2, h, 30, 20);
				}
			}
		}
		else
		{
			if(d2==1)
			{
				d2 = c2.direction;
				d1 = 3-d2;
				if(d2==1)
				{
					p.C2(id2, d, 30, 20);
					p.C1(id1, h, 30, 20);
				}
				else
				{
					p.B2(id2, d, 30, 20);
					p.B1(id1, h, 30, 20);
				}
			}
			else
			{
				d2 = c2.direction;
				d1 = 3-d2;
				if(d2==1)
				{
					p.C1(id2, d, 30, 20);
					p.C2(id1, h, 30, 20);
				}
				else
				{
					p.B1(id2, d, 30, 20);
					p.B2(id1, h, 30, 20);
				}
			}
		}
		p.time(id1, id2, d, h, 50, 'E');
		
		if(p.total1<p.total2)
			System.out.printf("우승자 : 1번 (총 %.2f분 소요, 평균 속도 %.2fkm/h, 최고속도 %dkm/h, 최저속도 %dkm/h)", p.total1, p.ava(a,b,c,d), p.max(a,b,c,d), p.min(a,b,c,d));
		else
			System.out.printf("우승자 : 2번 (총 %.2f분 소요, 평균 속도 %.2fkm/h, 최고속도 %dkm/h, 최저속도 %dkm/h)", p.total2, p.ava(e,f,g,h), p.max(e,f,g,h), p.min(e,f,g,h));
	}
}

class Car {
	int speed = (int)(Math.random()*41)+80;
	int direction = (int)(Math.random()*2)+1;;
	static int number = 0;
	int id;
	
	public Car() {
		id = ++number;
	}
}

class Play {
	double time1, time2;
	double total1=0;
	double total2=0;
	
	public void time(int n1, int n2, int s1, int s2, int l, char a){
		int i = (s1>s2? n1:n2);
		int j = (s1<s2? n1:n2);
		time1 = (double)l/s1*60;
		total1 += time1;
		time2 = (double)l/s2*60;
		total2 += time2;
		System.out.printf("%d번 자동차가 먼저 %c지점을 통과합니다.",i, a);
		System.out.printf("(구간 소요시간 : %.2f분,", i<j? time1 : time2);
		System.out.printf("누적 소요시간 : %.2f분)\n", total1);
		System.out.printf("%d번 자동차도 %c지점을 통과합니다.",j, a);
		System.out.printf("(구간 소요시간 : %.2f분,", i<j? time1 : time2);
		System.out.printf("누적 소요시간 : %.2f분)\n", total2);
	}
	
	public void A(int n1, int n2, int s1, int s2) {
		System.out.printf("%d번 자동차가 %dkm/h의 속도로 5km직진합니다.\n", (s1>s2? n1:n2), (s1>s2? s1:s2));
		System.out.printf("%d번 자동차가 %dkm/h의 속도로 5km직진합니다.\n", (s1<s2? n1:n2), (s1<s2? s1:s2));	
	}
	public void B1(int n, int s, int l1, int l2) {
		System.out.printf("%d번 자동차가 좌회전 후 %dkm/h의 속도로 %dkm직진하고, 우회전 후 %dkm 직진합니다.\n", n, s, l1, l2);
	}
	public void B2(int n, int s, int l1, int l2) {
		System.out.printf("%d번 자동차가 우회전 후 %dkm/h의 속도로 %dkm직진하고, 좌회전 후 %dkm 직진합니다.\n", n, s, l2, l1);
	}
	public void C1(int n, int s, int l1, int l2) {
		System.out.printf("%d번 자동차가 %dkm/h의 속도로 %dkm직진하고, 좌회전 후 %dkm 직진합니다.\n", n, s, l2, l1);
	}
	public void C2(int n, int s, int l1, int l2) {
		System.out.printf("%d번 자동차가 %dkm/h의 속도로 %dkm직진하고, 우회전 후 %dkm 직진합니다.\n", n, s, l1, l2);
	}
	
	public int max(int a, int b, int c, int d) {
		int max;
		max = a;
		max = (max<b? b : max);
		max = (max<c? c : max);
		max = (max<d? d : max);
		return max;
	}
	public int min(int a, int b, int c, int d) {
		int min;
		min = a;
		min = (min>b? b : min);
		min = (min>c? c : min);
		min = (min>d? d : min);
		return min;
	}
	public double ava(int a, int b, int c, int d) {
		return (a+b+c+d)/4.0;
	}
}