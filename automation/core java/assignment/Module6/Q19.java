package Module6;
//WAP to iterate through all elements in an array list
 

import java.util.ArrayList;
import java.util.ListIterator;
public class Q19 
{
	public static void main(String[] args)
	{
		ArrayList<String>fruits=new ArrayList<String>();
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("strawberry");
		System.out.println("my fvt.fruits are.."+fruits);
	
//		System.out.println("using for loop..");
//		for(int i=0;i<fruits.size();i++)
//		{
//			System.out.println(fruits.get(i));
//		}
//		
//		System.out.println("using for each loop..");
//		for(String fruit:fruits)
//		{
//			System.out.println(fruit);
//		}
//		
//		System.out.println("using listiterator..");
		ListIterator<String> itrate=fruits.listIterator();
		while(itrate.hasNext())
		{
			System.out.println(itrate.next());
		}
	}
}
