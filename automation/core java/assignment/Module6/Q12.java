package Module6;
//WAP to find the maximum and minimum value of an array.

public class Q12 
{
	public static void main(String[] args) 
	{
		int a[]= {62,10,2,60,89,55,70};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max value of an array is.."+max);
		
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("min value of an array is.."+min);
	}
}
