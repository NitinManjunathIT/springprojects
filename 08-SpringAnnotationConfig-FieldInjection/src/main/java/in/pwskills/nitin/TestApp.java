package in.pwskills.nitin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.nitin.beans.Flipkart;
import in.pwskills.nitin.config.AppConfig;

public class TestApp {
	public static void main(String[] args) {

		// starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		
		System.out.println();
		
		// Asking container to give the bean
		Flipkart flipkart = context.getBean("flipkart", Flipkart.class);
		System.out.println(flipkart.shopping(new String[] { "fossilwatch ", "lpbelts", "arrowshoes" },
				new float[] { 5670.5f, 3500.5f, 4500.50f }));

		// close the container
		((AbstractApplicationContext) context).close();

	}
}
