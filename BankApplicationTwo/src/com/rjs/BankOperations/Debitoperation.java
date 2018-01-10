package com.rjs.BankOperations;

import java.util.Scanner;

import com.rjs.bo.DebitBo;
import com.rjs.service.DebitService;

public class Debitoperation {
	private long accountNo;
	private long debitAmount;
	private Scanner input;
	private DebitBo debitBo;
	private DebitService debitService;
public void debit(){
	input=new Scanner(	System.in);
	debitBo=new DebitBo();
	debitService=new DebitService();
System.out.println("Enter the account number to be debited");
accountNo=input.nextLong();

debitBo.setAccountNo(accountNo);
System.out.println("Enter the amount to be debited");
debitAmount=input.nextLong();
debitBo.setDebitAmount(debitAmount);
debitService.debitService(debitBo);

}
}
