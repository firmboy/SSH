package com.itcast.crm.customer.service.impl;

import com.itcast.crm.customer.dao.CustomerDao;
import com.itcast.crm.customer.domain.Customer;
import com.itcast.crm.customer.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao dao;
	public void setCustomerDao(CustomerDao dao) {
		this.dao = dao;
	}

	/**
	 * 保存用户
	 */
	public void save(Customer customer) {
		/*Session session = HibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		try {
			dao.save(customer);
			tr.commit();
		} catch (Exception e) {
			tr.rollback();
			throw new RuntimeException(e);
		}*/
		
		
		dao.save(customer);
	}
	
	
	
	
	
	
}
