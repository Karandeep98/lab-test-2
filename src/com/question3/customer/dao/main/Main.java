package com.question3.customer.dao.main;
import java.util.*;

import com.question3.customer.dao.Customer;
import com.question3.customer.dao.CustomerDao;
import com.question3.customer.dao.CustomerDaoImpl;
public class Main {
	
	public static void main(String[] args) {
		CustomerDao dao=new CustomerDaoImpl();
		
//		add customer
		Date date=new Date();
		Customer customer=new Customer("karan", "Delhi", "986542310", date);
		dao.addCustomer(customer);
//		getBook by id
		Customer customer2=dao.getCustomerById(1);
		System.out.println(customer2);
	
	}

}
