package Module6;
//WAP to remove the third element from a array list.

import java.util.ArrayList;

public class Q21 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Java");
		a1.add("Python");
		a1.add("Program");
		a1.add(".Net");
		a1.add("C++");
		a1.add("C");
		System.out.println(a1);
		
		a1.remove("Program");
		System.out.println(a1);
	}
}
