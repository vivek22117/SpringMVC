package com.vivek.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="Order_Id",length=50)
	private String id;
	
	@Column(name="Order_Date",nullable=false)
	private Date orderDate;
	
	@Column(name="order_Num",nullable=false)
	private int orderInt;
	
	@Column(name="Order_Amount",nullable=false)
	private double amount;
	
	@Column(name="Customer_Name",length=255,nullable=false)
	private String customerName;
	
	@Column(name="Customer_Address",length=255,nullable=false)
	private String customerAddress;
	
	@Column(name="Customer_Email",length=128,nullable=false)
	private String email;
	
	@Column(name="Customer_Phone",length=255,nullable=false)
	private String customerPhone;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderInt() {
		return orderInt;
	}

	public void setOrderInt(int orderInt) {
		this.orderInt = orderInt;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	
}
