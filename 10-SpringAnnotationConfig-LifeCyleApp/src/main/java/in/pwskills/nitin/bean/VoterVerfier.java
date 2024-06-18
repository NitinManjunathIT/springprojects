package in.pwskills.nitin.bean;

import java.time.LocalDate;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("voter")
@PropertySource("application.properties")
public class VoterVerfier {

	@Value("${info.voter.name}")
	private String name;

	@Value("${info.voter.age}")
	private float age;

	private LocalDate date;

	static {
		System.out.println("VoterVerfier.class file is loading...");
	}

	public VoterVerfier() {
		System.out.println("VoterVerfier :: Object instantiated...");
	}

	// Initialization method
	@PostConstruct
	public void myInit() {
		System.out.println("Initialization :: VoterVerfier.myInit()");

		date = LocalDate.now();
		if (name == null || age < 0) {
			throw new IllegalArgumentException("invalid inputs are provided for name and age properties");
		}

	}

	// Business logic method
	public String checkVotingEligibility() {

		if (age >= 18)
			return "Mr/Mrs/Miss :: " + name + "u r eligible for voting , Don't wait on :: " + date;
		else
			return "Mr/Mrs/Miss :: " + name + "u r not eligible for voting wait " + (18 - age)
					+ " years to cast your vote on :: " + date;
	}

	// Destruction method
	@PreDestroy
	public void myDestory() {
		System.out.println("Destruction :: VoterVerfier.myDestory()");

		// nullifying the values of instance variables
		date = null;
		age = 0.0f;
		name = null;

	}

}
