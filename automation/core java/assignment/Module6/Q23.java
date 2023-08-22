package Module6;

import java.util.Scanner;

//WAP to reverse an array of integer values.

public class Q23 
{
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		Scanner r=new Scanner (System.in);
		System.out.println("enter a number..");
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("array element..");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
			
		}
		System.out.println("reverse array element..");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+" ");
			
		}			
	}
}
