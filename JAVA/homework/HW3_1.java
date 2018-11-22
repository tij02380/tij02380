import java.util.Scanner;


public class HW3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("4개의 정수를 입력하시오. : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		if(a==b)
		{
			if(b==c)
			{
				if(c==d)
					System.out.print("네 개의 수가 모두 같습니다.");
				else
				{
					if(c>d)
						System.out.printf("세 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",c,d);
					else
						System.out.printf("세 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",d,c);
				}
			}
			else
			{
				if(b==d)
				{
					if(c>d)
						System.out.printf("세 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",c,d);
					else
						System.out.printf("세 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",d,c);
				}
				else
				{
					if(c==d)
					{
						if(a>c)
							System.out.printf("네 개의 수가 각각 두개씩 같으며, 최대값은 %d 최소값은 %d입니다.",a,c);
						else
							System.out.printf("네 개의 수가 각각 두개씩 같으며, 최대값은 %d 최소값은 %d입니다.",c,a);
					}
					else
					{
						if(a>c)
						{
							if(c>d)
								System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",a,d);
							else
							{
								if(a>d)
									System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",a,c);
								else
									System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",d,c);
							}
						}
						else
						{
							if(c<d)
								System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",d,a);
							else
							{
								if(a>d)
									System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",c,d);
								else
									System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",c,a);
							}
						}
					}
				}
			}
			
		}
		else
		{
			if(b==c)
			{
				if(c==d)
				{
					if(a>d)
						System.out.printf("세 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",a,d);
					else
						System.out.printf("세 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",d,a);
				}
				else
				{
					if(a==d)
					{
						if(a>b)
							System.out.printf("네 개의 수가 각각 두개씩 같으며, 최대값은 %d 최소값은 %d입니다.",a,b);
						else
							System.out.printf("네 개의 수가 각각 두개씩 같으며, 최대값은 %d 최소값은 %d입니다.",b,d);
					}
					else
					{
						if(a>b)
						{
							if(b>d)
								System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",a,d);
							else
							{
								if(a>d)
									System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",a,b);
								else
									System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",d,b);
							}
						}
						else
						{
							if(b<d)
								System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",d,a);
							else
							{
								if(a>d)
									System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",b,d);
								else
									System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",b,a);
							}
						}
					}
				}
			}
			else
			{
				if(a==d)
				{
					if(a>b)
					{
						if(b>c)
							System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",a,c);
						else
						{
							if(a>c)
								System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",a,b);
							else
								System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",c,b);
						}
					}
					else
					{
						if(b<c)
							System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",c,a);
						else
						{
							if(a>c)
								System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",b,c);
							else
								System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",b,a);
						}
					}
				}
				else
				{
					if(b==d)
					{
						if(a==c)
						{
							if(a>b)
								System.out.printf("네 개의 수가 각각 두개씩 같으며, 최대값은 %d 최소값은 %d입니다.",a,b);
							else
								System.out.printf("네 개의 수가 각각 두개씩 같으며, 최대값은 %d 최소값은 %d입니다.",b,a);
						}
						else
						{
							if(a>b)
							{
								if(b>c)
									System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",a,c);
								else
								{
									if(a>c)
										System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",a,b);
									else
										System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",c,b);
								}
							}
							else
							{
								if(b<c)
									System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",c,a);
								else
								{
									if(a>c)
										System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",b,c);
									else
										System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",b,a);
								}
							}
						}
						
					}
					else
					{
						if(a==c)
						{
							if(a>b)
							{
								if(b>d)
									System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",a,d);
								else
								{
									if(a>d)
										System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",a,b);
									else
										System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",d,b);
								}
							}
							else
							{
								if(b<d)
									System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",d,a);
								else
								{
									if(a>d)
										System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",b,d);
									else
										System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",b,a);
								}
							}
						}
						else
						{
							if(c==d)
							{
								if(a>b)
								{
									if(b>c)
										System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",a,c);
									else
									{
										if(a>c)
											System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",a,b);
										else
											System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",c,b);
									}
								}
								else
								{
									if(b<c)
										System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",c,a);
									else
									{
										if(a>c)
											System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",b,c);
										else
											System.out.printf("두 개의 수가 같으며, 최대값은 %d 최소값은 %d입니다.",b,a);
									}
								}
							}
							else
							{
								if(a>b)
								{
									if(b>c)
									{
										if(c>d)
											System.out.printf("최대값은 %d 최소값은 %d입니다.",a,d);
										else
											System.out.printf("최대값은 %d 최소값은 %d입니다.",a,c);
									}
									else
									{
										if(a>c)
										{
											if(d>a)
												System.out.printf("최대값은 %d 최소값은 %d입니다.",d,b);
											else if(d>c)
												System.out.printf("최대값은 %d 최소값은 %d입니다.",a,b);
											else if(d>b)
												System.out.printf("최대값은 %d 최소값은 %d입니다.",a,b);
											else
												System.out.printf("최대값은 %d 최소값은 %d입니다.",a,d);
										}
										else
										{
											if(d>c)
												System.out.printf("최대값은 %d 최소값은 %d입니다.",d,b);
											else if(d>a)
												System.out.printf("최대값은 %d 최소값은 %d입니다.",c,b);
											else if(d>b)
												System.out.printf("최대값은 %d 최소값은 %d입니다.",c,b);
											else
												System.out.printf("최대값은 %d 최소값은 %d입니다.",c,d);
										}
									}
								}
								else
								{
									if(b<c)
									{
										if(c<d)
											System.out.printf("최대값은 %d 최소값은 %d입니다.",d,a);
										else
											System.out.printf("최대값은 %d 최소값은 %d입니다.",c,a);
									}
									else
									{
										if(a>c)
										{
											if(d>b)
												System.out.printf("최대값은 %d 최소값은 %d입니다.",d,c);
											else if(d>a)
												System.out.printf("최대값은 %d 최소값은 %d입니다.",b,c);
											else if(d>c)
												System.out.printf("최대값은 %d 최소값은 %d입니다.",b,c);
											else
												System.out.printf("최대값은 %d 최소값은 %d입니다.",b,d);
										}
										else
										{
											if(d>b)
												System.out.printf("최대값은 %d 최소값은 %d입니다.",d,a);
											else if(d>c)
												System.out.printf("최대값은 %d 최소값은 %d입니다.",b,a);
											else if(d>a)
												System.out.printf("최대값은 %d 최소값은 %d입니다.",b,a);
											else
												System.out.printf("최대값은 %d 최소값은 %d입니다.",b,d);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
