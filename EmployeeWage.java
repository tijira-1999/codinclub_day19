public class EmployeeWage{
	public static void main(String[] args){
		int IsFulltime = 1;
		//System.out.println(Math.random());
		double empCheck=Math.floor(Math.random() * 10) % 2;
		if(empCheck==IsFulltime)
			System.out.println("Employee present");
		else
			System.out.println("Employee absent");
	}
}
