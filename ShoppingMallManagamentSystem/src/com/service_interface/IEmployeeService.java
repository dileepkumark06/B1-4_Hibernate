package com.service_interface;

import com.pojo_classes.Employee;

public interface IEmployeeService  
{
	abstract Employee addEmployee (Employee employee);
	abstract Employee updateEmployee(Employee employee);
	abstract Employee searchEmployee(long id);
	abstract boolean deleteEmployee(long id);
}	