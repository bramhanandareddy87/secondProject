package com.rjs.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.rjs.BankOptions.BankOperations;
import com.rjs.bo.CreateAccountBo;

public class DataBase {
	BankOperations bankOperations;
	static ArrayList<CreateAccountBo> arrayList=new ArrayList<CreateAccountBo>();
	static int count=1;
public ArrayList<CreateAccountBo> createAccount(CreateAccountBo createAccountBo){
	System.out.println("object test"+createAccountBo);
	try{
	if(!createAccountBo.equals(null)){
	arrayList.add(createAccountBo);
	System.out.println("object test2"+createAccountBo);

	}
	ListIterator<CreateAccountBo> listIterator=arrayList.listIterator();

	while(listIterator.hasNext()){
		System.out.println(count);
		if(!createAccountBo.equals(null)){
		System.out.println(listIterator.next());
		bankOperations=new BankOperations();
		System.out.println("Account added successfully");
		count++;
		bankOperations.bankOption();
		
		}
	}
	}
	catch(NullPointerException npe){
		npe.printStackTrace();
	}
	return arrayList;
}

}
