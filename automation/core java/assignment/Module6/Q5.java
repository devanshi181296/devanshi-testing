package Module6;

//W.A.J.P to check given number is Armstrong or not?

import java.util.Scanner;

public class Q5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter any no..");
		int no=sc.nextInt();
	    int copy=no,sum=0;
	    while(no>0)  //153 ; 15 ; 1
	    	
	  {
		  int t= no%10;  //t=3  ; t=5  ; t=1
		  sum =sum+(t*t*t); // sum=27; sum=152; sum=153
		  no= no/10; // no=15; no=1; no=0
	  }
	  if(copy==sum)
	  {
		  System.out.println("your no is armstrong.."+sum);
	  }
	  else
	  {
		  System.out.println("your no is not a armstrong.."+sum);
	  }
	}
}

