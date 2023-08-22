package Module6;
//W.A.J.P take THREE number from user and print greatest number

import java.util.Scanner;

public class Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x..");
		int x=sc.nextInt();
		System.out.println("enter the value of y..");
		int y=sc.nextInt();
		System.out.println("enter the value of z..");
		int z=sc.nextInt();
		
		if (x>y && x>z)
		{
			System.out.println("x is the greatest");
		}
		else if (y>x && y>z)
		{
			System.out.println("y is the gteatest");
		}
		else if (z>x && z>y)
		{
			System.out.println("z is the greatest");
		}
		else if (x==y && y==z)
		{
			System.out.println("all are equal");
		}
		
		else
		{
			System.out.println("two values are equal");
		}					
	}
}
