class MTE extends Tester 
{
		static int Nme=0;  // Manual TestEngineer
	private String designation="Manual Test Engineer";
	
	{
		System.out.println("Welcome , MANUAL TEST ENGINEER");
		System.out.println("-----------------------");
		//System.out.println();
	}
	
	
	MTE()
	{}
	
	//parameterised constructor
	MTE(String s,double sal)
	{
		super(s,sal);
		Nme++;
	}

}
