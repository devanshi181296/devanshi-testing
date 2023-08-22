package Module6;

import java.util.Scanner;

//WAP to concatenate a given string to the end of another string.

public class Q14 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter first string");
		String s1=sc.nextLine();
		System.out.println("enter second string");
		String s2=sc.nextLine();
		System.out.println("concatenate String.."+(s1+" "+s2));
	}
}
