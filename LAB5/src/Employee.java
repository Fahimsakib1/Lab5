
public class Employee 
{
    String Name;
    String ID;
    double Salary;
    
    
	public String getName()
	{
		return Name;
	}
	public void setName(String name) 
	{
		Name = name;
	}
	public String getID() 
	{
		return ID;
	}
	public void setID(String iD)
   {
		ID = iD;
	}
	public double getSalary() 
	{
		return Salary;
	}
	public void setSalary(double salary) 
	{
		Salary = salary;
	}
	
	
     public Employee()
	
	{
		
	}
	
	public Employee(String name, String iD, double salary)
	
	{
		
		Name = name;
		ID = iD;
		Salary = salary;
	}
	
	public void Show()
	{
		
		System.out.println(" Name is : " +Name);
		System.out.println(" ID is : " +ID);
		System.out.println(" Salary is : " +Salary + " Taka");
	}
		
	
	
    
    
}
