
public class HW6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, c=0, d=0, e=0, f=0, g=0, h=0, i=0, j=0;
		for(int k=0; k<50; k++)
		{
			int s=(int)(Math.random()*101);
			if(s>=90)
				j++;
			else if(s>=80)
				i++;
			else if(s>=70)
				h++;
			else if(s>=60)
				g++;
			else if(s>=50)
				f++;
			else if(s>=40)
				e++;
			else if(s>=30)
				d++;
			else if(s>=20)
				c++;
			else if(s>=10)
				b++;
			else if(s>=0)
				a++;
		}
		Max m = new Max();
		int max = m.max(a, b, c, d, e, f, g, h, i, j);
		String [][] graph = new String [max][10];
		for(int k=0; k<max; k++)
			for(int l=0; l<10; l++)
				graph[k][l] = " ";
		
		for(int k=max-1; k>=max-a; k--)
			graph[k][0] = "*";
		for(int k=max-1; k>=max-b; k--)
			graph[k][1] = "*";
		for(int k=max-1; k>=max-c; k--)
			graph[k][2] = "*";
		for(int k=max-1; k>=max-d; k--)
			graph[k][3] = "*";
		for(int k=max-1; k>=max-e; k--)
			graph[k][4] = "*";
		for(int k=max-1; k>=max-f; k--)
			graph[k][5] = "*";
		for(int k=max-1; k>=max-g; k--)
			graph[k][6] = "*";
		for(int k=max-1; k>=max-h; k--)
			graph[k][7] = "*";
		for(int k=max-1; k>=max-i; k--)
			graph[k][8] = "*";
		for(int k=max-1; k>=max-j; k--)
			graph[k][9] = "*";

		for(int k=0; k<max; k++){
			for(int l=0; l<10; l++){
				System.out.print(graph[k][l]+"  ");}
			System.out.println();}
		System.out.print("5 15 25 35 45 55 65 75 85 95");
	}

}

class Max {
	public int max(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
		int max;
		max = a;
		max = (max<b? b : max);
		max = (max<c? c : max);
		max = (max<d? d : max);
		max = (max<e? e : max);
		max = (max<f? f : max);
		max = (max<h? h : max);
		max = (max<i? i : max);
		max = (max<j? j : max);
		return max;
	}
}