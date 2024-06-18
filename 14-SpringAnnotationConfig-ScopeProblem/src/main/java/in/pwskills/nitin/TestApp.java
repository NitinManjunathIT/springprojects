package in.pwskills.nitin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.nitin.bean.Flipkart;
import in.pwskills.nitin.bean.ICourier;
import in.pwskills.nitin.config.AppConfig;

public class TestApp {
	public static void main(String[] args) throws Exception {

		// starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Flipkart f1 = context.getBean("flipkart", Flipkart.class);
		ICourier courier1 = f1.getCourier();
		System.out.println("courier :: "+courier1);
		System.out.println(f1);

		System.in.read();

		Flipkart f2 = context.getBean("flipkart", Flipkart.class);
		ICourier courier2 = f2.getCourier();
		System.out.println("Courier :: "+courier2);
		System.out.println(f2);

		// close the container
		((AbstractApplicationContext) context).close();

	}
}
