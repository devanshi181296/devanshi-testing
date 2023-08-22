package Module6;

import java.util.Scanner;

//WAP to find the second largest element in an array.

public class Q24 
{
	public static void main(String[] args) 
	{
		int []a= {63,6,82,10,3,65,21,11,9};
		int largest = 0;
		int second  = 0;
		if(a.length>=2)
		{
			if(a[0]>a[1])
			{
				largest= a[0];
				second = a[1];
			}
			else
			{
				largest= a[0];
				second = a[1];
			}
			for(int i=2;i<=a.length-1;i++)
			{
				if(a[i]>largest)
				{
					second=largest;
					largest=a[i];
				}
				else if(a[i]>second)
				{
					second=a[i];
				}
				
			}
			System.out.println("second largest no is.."+second);
		}
		else
		{
			System.out.println("invalid array");
		}
	}
}
