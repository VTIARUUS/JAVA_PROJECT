class Recruiter extends HR 
{
	static int Nr=0;  // Number of Recruiter
	private String designation="Recruiters";
	
	{
		System.out.println("Welcome , RECRUITERS");
		System.out.println("-----------------------");
	}
	
	
	Recruiter()
	{}
	
	//paramerised constructor
	Recruiter(String s,double sal)
	{
		super(s,sal);    //calling superclass constructor
		Nr++;      
	}

	
}
