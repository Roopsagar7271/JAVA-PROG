import java.util.Scanner;
class Addition
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int a=sc.nextInt();
		System.out.println("Enter the second number:");
		int b=sc.nextInt();
		//logic
		int c=a+b;
		System.out.println("Sum of two numbers:"+c);
	}
}
