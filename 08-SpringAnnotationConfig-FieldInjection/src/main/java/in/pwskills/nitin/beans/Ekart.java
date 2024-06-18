package in.pwskills.nitin.beans;

import org.springframework.stereotype.Component;

@Component
public class Ekart implements ICourier {
	
	static {
		System.out.println("Ekart.class file is loading..");
	}

	public Ekart() {
		System.out.println("Ekart object created...");
	}

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return "Delivering "+oid + " orderid for your order products using Ekart";
	}

}
