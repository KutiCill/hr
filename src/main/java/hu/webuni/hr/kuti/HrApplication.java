package hu.webuni.hr.kuti;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hu.webuni.hr.service.SalaryService;

@SpringBootApplication
public class HrApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(SalaryService.getFinalMouthPrice(500));
		
	}
	
	

}
