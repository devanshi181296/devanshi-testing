package Module6;
//WAP to create one thread by implementing Runnable interface in class

class thread1 implements Runnable
{
	public void run()
	{
	for(int i=1;i<=5;i++)
	
		{
			System.out.println("good morning..");
		}  
    }
	
}
class thread2 implements Runnable
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		
			{
				System.out.println("good evening..");
			}
	}	
}
public class Q17 
{
	public static void main(String[] args) 
	{
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		Thread tobj1=new Thread(t1);
		Thread tobj2=new Thread(t2);
		
		tobj1.start();
		tobj2.start();
	
	}
}
