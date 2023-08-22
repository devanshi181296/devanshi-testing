package Module6;

import java.util.Scanner;

//W.A.J.P for create Fibonacci Series.

public class Q6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no...");
		int n=sc.nextInt();
		
		int a=0,b=1,c;
		for (int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}