package com.rjs.bo;

public class DebitBo {
private long accountNo;
private long debitAmount;
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public long getDebitAmount() {
	return debitAmount;
}
public void setDebitAmount(long debitAmount) {
	this.debitAmount = debitAmount;
}
@Override
public String toString() {
	return "DebitBo [accountNo=" + accountNo + ", debitAmount=" + debitAmount
			+ "]";
}


}
