package Module6;
/*
 W.A.J.P. to create a custom exception if Customer withdraw amount
which is greater than account balance then program will show custom
exception otherwise amount will deduct from account balance.
Account balance is:2000 Enter withdraw
amount:2500
Sorry, insufficient balance, you need more 500 Rs.To perform
this transaction.
 */


import java.util.Scanner;

class AssignmentException extends Exception
{
	double amount;
	public AssignmentException(double amount)
	{
		this.amount=amount;
	}
}
class ATM
{
	double balance;
	public void deposite(double amount)
	{
		balance=balance + amount;
		System.out.println(amount+"rs.deposited");
	}
	public void withdrawal(double amount)throws AssignmentException
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			System.out.println(amount+" is withdrawal successfully..");
		}
		else
		{
			double needs=amount -balance;
			throw new AssignmentException(needs);
		}
	}
}

public class Q27
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		ATM a1=new ATM();
		System.out.println("enter amount from deposite");
		double amount=sc.nextDouble();
		a1.deposite(amount);
		System.out.println("enter amount from withdrawal");
		amount=sc.nextDouble();
		
		try
		{
			a1.withdrawal(amount);
		}
		catch(AssignmentException e)
		{
			System.out.println("Sorry, insufficient balance, you need more 500 Rs.To perform\r\n"
					+ "this transaction.");
		}
	}
}



