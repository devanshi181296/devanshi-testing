package Module6;

import java.util.*;
import java.util.Scanner;

//WAP to update specific array element by given element.

public class Q20 
{
	public static void main(String[] args) 
	{
		int[]arr=new int[5];
		System.out.println("enter the elements..");
		Scanner sc=new Scanner(System.in);
		
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("printing elements before insert..");
		for (int i:arr)
		{
			System.out.println(i);
		}
		
		System.out.println("enter the location at which we want to insert..");
		int location=sc.nextInt();
		
		System.out.println("enter the value at which we want to insert..");
		int value=sc.nextInt();
		
		for(int i=arr.length-1;i>location;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[location]=value;
		for (int i:arr)
		{
			System.out.println(i);
			
		}
		
//		List<String>list_Col=new ArrayList<String>();
//		list_Col.add("black");
//		list_Col.add("red");
//		list_Col.add("pink");
//		list_Col.add("yellow");
//		list_Col.add("green");
//		System.out.println(list_Col);
//		list_Col.set(1,"white");
//		list_Col.set(4,"blue");
//		System.out.println(list_Col);
//		
//		
		
		
	}
}
