package com.vivek.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Accounts")
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static final String ROLE_MANAGER = "MANAGER";
	private static final String ROLE_EMPLOYEE = "EMPLOYEE";
	
	@Column(name="User_Name",length=20,nullable=false)
	private String userName;
	
	@Column(name="Password",length=20,nullable=false)
	private String password;
	
	@Column(name="Active",length=1,nullable=false)
	private boolean isActive;
	
	@Column(name="User_Role",length=20,nullable=false)
	private String userRole;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public static String getRoleManager() {
		return ROLE_MANAGER;
	}

	public static String getRoleEmployee() {
		return ROLE_EMPLOYEE;
	}

	@Override
	public String toString() {
		return "Account [userName=" + userName + ", password=" + password + ", isActive=" + isActive + ", userRole="
				+ userRole + "]";
	}
	

	

}
