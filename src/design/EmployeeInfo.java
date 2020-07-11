package design;

import Contract2.Contract2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class EmployeeInfo {

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
	private static String companyName="arby";
	private final String SSN="";
	private String phoneNumber;
	private String address="not available";
	private String accountNumber="no bank information";
	private Contract2 contract;
	private final String birthDate="";
	private int employeeId;
	private String employeeName;
	private double salary;

	
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(Department2 department, String location, String employeeName, int employeeId, Contract2 contract2, Department2 department2){
        this(department,location,"","",contract2,employeeId,employeeName,0.0, department2);
        this.accountNumber="not available";
        this.phoneNumber="not available";
        this.address="not available";
        this.accountNumber="no bank information";
        
	    
    }

    public EmployeeInfo(Department2 department, String location, String phoneNumber, String address, Contract2 contract2, int employeeId, String employeeName, double salary, Department2 department2)
    {
        this(department2,location,phoneNumber,address,"",contract2,employeeId,employeeName,salary);
    }

    public EmployeeInfo(Department2 department, String location, String phoneNumber, String address, String accountNumber, Contract2 contract2, int employeeId, String employeeName, double salary) {

    this.phoneNumber = phoneNumber;
    this.address = address;
	this.accountNumber = accountNumber;
	this.contract = contract2;
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.salary = salary;
	}


    public static String getCompanyName(){
        return companyName;
    }
    public static void setCompanyName(String companyName) {
        EmployeeInfo.companyName = companyName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address =  address;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Contract2 getContract() {
        return contract;
    }
    public void setContract(Contract2 contract2) {
        this.contract = contract2;
    }
    public String getSSN() {
        return SSN;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public int employeeId() {
        return employeeId;
    }
    public String employeeName() {
        return employeeName;
    }
    public double calculateSalary(double month1yPay) {
        if(contract.getContract2Type()=="salary Employee")
            salary=month1yPay*12;
        return salary;
    }
    public double calculateWages(double hourl1ypay,int hoursworked,int overtimeExtra) {
        double pay=0;
        if(contract.getContract2Type()=="waged-Employee") {
            pay= hourl1ypay*hoursworked;
            if(hoursworked<40)
                System.out.println(employeeName + "makes" + hourl1ypay + "dollars an hour and this made" + pay + "dollars.");

                 if (hoursworked>40) {
                    int y;
                    y=hoursworked-40;
                    int overtime=y*10;
                    pay=(hoursworked*hourl1ypay)+overtime;
                System.out.println(employeeName + " make " + hourl1ypay + "dollars and hour and and additional " + overtimeExtra+ "dollars"+
                " an hour for hours worked over 40 and this week made" + pay + " dollars:");


            }

        }
        return pay;
    }

    public void calculateComission(double comissionAmount) {
        System.out.println("for this contract you'11 get paid " + comissionAmount + ".");
    }
    public void benefitLayout() {
        double pension = calculateEmployeePension();
        System.out.println("your pension is " + pension + ".");
        if (contract.getContract2Type() == "waged-Employee" || contract.getContract2Type() == "salary employee") ;
        System.out.println("your insurance for health,dental and vision is covered.you"
                + " can also choose a retirement plan and life insurance program with us. you'|| also get paid time off,");


        System.out.println("commissioned employess dont get benefits beside pension.");


    }
    public double getSalary() {
        return salary;
    }


    public static int calculateEmployeeBonus(int numberOfYearsWithCompany){
		int total=0;



		return total;
	}

	public int yearsWorked(Contract2 contract2) {
        String hiredDate=contract2.getHiredDate();
            PeriodWorked conversion=new PeriodWorked();
        Period period=PeriodWorked.PeriodOfTimeWorked(hiredDate);
        return period.getYears();
    }
    private double increaseSalary(int yearsWorked){
	    switch (yearsWorked) {
            case 5:salary+=salary* .02;
            break;
            case 10:salary+=salary* .05;
            break;
            case 40:salary+=salary* .20;
            break;
            case 20:salary+=salary* .10;
            break;
            default:
                System.out.println("you work property last week");
        }
        return salary;
    }
    public double calculateEmployeeBonus(int numberOfYearsWithCompany,String perfomance) {
	    salary=increaseSalary(numberOfYearsWithCompany);
	    double total=0;
	    switch (perfomance) {
            case "Excellent":total+=salary*.10;
                System.out.println("great job,  15% bonus coming for you soon.");
                break;
            case "good":total+=salary*.05;
                System.out.println("you have 8% bonus months");
                break;
            case "average":total+=salary*.02;
            break;
            default:if(contract.getContract2Type()=="salary employee will get bonus this year");
                System.out.println("you will get bonus, or you will be terminated depend you job");
                if(contract.getContract2Type()=="waged-employee");
                System.out.println("waged-employee get bonus plus");
                if(contract.getContract2Type()=="contract-employee");
                System.out.println("complete you task and you will get bonus and hours wages");

        }
        return total;
    }


	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public int calculateEmployeePension() {
        double total = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
        //Calculate pension
        String[] date1=convertedJoiningDate.split("/");
        int m=Integer.parseInt(date1[0]);
        int d=Integer.parseInt(date1[1]);
        int y=Integer.parseInt(date1[2]);
        String [] date2=convertedJoiningDate.split("/");
        int m1=Integer.parseInt(date2[0]);
        int d1=Integer.parseInt(date2[1]);
        int y1=Integer.parseInt(date2[2]);
        LocalDate dateHired=LocalDate.of(y,m,d);
        LocalDate dateCurrent=LocalDate.of(y1,m1,d1);
        Period period=Period.between(dateHired, dateCurrent);
        int yearsBetween=period.getYears();


        for(i=0;i<yearsBetween;i++) {
            total=yearsBetween*.05*salary;
        }
        return (int) total;



    }

    public void departamentDuties() {

    }


    private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = "0"+monthDate + "/" + extractMonth[1];
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
	private static class PeriodWorked{


        public static Period periodOfTimeWorked(String hiredDate){
	        String [] date1=hiredDate.split("/");
	        int d=Integer.parseInt(date1[0]);
	        int m=Integer.parseInt(date1[1]);
	        int y=Integer.parseInt(date1[2]);

	        LocalDate dateHired=LocalDate.of(y,m,d);
	        LocalDate dateCurrent=LocalDate.now();
	        return Period.between(dateHired, dateCurrent);
        }


        public static Period PeriodOfTimeWorked(String hiredDate) {

            return periodOfTimeWorked(hiredDate);
        }
    }
    @Override
    public String toString() {
	    return "EmployeeInfo [phoneNumber=" + phoneNumber + ", address=" + address + ", + accountNumber=" + accountNumber +
                ", contract=" + contract + ", employeeID=" + employeeId + ",employeeName=" + employeeName + ",salary=" +
                salary + ", locations= + locations " + "]";
    }
}
