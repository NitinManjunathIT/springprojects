package in.pwskills.nitin.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pwskills.nitin.bean.WishMessageGenerator;

@Configuration
public class AppConfig {

	static {
		System.out.println("AppConfig.class file is loading...");
	}

	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}

	
	@Bean(name = "wmg")
	public WishMessageGenerator wmgObj() {
		System.out.println("AppConfig.wmgObj():: Creating the object...");

		// Create a Target Object
		WishMessageGenerator generator = new WishMessageGenerator();

		// Create a Dependent Object
		LocalDateTime ldt = LocalDateTime.now();
		
		//linking the object using Setter style
		generator.setLdt(ldt);

		return generator;
	}

}
