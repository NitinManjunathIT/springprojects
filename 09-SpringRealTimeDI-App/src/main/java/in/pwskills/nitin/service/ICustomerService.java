package in.pwskills.nitin.service;

import in.pwskills.nitin.beans.CustomerDTO;

public interface ICustomerService {
	public String calculateSimpleInterest(CustomerDTO dto)throws Exception;
}
