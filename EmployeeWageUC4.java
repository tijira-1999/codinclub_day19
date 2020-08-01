class EmployeeWageUC4
{

	public static void main(String[] args)
	{
		final int isfull=1;
		final int isparttime=2;
		int emprateperhour=20;
		int emphours=0;
		int empwage=0;
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
        System.out.println("Employee Wage :"+empwage);
	}
}
