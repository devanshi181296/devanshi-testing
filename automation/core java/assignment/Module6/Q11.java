package Module6;
//WAP to find the index of an array element
public class Q11 
{
	public static void main(String[] args) 
	{
		String[]colors= {"Red","Green","Blue","Orange"};
		int index=0;
		for(int i=0;i<colors.length;i++)
		{
			if(colors[i]=="Orange")
			{
				index=i;
			}
			
		}
		System.out.println("index="+index);
	}
}
