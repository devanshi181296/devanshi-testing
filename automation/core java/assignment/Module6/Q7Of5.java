package Module6;
/*
     *
   * * *
 * * * * *
   * * *
     *

 */

public class Q7Of5 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5; i=i+2)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print(" "+"*");
			}
			System.out.println();		
		}
		for (int i=3;i>=1;i=i-2)
		{
			for (int j=3;j>=i-1;j--)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++)
			{
				System.out.print(" "+"*");
			}
			System.out.println();
		}
	}
}


