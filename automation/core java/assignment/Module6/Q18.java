package Module6;
//WAP to create one thread by extending Thread class in another class


class threadA extends Thread
{
	public void run()
	{
	for(int i=1;i<=5;i++)
	
		{
			System.out.println("good afternoon..");
		}  
    }
	
}
class threadB extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		
			{
				System.out.println("good night..");
			}
	}	
}
public class Q18
{
	public static void main(String[] args) 
	{
		threadA t1=new threadA();
		threadB t2=new threadB();
		t1.start();
		t2.start();
	}
}

