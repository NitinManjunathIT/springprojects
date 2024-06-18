package in.pwskills.nitin.bean;

import java.time.LocalDateTime;

//UserDefined type
public class WishMessageGenerator {

	static {
		System.out.println("WishMessageGenerator.class file is loading...");
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

	@Override
	public String toString() {
		return "WishMessageGenerator [ldt=" + ldt + "]";
	}

}
