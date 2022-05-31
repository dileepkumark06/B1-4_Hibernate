package com.repository_interface;

import javax.persistence.EntityManager;

import com.pojo_classes.Employee;

public abstract class IEmployeeRepositoryimpl implements IEmployeeRepository {
	private EntityManager entityManager;
	private boolean employee;
		public IEmployeeRepositoryimpl() {
			entityManager = JPAUtil.getEntityManager();
		}
		@Override
		public Employee addEmployee(Employee employee) {
			entityManager.persist(employee);
			return employee;
		}
		@Override
		public Employee updateEmployee(Employee employee) {
			entityManager.merge(employee);
			return employee;
		}
		public Employee searchEmployeeById(long id) {
			Employee employee = entityManager.find(Employee.class, id);
			return employee;
		}
		@Override
		public boolean deleteEmployee(long id) {
			return employee;
		}	
}