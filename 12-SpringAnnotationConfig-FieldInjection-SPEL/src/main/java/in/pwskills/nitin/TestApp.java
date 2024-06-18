package in.pwskills.nitin;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.nitin.bean.Flipkart;
import in.pwskills.nitin.config.AppConfig;

public class TestApp {
	public static void main(String[] args) {

		// starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("BeanNames are :: "+Arrays.toString(context.getBeanDefinitionNames()));

		Flipkart flipkart = context.getBean("flipkart", Flipkart.class);
		System.out.println(flipkart);
		
		
		// close the container
		((AbstractApplicationContext) context).close();

	}
}
