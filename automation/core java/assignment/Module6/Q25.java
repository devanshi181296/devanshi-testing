package Module6;

/*
 W.A.J.P. Create an abstract class 'Parent' with a method 'message'. It has two subclasses each 
having a method with the same name 'message' that prints "This is first subclass" and "This is 
second subclass" respectively.Call the methods 'message' by creating an object for each subclass.
*/

abstract class Parent
{
	int no;
	String name;
	public abstract void message();
	
	
}
class Sb1 extends Parent
{
	@Override
	public void message()
	{
		System.out.println("this is first subclass");
	}

}
class Sb2 extends Parent
{
	@Override
	public void message()
	{
		System.out.println("this is second subclass");
	}

}
public class Q25
{
	public static void main(String[] args) 
	{
		Parent a1=new Sb1();
		Parent a2=new Sb2();
		a1.message();
		a2.message();
		
	}
}

