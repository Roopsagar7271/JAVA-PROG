//Q)Write a java program to check whether the given number is even or odd?
/*
import java.util.Scanner;
class  EvenOdd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		if(n==0)
			System.out.println("The numer neither even nor odd");
		    System.exit(0);
		if(n%2==0)
			System.out.println("the number is even");
		else
			System.out.println("The number is odd");
	}
}
*/
//Q)Write a java program to check whether the given number is odd or not?
import java.util.Scanner;
class  EvenOdd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		if(n%2!=0)
			System.out.println("the number is odd");
		else
			System.out.println("The number is not odd");
	}
}
