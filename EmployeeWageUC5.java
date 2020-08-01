class EmployeeWageUC5
{

	public static void main(String[] args)
	{
		final int isfull=1;
		final int isparttime=2;
		int emprateperhour=20;
		int emphours=0;
		int empwage=0;
		int totalworkingdays=20;
		int monthsalary=0;
		int i=0;
		for (i=0;i<totalworkingdays;i++){
		double empcheck=Math.floor(Math.random() *10)%3;
		switch((int)empcheck){
		case isfull:
			emphours=8;
			break;
		case isparttime:
			emphours=4;
			break;
		default:
			emphours=0;
		}
	empwage=emphours*emprateperhour;
        monthsalary+=empwage;
	}
      System.out.println("Monthly Wage :"+monthsalary);

	}

}
