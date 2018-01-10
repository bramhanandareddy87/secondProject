package com.rjs.bo;

public class CreateAccountBo {
private String name;
private long phoneNo;
private long accountNo;
private long userBalance;
public long getUserBalance() {
	return userBalance;
}
public void setUserBalance(long userBalance) {
	this.userBalance = userBalance;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
@Override
public String toString() {
	return "CreateAccountBo [name=" + name + ", phoneNo=" + phoneNo
			+ ", accountNo=" + accountNo + ", userBalance=" + userBalance + "]";
}


}
