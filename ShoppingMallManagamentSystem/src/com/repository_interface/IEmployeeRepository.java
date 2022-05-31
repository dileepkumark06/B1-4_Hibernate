package com.repository_interface;

import com.pojo_classes.Employee;

public interface IEmployeeRepository  
{
	abstract Employee addEmployee (Employee employee);
	abstract Employee updateEmployee(Employee employee);
	abstract Employee searchEmployee(long id);
	abstract boolean deleteEmployee(long id);
}	