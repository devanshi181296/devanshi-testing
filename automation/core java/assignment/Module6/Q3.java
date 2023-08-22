package Module6;

import java.util.Scanner;

//W.A.J.P to find factorial for given number 

public class Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no..");
		int a=sc.nextInt();
		
		int n=1;
		for (int i=1;i<=a;i++)
		{
			n=n*i;
		}
		System.out.println(n);
	}
}
