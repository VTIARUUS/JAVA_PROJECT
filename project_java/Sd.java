class Sd extends Dev
{
	static int Nsd=0;  // Number of SeniorDeveloper
	private String designation="Senior Developers";
	
	{
		System.out.println("Welcome , SENIOR DEVELOPER");
		System.out.println("-----------------------");
	}
	
	
	Sd()
	{}
	
	//paramerised constructor
	Sd(String s,double sal)
	{
		super(s,sal);    //calling superclass constructor
		Nsd++;      
	}

	
}
