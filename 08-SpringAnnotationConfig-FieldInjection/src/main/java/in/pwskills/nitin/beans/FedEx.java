package in.pwskills.nitin.beans;

import org.springframework.stereotype.Component;

@Component
public class FedEx implements ICourier {

	static {
		System.out.println("FedEx.class file is loading..");
	}

	public FedEx() {
		System.out.println("FedEx object created...");
	}

	@Override
	public String deliver(int oid) {
		return "Delivering " + oid + "orderid for your order products using FedEx";
	}

}
