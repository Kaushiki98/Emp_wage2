public class Employeewage
{
	private void doCalculation()
  {
	System.out.println("Welcome to Employee Wage Builder");
		// contents
		int is_Full_Time = 1;
		int is_Part_Time = 2;
		int Wage_per_hour = 20;
		int no_of_hours = 8;
		int no_of_part_time_hour = 4;
		int days = 20;
		//computation
		int empCheck =(int) (Math.floor(Math.random() * 10) % 2);
		switch (empCheck){
		case 0:
			System.out.println("Employee is present ");
			int Payment = Wage_per_hour * no_of_hours * days;
			System.out.println("Payment is: "+ Payment);
			break;
		case 1:
			System.out.println("Employee is part time");
			int Payments = Wage_per_hour * no_of_part_time_hour * days;
			System.out.println("Part time Payment is: "+ Payments);
			break;
		}
	}
	public static void main(String[] args)
	{
  		Employeewage employeewage = new Employeewage();
  		employeewage.doCalculation();
	}
}
