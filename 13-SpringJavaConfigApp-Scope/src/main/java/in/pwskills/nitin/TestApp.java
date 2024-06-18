package in.pwskills.nitin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.nitin.bean.Printer;
import in.pwskills.nitin.bean.WishMessageGenerator;
import in.pwskills.nitin.config.AppConfig;

public class TestApp {
	public static void main(String[] args) throws Exception {

		// starting the container
		System.out.println("Container started.....");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


		System.out.println("Accessing the container to get the beans....");
		// Working with bean created by IOC

		System.out.println("Working with WishMessageGenerator Object[singletonscope]");
		WishMessageGenerator obj1 = context.getBean("wmg1", WishMessageGenerator.class);
		WishMessageGenerator obj2 = context.getBean("wmg1", WishMessageGenerator.class);
		System.out.println(obj1.hashCode() + "- " + obj2.hashCode());
		System.out.println("obj1==obj2 ? " + (obj1 == obj2));

		System.out.println("===============================");
		WishMessageGenerator obj3 = context.getBean("wmg2", WishMessageGenerator.class);
		WishMessageGenerator obj4 = context.getBean("wmg2", WishMessageGenerator.class);
		System.out.println(obj3.hashCode() + "- " + obj4.hashCode());
		System.out.println("obj3==obj4 ? " + (obj3 == obj4));

		System.out.println("==================");
		System.out.println("obj1==obj3 ? " + (obj1 == obj3));
		System.out.println("obj2==obj4 ? " + (obj2 == obj4));

		System.out.println("===========================================");

		System.out.println("Working with Printer Object[SingleTonclass and singletonscope].....");
		Printer p1obj = context.getBean("p1", Printer.class);
		Printer p2obj = context.getBean("p1", Printer.class);
		System.out.println(p1obj.hashCode() + "- " + p2obj.hashCode());
		System.out.println("p1obj==p2obj ? " + (p1obj == p2obj));

		Printer p3obj = context.getBean("p2", Printer.class);
		Printer p4obj = context.getBean("p2", Printer.class);
		System.out.println(p3obj.hashCode() + "- " + p4obj.hashCode());
		System.out.println("p3obj==p4obj ? " + (p3obj == p4obj));

		System.out.println("==================");
		System.out.println("p1obj==p3obj ? " + (p1obj == p3obj));
		System.out.println("p2obj==p4obj ? " + (p2obj == p4obj));

		// close the container
		((AbstractApplicationContext) context).close();

	}
}
