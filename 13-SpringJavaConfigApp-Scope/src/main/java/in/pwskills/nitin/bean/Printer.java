package in.pwskills.nitin.bean;

public class Printer {

	static {
		System.out.println("Printer.class file is loading...");
	}
	
	private static Printer INSTANCE = null;

	public static Printer getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Printer();
		}
		return INSTANCE;
	}

	private Printer() {
		System.out.println("Printer object is created...");
	}
}
