package design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

		EmployeeInfo a = new EmployeeInfo(5,"rob",29,100,"Qa",'M' );
		EmployeeInfo b = new EmployeeInfo(5,"James");
		EmployeeInfo c = new EmployeeInfo(3," Ellie smith",18,50,"Qa", 'F');
		EmployeeInfo d = new EmployeeInfo(8,500,"Qa",'M');
		EmployeeInfo e = new EmployeeInfo(20,"jack");

		System.out.println( a.getEmployeeID());
		System.out.println(b.getEmployeeID() + " " + b.getName());
		System.out.println(c.getEmployeeID() + " " + c.getName() + " " + c.getAge());
		System.out.println(d.getAge() + " " + d.getSalary() + " " + d.getDepartmentName() +" " + d.getGENDER());
		System.out.println(e.getEmployeeID() + " " + e.getName());
		EmployeeInfo Work =  new EmployeeInfo();
		Work.welcome();


			//Store into data Structure

		Map<Integer, List<EmployeeInfo> > MapEmployeeInfo = new HashMap<Integer, List<EmployeeInfo>>();
		MapEmployeeInfo.put(1, a);

			// Store into database

	}

}
