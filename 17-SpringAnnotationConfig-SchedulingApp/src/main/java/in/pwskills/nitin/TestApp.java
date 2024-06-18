package in.pwskills.nitin;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.nitin.config.AppConfig;

public class TestApp {
	public static void main(String[] args) throws Exception {

		// starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Container started at :: " + new Date());

		// closing the container
		((AbstractApplicationContext) context).close();
	}
}
