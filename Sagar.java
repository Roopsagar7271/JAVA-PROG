

/*
class Student
{
	private String stuName;
	private int stuId;
	private String stuBranch;
	private double stuFees;
	
	public Student(String stuName,int stuId,String stuBranch,double stuFees)
	{
		this.stuName=stuName;
		this.stuId=stuId;
		this.stuBranch=stuBranch;
		this.stuFees=stuFees;
	}
	public void getStudentDetails()
	{
		System.out.println("The student name is:"+stuName);
		System.out.println("The student Id is"+stuId);
		System.out.println("The student branch is:"+stuBranch);
		System.out.println("The student Fees is"+stuFees);
	}
}
class Sagar
{
	public static void main(String[] args)
	{
		Student stu=new Student("Roopsagar",91,"ECE",400000d);
		stu.getStudentDetails();
		
}		
}
*/
/*
class Employee
{
	private int empId;
	private String empName;
	private double empSal;
	
	
	public Employee(int empId,String empName,double empSal)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
	}
	public void getEmployeeDetails()
	{
		System.out.println("The Employee ID is"+empId);
		System.out.println("The Employee ID is"+empName);
		System.out.println("The Employee ID is"+empSal);
	}
}
class Sagar
{
	public static void main(String[] args)
	{
		Employee e=new Employee(102,"Roopsagar",200000d);
		e.getEmployeeDetails();
		
	}
		
	
}
*//*
interface A
{
	public abstract void m1();
}
interface B
{
	public  abstract void m2();
}
interface C extends A,B
{
	public abstract void m3();
}
class D implements C
{
	public void m1()
	{
		System.out.println("Hi iam Rooopsagar");
    }
     public void m2()
	{
	System.out.println("hello man");
	}
  public void m3()
	{
		System.out.println("hiii man");
		
 }
}
class Sagar
{
	public static void main(String[] args)
	{
		C c=new D();
		c.m1();
		c.m2();
		c.m3();
}
}
*//*
interface A
{
	public abstract void view();
	public void show();
	abstract void display();
	void see();
	public abstract void start();
}
class B implements A
{
	public void view()
	{
		System.out.println("VIEW METHOD");
	}
	public void display()
	{
		System.out.println("DISPLAY METHOD");
	}
	public void show()
	{
		System.out.println("Show method");
		
	}
	public void see()
	{
		System.out.println("See method");
	}public void start()
	{
		System.out.println("Start Method");
	}
	
	}
	class Sagar
	{
		public static void main(String[]args)
		{
			B a=new B();
			a.see();
			a.view();
			a.display();
			a.show();
			a.start();
				
	}
}
*//*
interface Father
{
	 float HT=5.8f;
	 void height();
}
interface Mother
{
	float HT=6.2f;
	void height();
	
}
class Child implements Father,Mother
{
	public void height()
	{
	System.out.println("The child height is"+(Father.HT+Mother.HT)/2);
	}
	
}
class Sagar
{
public static void main(String[]args)
	{
	Child ch=new Child();
	ch.height();
}
}
*/
/*
class A 
{
	int i=10;
	int j=20;
	A(int i,int j)
	{
		System.out.println(i+" "+j); //  100  200
		System.out.println(this.i+" "+this.j); //10  20
	}
}
class Sagar
{
	public static void main(String[] args)
	{
		A a =new A(100,200);
	}
}
*/
/*
class A 
{
	public void m1()
	{
		System.out.println("M1-Method");
	}
}
class B extends A  
{
	public void m2()
	{
		System.out.println("M2-Method");
	}
}
class C extends B  
{
	public void m3()
	{
		System.out.println("M3-Method");
	}
}
class D extends C
{
	public void m4()
	{
	System.out.println("Heello world");
	}
}
class Sagar
{
	public static void main(String[] args)
	{
		A a=new A();
		a.m1();
		
		B b=new B();
		b.m1();
		b.m2();
		
		C c=new C();
		c.m1();
		c.m2();
		c.m3();
		D d=new D();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
	}  
}

*/

class Account 
{
	private double balance;
	/*public void setbalance(double balance)
	{
		this.balance=balance;
		}
		public double getbalance()
	{
			return balance;
	}
}*/
	
}
class Sagar
{
	public static void main(String[] args)
	{
		Account account=new Account();
		System.out.println(account.balance);
		
	}
}
