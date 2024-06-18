package in.pwskills.nitin.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ekart")
@Scope("prototype")
public class Ekart implements ICourier {

	@Override
	public String deliverOrder(Integer oid) {
		return null;
	}

	@Override
	public String toString() {
		return "Ekart []";
	}

}
