package in.pwskills.nitin.beans;

import org.springframework.stereotype.Component;

@Component
public class Dtdc implements ICourier {

	static {
		System.out.println("Dtdc.class file is loading..");
	}

	public Dtdc() {
		System.out.println("Dtdc object created...");
	}

	@Override
	public String deliver(int oid) {
		return "Delivering "+oid + "orderid for your order products using DTDC" ;
	}

}
