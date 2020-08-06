class ATE extends Tester 
{
	static int Nae=0;  // Number of Automation Engineers
	private String designation="Automation Engineer";
	
	{
		System.out.println("Welcome , AUTOMATION TEST ENGINEER");
		System.out.println("-----------------------");
	}
	
	
	ATE()
	{}
	
	//paramerised constructor
	ATE(String s,double sal)
	{
		super(s,sal);    //calling superclass constructor
		Nae++;      
	}

	
}
