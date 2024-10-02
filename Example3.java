
//Q1)write a java program to find a cube of  of given number

import java.util.Scanner;
class Example4
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int n=sc.nextInt();
	//logic
	int cube=n*n*n;
	System.out.println("The cube of given number is="+cube);
	
	}
}
