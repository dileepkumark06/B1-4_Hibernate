package com.client;

import com.pojo_classes.Employee;
import com.service_interface.IEmployeeService;

public class Client
 {
	public static void main(String[] args) 
{
		Employee employee = new Employee();
		IEmployeeService service = new IEmployeeServiceimpl();
		
	    employee.setId(124);
		employee.setName("Dhoni");
		employee.setRoll(25);
		employee.setQualification("BE");
		employee.setCourse("TCE");
		employee.setYear(2012);
		employee.setCertificate("SD");
		employee.setHallTickteNo(222);
		employee.setCollege("Ssit");
		service.addEmployee(employee);
		
		
		
		employee = service.searchEmployeeById(100);
		System.out.println("Id is: "+employee.getId());
		System.out.println("Roll is: "+employee.getRoll());
		System.out.println("college is: "+employee.getCollege());
		
		employee = service.searchEmployeeById(100);
		employee.setCollege("ssit");
		service.updateEmployee(employee);
		System.out.println("Updated successfully");
	
		
		employee= service.searchEmployeeById(100);
		service.deleteemployee(employee);
		System.out.println("delete is sucessful");
	}
}
