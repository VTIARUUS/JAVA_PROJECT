class Jd extends Dev 
{
		static int Njd=0;  // Number of JuniorDeveloper
	private String designation="Senior Developers";
	
	{
		System.out.println("Welcome , JUNIOR DEVELOPER");
		System.out.println("-----------------------");
		//System.out.println();
	}
	
	
	
	Jd()
	{}
	
	Jd(String s,double sal)
	{
		super(s,sal);
		Njd++;
	}

}
