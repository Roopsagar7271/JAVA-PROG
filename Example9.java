//Q9) Write a java program swapping of two numbers?
import java.util.Scanner;
class Example9
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the second number:");
		int b=sc.nextInt();
		
		System.out.println("a= "+a+" and b= "+b);
		//logic
		int temp=a;
		 a=b;
	     b=temp;
		 System.out.println("a= "+a+" and b= "+b);
	
	}
}

//write a java program swapping of two nuber without using of third variable?
/*import java.util.Scanner;
class Example9
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first number:");
		int a=sc.nextInt();
		System.out.println("enter thes second number:");
		int b=sc.nextInt();
		System.out.println("a= "+a+" and b= "+b);
		    a=a+b;
		    b=a-b;
		    a=a-b;
	System.out.println("a= "+a+" and b= "+b);
	}
	
}
*/