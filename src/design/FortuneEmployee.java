package design;

import Contract2.Contract2;
import Department2.Department;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		EmployeeInfo employee1= new EmployeeInfo(Department. HUMAN_RESOURCES,"new york","juan",345678,new Contract2("salary employee","03/2/2018"));
		employee1.calculateSalary(3000.00);
		employee1.benefitLayout();
		System.out.println(employee1.employeeName()+ " is from the " +employee1.getDepartment() + "department.");
		employee1.departamentDuties();
		double bonus=employee1.calculateEmployeeBonus(3, "Excellent");
		System.out.println(employee1.employeeName() + " your bonus is "+ bonus +" ");
		System.out.println(employee1.toString());

		


	}

}
