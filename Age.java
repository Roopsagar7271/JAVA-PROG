import java.util.Scanner;
class Age
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the age");
    int age=sc.nextInt();
    
    if(age>18)
    {
    System.out.println("elligible to vote");
    }
    else
    {
    System.out.println("UR not elligible to vote"); // returns true (25 year olds are allowed to vote!) 
    }
  }
}
