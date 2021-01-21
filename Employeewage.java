public class Employeewage
{
	private void doCalculation()
  {
	System.out.println("Welcome to Employee Wage Computation");
		// contents
		int is_Full_Time = 1;
		int Wage_per_hour = 20;
		int no_of_hours = 100;
		int days = 20;
		//computation
		int empCheck =(int) (Math.floor(Math.random() * 10) % 2);
		if(empCheck == is_Full_Time){
			System.out.println("Employee is present ");
			int Payment = Wage_per_hour * no_of_hours * days;
			System.out.println("Full time Payment for one month: "+ Payment);
		}
		else{
			System.out.println("Employee is Abscent");
		}
	}
	public static void main(String[] args)
	{
  		Employeewage employeewage = new Employeewage();
  		employeewage.doCalculation();
	}
}
