package in.pwskills.nitin.bean;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

	@Value("#{new java.util.Random().nextInt(1000)}")
	private Integer eid;

	@Value("${info.emp.ename}")
	private String ename;

	@Value("${info.emp.eage}")
	private Float eage;

	@Value("#{'${info.emp.friends}'.split(',')}")
	private List<String> friends;

	@Value("${info.emp.number}")
	private Set<String> phoneNumbers;

	@Value("#{${info.emp.accountNumber}}")
	private Map<String, String> accoutNumbers;

	@Value("#{10<20 ? 5000 : 3000}")
	private Float salary;

	@Value("#{T(java.time.LocalDate).of(1993,1,3)}")
	private LocalDate dob;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", friends=" + friends
				+ ", phoneNumbers=" + phoneNumbers + ", accoutNumbers=" + accoutNumbers + ", salary=" + salary
				+ ", dob=" + dob + "]";
	}

}
