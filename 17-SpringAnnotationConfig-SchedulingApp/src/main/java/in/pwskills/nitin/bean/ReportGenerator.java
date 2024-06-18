package in.pwskills.nitin.bean;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerator {

	@Scheduled(initialDelay = 2000, fixedRate = 3000)
	public void generateSalesReport() {

		try {
			Thread.sleep(5000);// 5secs
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Sales Report on :: " + new Date());
	}
}
