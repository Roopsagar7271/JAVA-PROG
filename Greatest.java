//Q)write a java program to find greatest of two number?
/*
import java.util.Scanner;
class Greatest
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the Second number:");
		int b=sc.nextInt();
		if (a>b)
		{
			System.out.println("The greater is a="+a);
		}
		if(b>a)
			System.out.println("The greater is b="+b);
	}
}

*/
//Q)Q)write a java program to find greatest of three number?

import java.util.Scanner;
class Greatest
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the Second number:");
		int b=sc.nextInt();
		System.out.println("Enter the Second number:");
		int c=sc.nextInt();
		if (a>b && a>c)
		{
			System.out.println("The greater is a="+a);
		}
		if(b>a && b>c)
			System.out.println("The greater is b="+b);
		if(c>b && c>a)
			System.out.println("The greater is c="+c);
			
	}
}
