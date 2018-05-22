package com.org.dao;

import java.util.List;

import com.org.model.Employee;

public interface EmployeeDataAccess {
		public int addEmployee(Employee e);
		public void changePassword(String s,int id);
		
		public Employee loginCheck(String em, String pw);
		
		public List<Employee> getEmployee();
		public Employee getEmployee(int id);
}
