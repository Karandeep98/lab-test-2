package com.question3.customer.dao;

import java.sql.*;

import com.question3.customer.dao.exception.CustomerNotFoundException;

public class CustomerDaoImpl implements CustomerDao {
	private Connection connection;

	public CustomerDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	public void addCustomer(Customer customer) {
		try {
			PreparedStatement pstmt = connection
					.prepareStatement("insert into customer_new(name, address, phone_number,dob) values(?,?,?,?)");
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getAddress());
			pstmt.setString(3, customer.getPhone_number());
			pstmt.setDate(4, new Date(customer.getDob().getTime()));
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}

	public Customer getCustomerById(int id) {
		PreparedStatement pstmt;
		Customer customer=null;
		try {
			pstmt = connection.prepareStatement("select * from customer_new where id=?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				customer=new Customer(rs.getInt("id"),
						rs.getString("name"), 
						rs.getString("address"),
						rs.getString("phone_number"),
						rs.getDate("dob"));
			}else {
				throw new CustomerNotFoundException("user with id : "+ id + " is not found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return customer;
	}

}
