package hu.webuni.hr.service;

import org.springframework.stereotype.Service;

@Service
public class SalaryService {

	private EmployeeService employeeService;
	
	public SalaryService(EmployeeService employeeService) {
		
		this.setEmployeeService(employeeService);
	}
	
	
	public int getFinalMouthPrice(int monthPrice) {
		return (int)(monthPrice / 100* (100-EmployeeService.getPayRaisePercent(monthPrice)));
	}


	
	
}
