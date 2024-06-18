package in.pwskills.nitin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.nitin.bean.VoterVerfier;
import in.pwskills.nitin.config.AppConfig;

public class TestApp {
	public static void main(String[] args) {

		System.out.println("*****************Starting the container*****************");
		// starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("******Beans created and stored in IOCCache******");
		String[] names = context.getBeanDefinitionNames();
		for (String beanName : names) {
			System.out.println(beanName);
		}
		
		System.out.println("************************************************");
		// Working with bean created by IOC
		VoterVerfier bean = context.getBean("voter", VoterVerfier.class);
		String status = bean.checkVotingEligibility();
		System.out.println(status);

		
		// close the container
		((AbstractApplicationContext) context).close();
		
		System.out.println("*****************Closing the container*****************");

	}
}

