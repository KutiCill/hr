package hu.webuni.hr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultEmployeeService implements EmployeeService {
//@Autowired
// Ide jön ha lesz konfig Files	

@Override

public int getDefaultEmoloyeePercent(int totalMouthPrice) {
	return (int)(totalMouthPrice * 0.95);
}

	
}
