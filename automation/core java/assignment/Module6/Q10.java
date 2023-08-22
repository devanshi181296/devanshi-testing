package Module6;

import java.util.Scanner;

//WAP to calculate the average value of array elements.

public class Q10 
{
	public static void main(String[] args) 
	{
		int c=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE..");
		int size=sc.nextInt();
		int[] b=new int[size];
		System.out.println();
		System.out.println();
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the value..");
			b[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(b[i]+" ");
			sum=sum+b[i];
			c=sum/size;
		}
		System.out.println();
		System.out.println(sum);
		System.out.println(c);
	}
}
