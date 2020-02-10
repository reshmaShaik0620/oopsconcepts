package com.epam.oopconcepts;
import java.util.Scanner;

public class App{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("\nEnter an operation (+,-,*,/):");
		char opa=sc.next().charAt(0);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		int result=0;
		if(opa=='+')
		{
			Sum s=new Sum();
			result=s.calci(a,b);
			System.out.println(result);
		}
		else if(opa=='-')
		{
			Sub d=new Sub();
			result=d.calci(a,b);
			System.out.println(result);
		}
		else if(opa=='*') {
			Mul mu=new Mul();
			result=mu.calci(a,b);
			System.out.println(result);
		}
		else if(opa=='/')
		{
			Div di=new Div();
			result=di.calci(a,b);
			System.out.println(result);
		}
		else {
			System.out.println("Please enter a valid operation");
		}
		
		}
}