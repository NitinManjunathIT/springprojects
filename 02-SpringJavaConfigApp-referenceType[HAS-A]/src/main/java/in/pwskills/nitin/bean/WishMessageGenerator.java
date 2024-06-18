package in.pwskills.nitin.bean;

import java.time.LocalDateTime;

//UserDefined type
public class WishMessageGenerator {

	static {
		System.out.println("\n\nWishMessageGenerator.class file is loading...");
	}

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator Object created using Zero param...");
	}

	// HAS-A[Inbuilt type]
	private LocalDateTime ldt;

	public LocalDateTime getLdt() {
		return ldt;
	}

	// Setter Injection
	public void setLdt(LocalDateTime ldt) {
		System.out.println("WishMessageGenerator.setLdt()");
		this.ldt = ldt;
	}

	// Business logic
	public String wishMessage(String user) {
		System.out.println("WishMessageGenerator.wishMessage()");
		int hour = ldt.getHour();
		String msg = "";

		if (hour < 12) {
			msg += "Good Morning ::" + user;
		} else if (hour < 16) {
			msg += "Good Afternoon :: " + user;
		} else if (hour < 20) {
			msg += "Good Evening :: " + user;
		} else {
			msg += "Good Night :: " + user;
		}
		return msg;
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [ldt=" + ldt + "]";
	}
	
	

}
