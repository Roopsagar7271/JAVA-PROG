/*abstract class Animal       //abstract class
{
	String name;
	abstract void sound();  ///abstract method
	public Animal(String name)
	{
		this.name=name;
	}
	public String getName()  // concreate method
	{
		return name;
	}
}
class Dog extends Animal
{
	public Dog(String name)
	{
		super(name);
	}
	void sound()
	{
		System.out.println("BOW BOW");
	}
	
}
class Cat extends Animal
{
	public Cat(String name)
	{
		super(name);
	}
	void sound()
	{
		System.out.println("MEOW MEOW");
	}
	
}
class Anim
{
	public static void main(String[]args)
	{
		Animal dog=new Dog("PUPPY");
		System.out.println(dog.getName()+" "+"SAYS:");
		dog.sound();
		Animal cat=new Cat("WHISKER");
		System.out.println(cat.getName()+" "+"SAYS:");
		cat.sound();
	}
}*/
/*
abstract class Animal  // abstract class
{
	String name;       //instance variable
	abstract void sound();  //abstract method
	public Animal(String name)   //constructor
	{
		this.name=name;
	}
	public String getName()   //concrete method
	{
		return name;
	}
	
}
class Dog extends Animal
{
	public Dog(String name)
	{
		super(name);
	}
	void sound()
	{
		System.out.println("Boew BOW");
	}
	
}
class Cat extends Animal
{
	public Cat(String name)
	{
		super(name);
	}
	void sound()
	{
		System.out.println("meow meow");
	}
	
}
class Anim
{
	public static void main(String[]args)
	{
		Animal dog=new Dog("PUPPY");
		System.out.println(dog.getName()+"says"+" ");
		dog.sound();
		Animal cat=new Cat("whisker");
		System.out.println(cat.getName()+"says"+" ");
		cat.sound();
	}
}
*/
/*

abstract class Plan   //abstract class
{
 protected double rate;
 abstract void getRate();  // abstract method
 
 public void calculateBillAmt(int units)  //abstract method
{
	 System.out.println("total units"+units);
	 System.out.println("Total bill"+rate*units);
	 
	 
}
}
class DomesticPlan extends Plan
{
	public void getRate()
	{
		rate=2.5d;
	}
	
}
class CommercialPlan extends Plan
{
	public void getRate()
	{
		rate=5.0d;
	}
}
class Anim
{
	public static void main(String[]args)
	{
		DomesticPlan dp=new DomesticPlan();
		dp.getRate();
		dp.calculateBillAmt(250);
		CommercialPlan cp=new CommercialPlan();
		cp.getRate();
		cp.calculateBillAmt(250);
}
}
*/
//INTERFACE EXAMPLE
/*


interface Father
{
	float HT=6.2f;
	void height();
}
interface Mother
{
	float HT=5.8f;
	void height();
}

interface son extends Father,Mother
{
	void height();
	
	}
	
	
class Child implements son
{
	public void height()
	{
	float height=(Father.HT+Mother.HT)/2;
	System.out.println("child height is"+height);
	}
}
class Anim
{
	public static void main(String[]args)
	{
		Child ch=new Child();
		ch.height();
	}
}
*/

// hasA RELATIONSIP
/*
class Customer
{
	private int custId;
	private String custName;
	private Address address;
	public Customer(int custId,String custName,Address address)
	{
		this.custId=custId;
		this.custName=custName;
		this.address=address;
	}
	public int getCustId()
	{
		return custId;
	}
	public String getCustName()
	{
		return custName;
	}
	public Address getAddress()
	{
		return address;
	}
	
}
class Address
{
	private String houseNo;
	private String locality;
	private String city;
	public Address(String houseNo,String locality,String city)
	{
		this.houseNo=houseNo;
		this.locality=locality;
		this.city=city;
	}
	public String getHouseNo()
	{
		return houseNo;
	}
	public String getLocality()
	{
		return locality;
	}
	public String getCity()
	{
		return city;
	}
	public String toString()
	{
		return houseNo+""+locality+""+city;
	}
}
class Anim
{
	public static void main(String[]args)
	{
		Address add=new Address("102-a21","srnagar","hyderabad");
		Customer cust=new Customer(2003,"roopsagar",add);
		
		System.out.println(cust.getCustId());
		System.out.println(cust.getCustName());
		System.out.println(cust.getAddress());
	}
		
}
*/

/*
class Account 
{
	private double balance;

	public Account(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
}
 
class Anim
{
	public static void main(String[] args)
	{
		Account account=new Account(10000d);
		
		System.out.println(account.getBalance());
		
		}
}
*/


/*class Student
{
	private int stuId;
	private String stuName;
	private double stuFees;
	
	//setter methods
	public void setStuId(int stuId)
	{
		this.stuId=stuId;
	}
	public void setStuName(String stuName)
	{
		this.stuName=stuName;
	}
	public void setStuFees(double stuFees)
	{
		this.stuFees=stuFees;
	}
	
	
	//getter methods
	public int getStuId()
	{
		return stuId;
	}
	public String getStuName()
	{
		return stuName;
	}
	public double getStuFees()
	{
		return stuFees;
	}
	
}
class Anim
{
	public static void main(String[]args)
	{
		Student stu=new Student();
		stu.setStuId(101);
		stu.setStuName("Roopsagar");
		stu.setStuFees(10000d);
		
		System.out.println("the student ID is"+stu.getStuId());
		System.out.println("the student name is"+stu.getStuName());
		System.out.println("the student Fees is"+stu.getStuFees());
}
}
*/
/*
enum Months
{
	JAN,FEB,MARCH ,OCT;
}
class Anim
{
	public static void main(String[]args)
	{
		Months m=Months.JAN;
		System.out.println(m);
		Months m1=Months.MARCH;
		System.out.println(m1);
}
}
*
//*
enum Months
{
	SUN,MON,TUE,WED,THUR,FRI,SAT;
}
class Anim
{
	public static void main(String[]args)
	{
		Months[] m=Months.values();
		for (Months m1:m)
		{
			System.out.println(m1+"............."+m1.ordinal());
		}
		}
		
}
*/
/*
enum Weeks
{
	SAT,SUN,FRI,THUR,WED,TUE,MON;
	Weeks()
	{
		System.out.println("Roopsagar");
	}
}
class Anim
{
	public static void main(String[]args)
	{
		 Weeks w=Weeks.TUE;
		 
	}
	
}*/
   /*
  
  class Sagar
  {
	  private String name;
	public  Sagar(String name)
	  {	
		  this.name=name;
		  
      }
	  public String getName()
	  {
		  return name;
   }
  }
  class Anim
  {
		public static void main(String[]args)
	  {
			Sagar s=new Sagar("Helloword");
			System.out.println(s.getName());
	  }
  }	
  */
  
  
  
  class Anim
  {
	  public Anim()
	  {
		  public Anim(int i)
		  {
			  
			  System.out.println("HII");
		  }
		  System.out.println("Helloworld");
	  }
	  public static void main(String[] args)
	  {
		  Anim aa=new Anim(10);
		  Anim aa=new Anim();
	  }
	  
  }