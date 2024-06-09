package com.hql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int cust_id;
public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
public Bank( String custName, int bal, String acct_type, String bankName) {
		super();
	
		this.custName = custName;
		this.bal = bal;
		this.acct_type = acct_type;
		this.bankName = bankName;
	}
public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public String getAcct_type() {
		return acct_type;
	}
	public void setAcct_type(String acct_type) {
		this.acct_type = acct_type;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
private String custName;
private int bal;
private String acct_type;
private String bankName;

}
