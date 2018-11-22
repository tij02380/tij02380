
public class HW6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int max=args[0].length();
		for(String s : args) {
			max = (max<s.length()? s.length() : max);
		}
		for(int j = max; j>=0; j--)
		{
			for(int i= 0; i<args.length; i++)
			{
				if(j == args[i].length())
					System.out.printf("%s ",args[i]);
				else continue;
			}
		}
	}
}
