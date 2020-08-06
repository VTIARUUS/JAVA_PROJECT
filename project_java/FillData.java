class FillData 
{
	
		public static void main(String []args)
	{
		//Senior Developer
		Sd e1=new Sd("Hemendra",1000.00);
		e1.display();
		System.out.println();
		Sd e2=new Sd("ravi",15000);
		e2.display();
		System.out.println();
		Sd e3=new Sd("ravi",15000);
		e3.display();
		System.out.println();
		System.out.println("--COMPANT DETAILS--");
		System.out.println(e1.getTotalEmp());
		System.out.println("No. of Senior Developer: "+Sd.Nsd);
		System.out.println();

		//junior developer
		Jd j1=new Jd("Rahul",17500);
		j1.display();
		System.out.println();
		Jd j2=new Jd("Allu arjun",1253.20);
		j2.display();
		System.out.println();
		System.out.println("---COMPANY DETAILS---");
		System.out.println(e1.getTotalEmp());
		System.out.println("No. of junior Developer: "+Jd.Njd);
		System.out.println("No. of Senior Developer: "+Sd.Nsd);
		System.out.println();

		//ATE
		ATE a1=new ATE("Sunny",15750);
		a1.display();
		System.out.println();
		ATE a2=new ATE("Rajnikant",17470.26);
		a2.display();
		System.out.println();
		System.out.println("---COMPANY DETAILS---");
		System.out.println(e1.getTotalEmp());
		System.out.println("No. of Senior Developer: "+Sd.Nsd);
		System.out.println("No. of junior Developer: "+Jd.Njd);
		System.out.println("No. of Automation test Engineer: "+ATE.Nae);
		System.out.println();


		//MTE
		MTE m1=new MTE("Jethalal",25365.23);
		m1.display();
		System.out.println();
		MTE m2=new MTE("ChampakLal",18870.26);
		m2.display();
		System.out.println();
		System.out.println("---COMPANY DETAILS---");
		System.out.println(e1.getTotalEmp());
		System.out.println("No. of Senior Developer: "+Sd.Nsd);
		System.out.println("No. of junior Developer: "+Jd.Njd);
		System.out.println("No. of Automation test Engineer: "+ATE.Nae);
		System.out.println("No. of Manual test Engineer: "+MTE.Nme);
		System.out.println();

		//Recruiter
		Recruiter r1=new Recruiter("Aishwariya Rai",56000);
		r1.display();
		System.out.println();
		Recruiter r2=new Recruiter("Salman Khan",74000);
		r2.display();
		System.out.println();
		Recruiter r3=new Recruiter("Kaitrina kaif",15000);
		r3.display();
		System.out.println();
		System.out.println("---COMPANY DETAILS---");
		System.out.println(e1.getTotalEmp());
		System.out.println("No. of Senior Developer: "+Sd.Nsd);
		System.out.println("No. of junior Developer: "+Jd.Njd);
		System.out.println("No. of Automation test Engineer: "+ATE.Nae);
		System.out.println("No. of Manual test Engineer: "+MTE.Nme);
		System.out.println("No. of Recuiter: "+Recruiter.Nr);
		System.out.println();


		

	}
	
}
