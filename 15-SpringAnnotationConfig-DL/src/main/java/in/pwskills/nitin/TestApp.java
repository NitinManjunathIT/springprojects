package in.pwskills.nitin;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.nitin.bean.Cricketer;
import in.pwskills.nitin.config.AppConfig;

public class TestApp {
	public static void main(String[] args) throws Exception {

		// starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Cricketer cricketer = context.getBean(Cricketer.class);
		System.out.println("Implementation class object is :: "+cricketer.getClass().getName());
		System.out.println("parent class object is :: "+cricketer.getClass().getSuperclass());
		System.out.println("Methods present in Cricketer class"+Arrays.toString(cricketer.getClass().getDeclaredMethods()));
		cricketer.fielding();
		cricketer.bowling();
		cricketer.wicketkeeping();
		cricketer.batting();

		// close the container
		((AbstractApplicationContext) context).close();

	}
}
