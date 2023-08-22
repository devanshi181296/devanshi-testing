package Module6;

import java.util.Scanner;

//WAP to sum values of an array.

public class Q9 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int[]a=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the value..");
			a[i]=sc.nextInt();
		}
		for (int i=0;i<5;i++)
		{
			System.out.println(a[i]+" ");
			sum=sum+a[i];
		}
		System.out.println();
		System.out.println(sum);
	}
}
