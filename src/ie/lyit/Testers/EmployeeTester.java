package ie.lyit.Testers;

import ie.lyit.Hotel.*;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empA = new Employee();
		
		System.out.println(empA);
		
		empA.setName(new Name("Mr", "Oliwier","Stan"));
		empA.setAddress("Glenties");
		empA.setPhoneNumber("0873345487");
		empA.setDOB(new Date(13,9,1997));
		empA.setSalary(60000);
		empA.setStartDate(new Date(1,1,2011));
		
		System.out.println(empA);
		
		//public Employee(String t,String fN, String sN, String address, String phoneNo, int d, int m,int y, Date startDate,double salary )
		
		Employee empB = new Employee("Mr", "Oliwier","Stan","Glenties","0873345487",13,9,1997,new Date(1,1,2011),60000);
		
		System.out.println(empB);
		
	}

}
