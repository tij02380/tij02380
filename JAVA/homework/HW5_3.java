import java.util.Scanner;

public class HW5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.a();
		t.b();
	}
}

class Test {
	String sentence, word, eq;
	int len;
	int m = 0;
	int n = 0;
	int j = 0;
	Scanner sc = new Scanner(System.in);
	
	void a() {	
		System.out.print("문장 : ");
		sentence = sc.nextLine();
		System.out.print("검색할 단어 : ");
		word = sc.next();
	}
	void b() {
		len = sentence.length();
		for(int i=0; i<len; i++)
		{
			if(sentence.charAt(i)==' ')
			{
				eq = sentence.substring(n,i);
				n+=(i-n+1);
				if(word.equalsIgnoreCase(eq)==true)
				{
					j++;
					m++;
					System.out.printf("%d번째 ",m);
				}
				else
					m++;
			}
			else
				continue;
		}
			if(j!=0)
			System.out.printf("어절에서 \"%s\"가 검색되어, 총 %d회 검색되었습니다.\n",word,j);
			else
			System.out.println("총 0회 검색되었습니다.");
	}
	
}