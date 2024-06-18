package in.pwskills.nitin.config;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pwskills.nitin.bean.Employee;

@Configuration
public class AppConfig {

	static {
		System.out.println("AppConfig.class file is loading...");
	}

	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}

	@Bean(name = "emp")
	public Object empObj() {
		System.out.println("AppConfig.empObj():: Creating the object...");

		// Creating Dependent object
		List<String> friends = List.of("saurav", "dravid", "yuvi");
		Set<String> numbers = Set.of("9998887776", "8887776665", "7776665554");
		Map<String, String> accountNumbers = Map.of("canara", "12232", "SBI", "333221");

		// Creating a Target Object
		Employee employee = new Employee(10, 23456.5f, friends, numbers, accountNumbers);

		return employee;
	}

}
