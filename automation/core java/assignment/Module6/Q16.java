package Module6;
//WAP to demonstrate multiple catch blocks

public class Q16 
{
	public static void main(String[] args) 
	{
		int a=8526;
		int b=0;
		int[]f=new int [5];
		//int c=a/b;
		//System.out.println("the result is.."+c);
		
		try 
		{
			int c=a/b;
			System.out.println("f[2]");
			System.out.println("f[6]");
			System.out.println(c);
			
			
		}catch(ArithmeticException e)
		{
			System.out.println("print the reason..");
			System.out.println(e);
		} 
		catch(ArrayIndexOutOfBoundsException g)
		{
			System.out.println("array exception is.."+g);
			System.out.println(g);
		}
		catch(Exception e)
		{
			System.out.println("univercal exception is..."+e);
			System.out.println(e);
		}
		
	}
}
