class Emp
{
	private String Ename;
	private int Eid;
	private double Esalary;

	public static void work()
	{
		System.out.println("Employee is working ");
	}

	static int idNo=0; //Count total Number of Employee
	
	//construcotr
	Emp()
	{}
	
	Emp(String name,double sal)
	{
		this.Ename=name;
		
		this.Esalary=sal;
		
		this.setEmployeeId();
	}

	//getter method for Ename

	public String getEname()
	{
		return Ename;
	}

	//setter method for Ename

	public void setEname(String str)
	{
		this.Ename=str;
	}

	//getter method for Eid
	public int getEid()
	{
		return Eid;
	}
	
	//No Setter method for Eid()
	/*public void setEid(int ide)
	{
		this.Eid=ide;
	}
	*/

	//getter method for Esal 
	public double getEsal()
	{
		return Esalary;
	}

	//setter method for Esal
	public void setEsal(int s)
	{
		this.Esalary=s;
	}

	//to Display 

	public void display()
	{

		System.out.println("Name: "+Ename);
		System.out.println("EmployeeId: "+Eid);
		System.out.println("Salary: "+Esalary);
	}
	

		//generating Auto Employee IDE;
	
	
	public void setEmployeeId()
	{
		this.Eid=idNo++;

	}

	//override toString();
	public String toString()
	{
		return "TGA"+Eid;
	}
		
	//total number of employees
	public int getTotalEmp()
	{
		System.out.print("Total number of Employee in a company are: ");
		return idNo;
	}

}




