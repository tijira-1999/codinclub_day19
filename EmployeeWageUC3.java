class EmployeeWageUC3
{

	public static void main(String[] args)
	{
		int isfull=1;
		int isparttime=2;
		int emprateperhour=20;
		int emphours=0;
		int empwage=0;
		double empcheck=Math.floor(Math.random() *10)%3;
		if(empcheck==isfull)
		{
			emphours=8;
		}
		else if(empcheck==isparttime)
		{
			emphours=4;
		}
		else
		{
			emphours=0;
		}
	empwage=emphours*emprateperhour;
        System.out.println("Employee Wage :"+empwage);
	}
}
