//Q]Write the java program check whether Positive or negative?

import java.util.Scanner;
class  PosNeg
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n==0)
		{
			System.out.println("The number is not positive and not a negative");
		}
		if(n>0)
		{
			System.out.println("The given number is positive:");
		}
		
		else
		{
			System.out.println("The given number is negative:");
		}
	}
}