import java.util.Scanner;


public class HW3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("4���� ������ �Է��Ͻÿ�. : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		if(a==b)
		{
			if(b==c)
			{
				if(c==d)
					System.out.print("�� ���� ���� ��� �����ϴ�.");
				else
				{
					if(c>d)
						System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",c,d);
					else
						System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",d,c);
				}
			}
			else
			{
				if(b==d)
				{
					if(c>d)
						System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",c,d);
					else
						System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",d,c);
				}
				else
				{
					if(c==d)
					{
						if(a>c)
							System.out.printf("�� ���� ���� ���� �ΰ��� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,c);
						else
							System.out.printf("�� ���� ���� ���� �ΰ��� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",c,a);
					}
					else
					{
						if(a>c)
						{
							if(c>d)
								System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,d);
							else
							{
								if(a>d)
									System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,c);
								else
									System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",d,c);
							}
						}
						else
						{
							if(c<d)
								System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",d,a);
							else
							{
								if(a>d)
									System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",c,d);
								else
									System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",c,a);
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
						System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,d);
					else
						System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",d,a);
				}
				else
				{
					if(a==d)
					{
						if(a>b)
							System.out.printf("�� ���� ���� ���� �ΰ��� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,b);
						else
							System.out.printf("�� ���� ���� ���� �ΰ��� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",b,d);
					}
					else
					{
						if(a>b)
						{
							if(b>d)
								System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,d);
							else
							{
								if(a>d)
									System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,b);
								else
									System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",d,b);
							}
						}
						else
						{
							if(b<d)
								System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",d,a);
							else
							{
								if(a>d)
									System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",b,d);
								else
									System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",b,a);
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
							System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,c);
						else
						{
							if(a>c)
								System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,b);
							else
								System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",c,b);
						}
					}
					else
					{
						if(b<c)
							System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",c,a);
						else
						{
							if(a>c)
								System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",b,c);
							else
								System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",b,a);
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
								System.out.printf("�� ���� ���� ���� �ΰ��� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,b);
							else
								System.out.printf("�� ���� ���� ���� �ΰ��� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",b,a);
						}
						else
						{
							if(a>b)
							{
								if(b>c)
									System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,c);
								else
								{
									if(a>c)
										System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,b);
									else
										System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",c,b);
								}
							}
							else
							{
								if(b<c)
									System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",c,a);
								else
								{
									if(a>c)
										System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",b,c);
									else
										System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",b,a);
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
									System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,d);
								else
								{
									if(a>d)
										System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,b);
									else
										System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",d,b);
								}
							}
							else
							{
								if(b<d)
									System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",d,a);
								else
								{
									if(a>d)
										System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",b,d);
									else
										System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",b,a);
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
										System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,c);
									else
									{
										if(a>c)
											System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,b);
										else
											System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",c,b);
									}
								}
								else
								{
									if(b<c)
										System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",c,a);
									else
									{
										if(a>c)
											System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",b,c);
										else
											System.out.printf("�� ���� ���� ������, �ִ밪�� %d �ּҰ��� %d�Դϴ�.",b,a);
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
											System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,d);
										else
											System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,c);
									}
									else
									{
										if(a>c)
										{
											if(d>a)
												System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",d,b);
											else if(d>c)
												System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,b);
											else if(d>b)
												System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,b);
											else
												System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",a,d);
										}
										else
										{
											if(d>c)
												System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",d,b);
											else if(d>a)
												System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",c,b);
											else if(d>b)
												System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",c,b);
											else
												System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",c,d);
										}
									}
								}
								else
								{
									if(b<c)
									{
										if(c<d)
											System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",d,a);
										else
											System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",c,a);
									}
									else
									{
										if(a>c)
										{
											if(d>b)
												System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",d,c);
											else if(d>a)
												System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",b,c);
											else if(d>c)
												System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",b,c);
											else
												System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",b,d);
										}
										else
										{
											if(d>b)
												System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",d,a);
											else if(d>c)
												System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",b,a);
											else if(d>a)
												System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",b,a);
											else
												System.out.printf("�ִ밪�� %d �ּҰ��� %d�Դϴ�.",b,d);
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
