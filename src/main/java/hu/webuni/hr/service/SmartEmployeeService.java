package hu.webuni.hr.service;
import java.time.*;


import org.springframework.stereotype.Service;

import hu.webuni.hr.model.Employee;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

@Service
public class SmartEmployeeService {
		     
		
	//@Autowired
	// Ide jön ha lesz konfig Files	

	@Override
	public int getDefaultEmoloyeePercent(int totalMouthPrice) {
		return (int) if((Employee.getaTime()- LocalDateTime.now()) >= 10 ) {
			
		}
	}

		
	
	
}
