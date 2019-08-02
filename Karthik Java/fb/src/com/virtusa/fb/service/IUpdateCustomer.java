package com.virtusa.fb.service;

import java.util.List;

import com.virtusa.fb.exception.FacebookException;
import com.virtusa.fb.model.CustomerDetail;

public interface IUpdateCustomer {

	int	updateCustomerDetailsById( CustomerDetail customerDetail) throws FacebookException;
	CustomerDetail	getCustomerDetailsById(int cid) throws FacebookException;
	List<CustomerDetail>	viewCustomerDetails() throws FacebookException;



	
	
}
