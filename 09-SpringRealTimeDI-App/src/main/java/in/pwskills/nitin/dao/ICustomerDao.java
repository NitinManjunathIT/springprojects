package in.pwskills.nitin.dao;

import in.pwskills.nitin.beans.CustomerBO;

public interface ICustomerDao {
	public int insert(CustomerBO bo) throws Exception;
}
