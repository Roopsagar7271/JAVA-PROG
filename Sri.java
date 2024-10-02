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
}
*/
/*
abstract class Animal
{
	String name;
	abstract void sound();
	public Animal(String name)
	{
		this.name=name;
	}
	
	public String getName()
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
		System.out.println("BoW bOW");
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

class Anu
{
	public static void main(String[] args)
	{
		Animal dog=new Dog("PUPPY");
		System.out.println(dog.getName()+"Says");
		dog.sound();
		Animal cat=new Cat("Whisker");
		System.out.println(cat.getName()+"Says");
		cat.sound();
	}
}
		
*/
/*
abstract class Plan
{
	protected double rate;
	public abstract void getRate();
	
	public void calculateBillAmt(int units)
	{
		System.out.println("total rate is"+rate);
		System.out.println("Total bill is "+rate*units);
	}
	
	
}
class DomesticPlan extends Plan
{
	public void getRate()
	{
		rate=2.50d;
}
}
	
class CommercialPlan extends Plan
{
	public void getRate()
	{
		rate=5.0d;
}
}
class Anu
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
/*
class Vehicle
{
	void start()
	{
		System.out.println("the vehicle is started");
	}
	
}
class Car extends Vehicle
{
	public void fast()
	{
		System.out.println("The car going to very fast");
	}
	
}
class Audicar extends Vehicle
{
	public void stop()
	{
		System.out.println("The car is stoped");
	}
	
}
class Anu
{
	public static void main(String[]args)
	{
		Audicar a=new Audicar();
		a.start();
		a.stop();
		Car c=new Car();
		c.start();
		c.fast();
	}
			
}
*/
/*
class Student
{
	private int stuId;
	private String stuName;
	private double stuFees;
	
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
class Anu
{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.setStuId(1001);
		s.setStuName("roopsagar");
		s.setStuFees(10000.0d);
		
		System.out.println("The student id is "+s.getStuId());
		System.out.println("The student name is "+s.getStuName());
		
		System.out.println("The student fees is "+s.getStuFees());
	}
		
		
}
*/
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
	public Address getCustAddress()
	{
		return address;
	}
}
class Address
{
	private String houseNo;
	private String locality;
	private String city;
	
	
	public Address(String houseNo, String locality,String city)
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
		return locality;
	}
	public String toString()
	{
		
		return houseNo+" "+locality+" "+city;
	}
	
		
}
 class Anu
 {
	 public static void main(String[]args)
	 {
		Address add=new Address("1-4-65/1/A","Ameerpet","Hyderabad");
		
		 Customer cust=new Customer(101,"roopsagar",add);
		
		 System.out.println(cust.getCustId());
		System.out.println(cust.getCustName());
		System.out.println(cust.getCustAddress());

		 
	 }
	 
 }
 */
 /*
 class Animal
 {
	 String name;
	 public Animal(String name)
	 {
		 this.name=name;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 	 
	  void sound()
	 {
		 System.out.println("Animal is sounding");
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
		 System.out.println("The Dog is barking");
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
		 System.out.println("The  cat is meow moew");
	 }
 }
 class Sri
 {
	 public static void main(String[]args)
	 {
		 Animal dog=new Dog("puppy");
		 System.out.println(dog.getName()+"says");
		 dog.sound();
		 Animal cat=new Cat("Whisker");
		 System.out.println(cat.getName()+"says");
		 cat.sound();
	 }
 }
 */
 /*
 class MedicalRecord
 {
	 private String patientName;
	 private String medicalHistory;
	 private String treatmentPlan;
	 MedicalRecord(String name,String history,String treatment)
	 {
		 this.patientName=name;
		 this.medicalHistory=history;
		 this.treatmentPlan=treatment;
	 }
	 
	 public String getMedicalHistory()
	 {
		 return medicalHistory;
	 }
	 public void setTreatmentPlan(String treatmentPlan)
	 {
		 this.treatmentPlan=treatmentPlan;
	 }
	 public String getTreatmentPlan()
	 {
		 return treatmentPlan;
	 }
	 
		 
 }
 class Doctor
 {
	 public void updateTreatment(MedicalRecord record, String newtreatment)	 
	 {
		 record.setTreatmentPlan(newtreatment);
	 }
	
	 public void viewMedicalHistory(MedicalRecord record)
	 {
		 System.out.println("Medical history:"+record.getMedicalHistory());
	 }
		 
		 
 }
 class Nurse
 {
	 public void viewTreatmentPlan(MedicalRecord record)
	 {
		 System.out.println("medical records are"+record.getTreatmentPlan());
	 }
 }
 class Sri
 {
	 public static void main(String[]args)
	 {
		MedicalRecord record=new MedicalRecord(" jhone dee","htgfdfngf","jhgrtdfdhjv");
		
		Doctor d=new Doctor();
		Nurse s=new Nurse();
		
		
		 d.viewMedicalHistory(record);
        d.updateTreatment(record, "Steroids");

        // Nurse views the patient's treatment plan
        s.viewTreatmentPlan(record);
 }
 }
 */
class Student
{
	private String stuName;
	private int stuId;
	private double stuFees;
	private String stuMarks;
	
	public void setStuName(String stuName)
	{
		this.stuName=stuName;
	}
	public void setStuId(int stuId)
	{
		this.stuId=stuId;
	}
	public void setStuId(double stuFees)
	{
		this.stuFees=stuFees;
	}
	public void setStuId(String stuMarks)
	{
		this.stuMarks=stuMarks;
	}
	
	public String getStuName()
	{
		return stuName;
	}
	
	public int getStuId()
	{
		return stuId;
	}
	
	public double getStuFees()
	{
		return stuFees;
	}
	
	public String getStuMarks()
	{
		return stuMarks;
	}
	
}
class Management
{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.setStuName("jhon");
		s.stuId(123);
		s.stuFees(10000.0d);
		s.stuMarks("Pass");
			System.out.println("The student name is"+s.getStuName());
		
			System.out.println("The student id is"+s.getStuId());
		
			System.out.println("The student Fees etails are"+s.getStuFees());
		
			System.out.println("The student is"+s.getStuMarks());
		
}
}
