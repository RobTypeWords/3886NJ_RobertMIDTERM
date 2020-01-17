package design;

import java.util.Scanner;

public class EmployeeInfo extends aba {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
			//Encapsulate info
	static String companyName;	/// Already Done
	private int EmployeeID;		//Done
	private String Name;		//Done
	private String DepartmentName;	//Done
	private char GENDER;			//Done
	private double Salary;		//Done
	private int Benefit;	//Done
	private int Age;	//Done

	
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
			// My list of constructors
	public EmployeeInfo(){}

	public EmployeeInfo( int employeeId, String name, int age, double salary, String departmentName, char gender){	//DONE

		this.EmployeeID = employeeId;
		this.Name = name;
		this.Age = age;
		this.Salary= salary;
		this.DepartmentName = departmentName;
		this.GENDER = gender;
	}
	public EmployeeInfo( int employeeId){	//DONE

		this.EmployeeID = employeeId;

	}

	public EmployeeInfo( int employeeId, String name){	//DONE

		this.EmployeeID = employeeId;
		this.Name = name;

	}


	public EmployeeInfo( int age, double salary, String departmentName, char gender){	//DONE
		this.Age = age;
		this.Salary= salary;
		this.DepartmentName = departmentName;
		this.GENDER = gender;
	}



				// End of my of Constructors

			//Getters and setters for encapsulations

	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		EmployeeInfo.companyName = companyName;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {		//HERE!!!!!!!!!!!!!!!!!
		EmployeeID = employeeID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.DepartmentName = departmentName;
	}

	public char getGENDER() {
		return GENDER;
	}

	public void setGENDER(char gender) {
		this.GENDER = gender;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		this.Salary = salary;
	}

	public int getBenefit() {
		return Benefit;
	}

	public void setBenefit(int benefit) {
		this.Benefit = benefit;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}


	// Implementation


	@Override
	public String employeeName() {
		return null;
	}
	@Override
	public int employeeId() {			//here
		return 0;
	}

	@Override
	public void assignDepartment() {
		System.out.println("Now you are assigned to this department");
	}

	@Override
	public void benefitLayout() {
		System.out.println("We will change the benefits!");
	}

	@Override
	public int calculateSalary() {
		return 0;
	}

	//@Override
	//public void benefitLayout() {

	//}

				// Abtract implementations

	@Override
	public void welcome() {
		System.out.println("Welcome to your new job!");
	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeeBonus(int Yearlysalary , int Performance){		// DONE
		double totalBonus = 0;		// Cant change to a double -> Cast instead to get percentage
		if(Performance == 1){
			totalBonus = Yearlysalary* 0.2;
		} else if (Performance == 2){
			totalBonus = Yearlysalary* 0.3;
		} else if (Performance == 3) {
			totalBonus = Yearlysalary * 0.4;
		}
		return (int) totalBonus;
	}





	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static int calculateEmployeePension(int SALARY){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
		String startYear = convertedJoiningDate.substring(convertedJoiningDate.length() -4,convertedJoiningDate.length());
		String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length() -4 ,convertedTodaysDate.length());
		int start = Integer.parseInt(startYear);
		int current = Integer.parseInt(currentYear);
		int numberOfYears = current - start;

		//Calculate pension

				if(numberOfYears >= 5){
					total = (int) (SALARY * .25);
				} else if (numberOfYears ==4){
					total = (int) (SALARY * .20);
				} else if (numberOfYears ==3){
					total = (int) (SALARY * .15);
				}else if (numberOfYears == 2){
					total = (int) (SALARY * .10);
				}else if (numberOfYears == 1){
					total = (int) (SALARY * .05);
				}
				return total;
	}





	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}


	}
}
