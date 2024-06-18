package in.pwskills.nitin.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("Employee.class file is loading...");
	}

	public Employee() {
		System.out.println("Employee Object created :: Zero param...");
	}

	@Value("${info.emp.eid}")
	private Integer eid;
	
	@Value("${info.emp.ename}")
	private String ename;
	
	@Value("${info.emp.eage}")
	private Float eage;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + "]";
	}

}
