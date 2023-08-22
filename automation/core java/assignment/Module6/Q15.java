package Module6;
//WAP to demonstrate try catch block.

public class Q15 
{
	public static void main(String[] args) 
	{
		int a=6969;
		int b=0;
		//int c=a/b;
		//System.out.println("the result is.."+c);
		
		try 
		{
			int c=a/b;
			System.out.println("the result is.."+c);
			
			
		}catch(Exception e)
		{
			System.out.println("print the reason..");
			System.out.println(e);
		} 
		System.out.println("program is completed..");
	}
			
		
	
}

