package Module6;
//WAP to Copy one array into another

import java.util.Scanner;

public class Q22 
{
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner r=new Scanner(System.in);
		System.out.println("enter value in first array...");
		for(int i=0;i<5;i++)
		{
			a[i]=r.nextInt();		
		}
		System.out.println("first array elements...");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]+" ");		
		}
		System.out.println("second array elements..");
		for(int i=0;i<5;i++)
		{
			b[i]=a[i];
			System.out.println(b[i]+" ");
		}
	}
}
