import java.util.Scanner;
class Exple
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal amount:");
		float principal=sc.nextFloat();
		System.out.println("Enter the time (in years):");
		float time=sc.nextFloat();
		System.out.println("Enter the interest rate:");
		float rate=sc.nextFloat();
		 
		 float simpleInterest=(principal*time*rate)/100;
		 System.out.println("The simple interest is ="+simpleInterest);
	}
}
