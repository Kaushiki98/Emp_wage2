public class Employeewage
{
	private void doCalculation()
  {
		System.out.println("Welcome to Employee Wage Builder");
  // contents
  		int is_Full_Time = 1;
		int Wage_per_hour = 20;
		int no_of_hours = 8;
    //computation
  		double empCheck = Math.floor(Math.random() * 10) % 2;
  		if (empCheck == is_Full_Time)
		{
    		System.out.println("Employee is present ");
  			int Payment = Wage_per_hour * no_of_hours;
			System.out.println("Payment is: "+ Payment);
		}
		else
		{
			System.out.println("Employee is Abscent");
			System.out.println("Payment is 0");
		}
	}
	public static void main(String[] args)
	{
  		Employeewage employeewage = new Employeewage();
  		employeewage.doCalculation();
	}
}
