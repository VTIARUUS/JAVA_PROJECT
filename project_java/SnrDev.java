class SnrDev extends Developer
{
	private String designation="Senior Developers";
	//getter()  method for designation
	
	

	public static void main(String []args)
	{
		Employee e1=new Employee("hemendra",15363.4);
		e1.display();
		System.out.println(e1.getEname());
		System.out.println(e1.getEid());
		System.out.println(e1.getEsal());
		e1.setEname("Ajay");
			System.out.println("-------------------------");
		e1.display();


		System.out.println("-------------------------");
		Employee e2=new Employee("Rahul",5453.12);
		e2.display();
		System.out.println("-------------------------");
		Employee e3=new Employee("shri",20000);
		e3.display();
		System.out.println(e1.getTotalEmp());

	}
}
