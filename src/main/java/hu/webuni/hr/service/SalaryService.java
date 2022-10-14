package hu.webuni.hr.service;

import org.springframework.stereotype.Service;

@Service
public class SalaryService {

	private EmployeeService employeeService;
	
	public SalaryService(EmployeeService employeeService) {		
		this.employeeService= employeeService;
	}
	
	
	public int setNewSalary(Employee employee) {
		return (int)(monthPrice / 100* (100-EmployeeService.getPayRaisePercent(monthPrice)));
	}


	
	
}
