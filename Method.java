
//with NOreturn type and no arguments
/*// FACTORIAL OF A GIVEN NUMBER
import java.util.Scanner;
class Method
{
	public static void main(String[] args) 
	{
		factorial();
}
//callie method
public static void factorial()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int fact=1;
	for (int i=n;i>=1 ;i-- )
	{
		fact=fact*i;
	}
	System.out.println(fact);
	
}
}*/

//sum of two numbers
/*
import java.util.Scanner;
class Method
{
	public static void main(String[] args) 
	{
		//caller method
		sum();
}
//callie method
public static void sum()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	int a=sc.nextInt();
	System.out.println("Enter the second number");
	int b=sc.nextInt();
	
	int c=a+b;
	System.out.println(c);
}
}
*/
//PALINDROME OR NOT
/*
import java.util.Scanner;
class Method
{
	public static void main(String[] args) 
	{   
		//caller method
		palindrome();
}
//callie method
public static void palindrome()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int temp=n;
	int rem,rev=0;
	while (n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if (temp==rev)
	{
		System.out.println(temp+"is polindrome number");
	}
	else
		System.out.println("its not polindrome number");
	
}
}

*/

//ARMSTRONG NUMBER 
/*
import java.util.Scanner;
class Method
{
	public static void main(String[] args) 
	{
		armstrong();
}
//callie method
public static void armstrong()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int temp=n;
	int rem,sum=0;
	while (n>0)
	{
		rem=n%10;
		sum=sum+rem*rem*rem;
		n=n/10;
	}
	if (temp==sum)
	{
		System.out.println(temp+"is armstrong number");
	}
	else
		System.out.println("its not armstrong number");
	
}
}
/*/




//WITH NO RETURN TYPE WITH ARGUMENTS
/*
//SUM OF TWO NUMBERS
import java.util.Scanner;
class Method
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number:");
	int a=sc.nextInt();
	System.out.println("Enter the second number:");
	int b=sc.nextInt();
		//caller method
		sum(a,b);
	}
	//callie method
	public static void sum(int a,int b)
	{
		
	int c=a+b;	
		
	System.out.println("sum of two numbers is"+c);	
	}
}
*/
//FACTORIAL OF A GIVEN NUMBER
/*
import java.util.Scanner;
class Method
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number");
		int n=sc.nextInt();
		factorial(n);
}
//callie method
public static void factorial(int n)
{
	
	int fact=1;
	for (int i=n;i>=1 ;i-- )
	{
		fact=fact*i;
	}
	System.out.println(fact);
	
}
}
*/

//PALINDROME OR NOT?
/*
import java.util.Scanner;
class Method
{
	public static void main(String[] args) 
	{   
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		//caller method
		palindrome(n);
}
//callie method
public static void palindrome(int n)
{
	
	int temp=n;
	int rem,rev=0;
	while (n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if (temp==rev)
	{
		System.out.println(temp+"is polindrome number");
	}
	else
		System.out.println("its not polindrome number");
	
}
}
*/

/*
//ARMSTRONG NUMBER 

import java.util.Scanner;
class Method
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		armstrong(n);
}
//callie method
public static void armstrong(int n)
{

	int temp=n;
	int rem,sum=0;
	while (n>0)
	{
		rem=n%10;
		sum=sum+rem*rem*rem;
		n=n/10;
	}
	if (temp==sum)
	{
		System.out.println(temp+"is armstrong number");
	}
	else
		System.out.println("its not armstrong number");
	
}
}
*/
//reverse of a given number
/*
import java.util.Scanner;
class Method
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		reverse(n);
	}
	//callie method
	public static void reverse(int n)
	{
		int rem;
		while (n>0)
		{
		
			rem=n%10;
			switch (rem)
			{
			case 0:
				System.out.print("zero");
				break;
				
			case 1:
				System.out.print("One");
				break;	
			case 2:
				System.out.print("Two");
				break;
			case 3:
				System.out.print("Three");
				break;	
			case 4:
				System.out.print("four");
				break;	
			case 5:
				System.out.print("five");
				break;
			case 6:
				System.out.print("six");
				break;	
			case 7:
				System.out.print("seven");
				break;	
			case 8:
				System.out.print("Eight");
				break;	
			case 9:
				System.out.print("nine");
				break;
				default:
					break;
			
			}
			n=n/10;
			
		}
		System.out.println();
	}	
	
	}*/
	/*
	
	import java.util.Scanner;
class Method
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		reverse(n);
	}
	//callie method
	public static void reverse(int n)
	{
		int rem,rev=0;
		while (n>0)
		{
		
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		System.out.println("The reverse of a given number is"+rev);
	}	
	
	}
	*/
	//WITH  RETURN TYPE AND with NO ARGUMENTS
	//ARMSTRONG NUMBER
	/*
	import java.util.Scanner;
	class Method
	{
		public static void main(String[] args)
		{
			
		boolean b= armstrong();
		if (b)
		{
			System.out.println("The given numebr is armstromg number");
		}
		else
			System.out.println("Its NOT ARMSTRONG NUMBER");
		   	
		}
	//callie method
	public static boolean armstrong()
		
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		int rem,sum=0;
		while (n>0)
		{
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		
		return temp==sum;
	}
	}
	
	*/
	
	
	
// FACTORIAL OF A GIVEN NUMBER
/*
import java.util.Scanner;
class Method
{
	public static void main(String[] args) 
	{
		int k=factorial();
		System.out.println(k);
}
//callie method
public static int factorial()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int fact=1;
	for (int i=n;i>=1 ;i-- )
	{
		fact=fact*i;
	}
	return fact;
	
	
}
}
*/

//Sum of two number
/*

import java.util.Scanner;
class Method
{
	public static void main(String[] args) 
	{
		//caller method
		int k=sum();
		System.out.println(k);
}
//callie method
public static int sum()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	int a=sc.nextInt();
	System.out.println("Enter the second number");
	int b=sc.nextInt();
	
	int c=a+b;
	return c;
}
}
*/

/*
import java.util.Scanner;
class Method
{
	public static void main(String[] args) 
	{   
		
		
		//caller method
		boolean b=palindrome();
		if (b)
		{
		System.out.println("is polindrome number");
	}
	else
		System.out.println("its not polindrome number");
}
//callie method
public static boolean palindrome()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	
	int temp=n;
	int rem,rev=0;
	while (n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	return temp==rev;
}
}
*/


import java.util.Scanner;
class Method
{
	public static void main(String[] args) 
	{   
		
		
		//caller method
		int k=palindrome();
		System.out.println(k);
}
//callie method
public static int palindrome()
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
	
	int temp=n;
	int rem,rev=0;
	while (n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	return rev;
}
}