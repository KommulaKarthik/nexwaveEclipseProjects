package com.virtusa.fb.service;

import java.util.List;

import com.virtusa.fb.dao.UpdateCustomerDao;
import com.virtusa.fb.exception.FacebookException;
import com.virtusa.fb.model.CustomerDetail;

public class UpdateCustomerService  implements IUpdateCustomer{

	public UpdateCustomerService() {
		// TODO Auto-generated constructor stub
	}

	private UpdateCustomerDao customerDao=new UpdateCustomerDao();
	@Override
	public int updateCustomerDetailsById(CustomerDetail customerDetail) throws FacebookException {
		// TODO Auto-generated method stub
		return customerDao.updateCustomerDetailsById(customerDetail);
	}

	@Override
	public CustomerDetail getCustomerDetailsById(int cid) throws FacebookException {
		// TODO Auto-generated method stub
		return customerDao.getCustomerDetailsById(cid);
	}

	@Override
	public List<CustomerDetail> viewCustomerDetails() throws FacebookException {
		// TODO Auto-generated method stub
		return customerDao.viewCustomerDetails();
	}

}
