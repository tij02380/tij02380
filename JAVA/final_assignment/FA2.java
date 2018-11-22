import java.util.*;
import java.io.*;

public class FA2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		if(args.length!=5) {
			System.out.println("Usage : java MergeFile s1 s2 target sorting type");
			System.exit(1);
		}
		System.out.println("FA2");
		int n = 0;
		int q = 0;
		int r = 0;
		Vector vc = new Vector();
		Vector v = new Vector();
		
		File file1 = new File(args[0]);
		File file2 = new File(args[1]);
		File file3 = new File(args[2]);
		String [] sorting = {"오름차순", "내림차순"};
		String [] type = {"정수", "소수", "문자", "스트링"};
		for(String so : sorting) {
			if(args[3].equals(so)) 	q++;
			else continue;
		}
		if(q==0) {
			System.out.println("잘못된 입력입니다.");
			System.exit(5);
		}
		for(String ty : type) {
			if(args[4].equals(ty)) r++;
			else continue;
		}
		if(r==0) {
			System.out.println("잘못된 입력입니다.");
			System.exit(6);
		}
		
		if(!file1.exists()) {
			System.out.println("파일이 존재하지않습니다.");
			System.exit(2);
		}
		if(!file2.exists()) {
			System.out.println("파일이 존재하지않습니다.");
			System.exit(3);
		}
		if(file3.exists()) {
			System.out.println("파일이 이미 존재합니다.");
			System.exit(4);
		}
		
		
		
		Scanner sc1 = new Scanner(new FileInputStream(args[0]));
		while(sc1.hasNext()) {
			String s1 = sc1.nextLine();
			vc.add(s1);
			n++;
		}
		Scanner sc2 = new Scanner(new FileInputStream(args[1]));
		while(sc2.hasNext()) {
			String s2 = sc2.nextLine();
			vc.add(s2);
		}
		System.out.print("s1에 저장된 내용 : ");
		for(int i = 0; i<n; i++) {
			System.out.print(vc.get(i)+" ");
		}
		System.out.println();
		System.out.print("s2에 저장된 내용 : ");
		for(int i = n; i<vc.size(); i++) {
			System.out.print(vc.get(i)+" ");
		}
		System.out.println();
		
		if(args[4].equals("정수")) {
			Type1 [] t1 = new Type1 [vc.size()];
			for(int i = 0; i<vc.size(); i++) {
				String a = (String)vc.get(i);
				t1[i] = new Type1(Integer.parseInt(a), args[3]);
			}
			Arrays.sort(t1);
			for(Type1 t : t1) 
				v.add(t.s);
			System.out.println(v);
		}
		else if(args[4].equals("소수")) {
			Type2 [] t2 = new Type2 [vc.size()];
			for(int i = 0; i<vc.size(); i++) {
				String a = (String)vc.get(i);
				t2[i] = new Type2(Double.parseDouble(a), args[3]);
			}
			Arrays.sort(t2);
			for(Type2 t : t2) 
				v.add(t.s);
			System.out.println(v);
		}
		else if(args[4].equals("문자")) {
			Type3 [] t3 = new Type3 [vc.size()];
			for(int i = 0; i<vc.size(); i++) {
				t3[i] = new Type3((String)vc.get(i), args[3]);
			}
			Arrays.sort(t3);
			for(Type3 t : t3) 
				v.add(t.s);
			System.out.println(v);
		}
		else {
			Type4 [] t4 = new Type4 [vc.size()];
			for(int i = 0; i<vc.size(); i++) {
				t4[i] = new Type4((String)vc.get(i), args[3]);
			}
			Arrays.sort(t4);
			for(Type4 t : t4) 
				v.add(t.s);
			System.out.println(v);
		}
		
		try(PrintWriter pw = new PrintWriter(args[2]);) {
			pw.println("FA2");
			pw.println(v);
		}
		
		
		sc1.close();
		sc2.close();
		
	}
	
}

abstract class Type implements Comparable {
	abstract public int compareTo(Object obj) ;
}
class Type1 extends Type {
	int s;
	String t;
	public Type1 (int s, String t) {
		this.s = s;
		this.t= t;
	}
	public int compareTo(Object obj) {
		Type1 other = (Type1)obj;
		if(s<other.s) {
			if(t.equals("오름차순")) return -1;
			else return 1;
		}
		else if(s<other.s) {
			if(t.equals("오름차순")) return 1;
			else return -1;
		}
		else
			return 0;
	}
}
class Type2 extends Type {
	double s;
	String t;
	public Type2 (double s, String t) {
		this.s = s;
		this.t= t;
	}
	public int compareTo(Object obj) {
		Type2 other = (Type2)obj;
		if(s<other.s) {
			if(t.equals("오름차순")) return -1;
			else return 1;
		}
		else if(s<other.s) {
			if(t.equals("오름차순")) return 1;
			else return -1;
		}
		else
			return 0;
	}
}
class Type3 extends Type {
	String s;
	String t;
	public Type3 (String s, String t) {
		this.s = s;
		this.t= t;
	}
	public int compareTo(Object obj) {
		Type3 other = (Type3)obj;
		if(s.compareTo(other.s)<0) {
			if(t.equals("오름차순")) return -1;
			else return 1;
		}
		else if(s.compareTo(other.s)>0) {
			if(t.equals("오름차순")) return 1;
			else return -1;
		}
		else
			return 0;
	}

}
class Type4 extends Type {
	String s;
	String t;
	public Type4 (String s, String t) {
		this.s = s;
		this.t= t;
	}
	public int compareTo(Object obj) {
		Type4 other = (Type4)obj;
		if(s.compareTo(other.s)<0) {
			if(t.equals("오름차순")) return -1;
			else return 1;
		}
		else if(s.compareTo(other.s)>0) {
			if(t.equals("오름차순")) return 1;
			else return -1;
		}
		else
			return 0;
	}
}