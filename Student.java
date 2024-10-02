//Write a java program to accept six marks of a student hten find out total and average?

import java.util.Scanner;

class Student
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of Telugu:");
		 int m1=sc.nextInt();
		 System.out.println("Enter the marks of Hindi:");
		 int m2=sc.nextInt();
		 System.out.println("Enter the marks of English:");
		 int m3=sc.nextInt();
		 System.out.println("Enter the marks of maths:");
		 int m4=sc.nextInt();
		 System.out.println("Enter the marks of Social:");
		 int m5=sc.nextInt();
		 System.out.println("Enter the marks of Science:");
		 int m6=sc.nextInt();
		 //logic
		 float total=m1+m2+m3+m4+m5+m6;
		 float average=(total)/6;
		 System.out.println("The total marks are="+total);
		 System.out.println("The average of marks is="+average);
		 
	}
}
