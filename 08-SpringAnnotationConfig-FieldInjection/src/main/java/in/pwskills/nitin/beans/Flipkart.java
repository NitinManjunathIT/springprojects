package in.pwskills.nitin.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {

	@Autowired
	@Qualifier("ekart")
	private ICourier courier;

	static {
		System.out.println("Flipkart.class file is loading...");
	}

	public Flipkart() {
		System.out.println("Flipkart object is created...");
	}

	public String shopping(String[] items, float[] prices) {
		System.out.println("Flipkart.shopping()");

		// calculate the total amount to be billed
		float billAmount = 0.0f;
		for (float cost : prices) {
			billAmount += cost;
		}

		String msg = courier.deliver(new Random().nextInt(1000));

		return Arrays.toString(items) + " with prices " + Arrays.toString(prices) + " having billAmount :: "
				+ billAmount + " :: " + msg;
	}

}
