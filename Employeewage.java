public class Employeewage
{
	private void doCalculation()
  {
		System.out.println("Welcome to Employee Wage Builder");
  // contents
  		int is_Full_Time = 1;
    //computation
  		double empCheck = Math.floor(Math.random() * 10) % 2;
  		if (empCheck == is_Full_Time)
    		System.out.println("Employee is present ");
  		else
   		 System.out.println("Employee is Abscent");
	}
	public static void main(String[] args){
  		Employeewage employeewage = new Employeewage();
  		employeewage.doCalculation();
	}
}
