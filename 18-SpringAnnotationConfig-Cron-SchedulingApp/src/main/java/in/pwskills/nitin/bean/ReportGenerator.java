package in.pwskills.nitin.bean;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerator {

	@Scheduled(cron = "57 56/1 13 * * *")
	public void generateSalesReport() {
		System.out.println("Sales Report on :: " + new Date());
	}
}
