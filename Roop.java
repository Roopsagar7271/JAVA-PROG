class Employee
{
	private int empId;
	private String empName;
	private double empSal;
}
public Employee(int empId,String empName,double empSal)
{
	this.empId=empId;
	this.empName=empName;
	this.empId=empSal;
}
public int getEmployeeDetails()
{
	System.out.println("Employee id :"+empId);
	System.out.println("Employee id :"+empName);
	System.out.println("employee salary:"+empSal);
}
class Roop
{	
	public static void main(String[] args) 
	{
		Employee e=new Employee(20003,"Roopsagar",100000d);
		e.getEmployeeDetails();
	}
}
