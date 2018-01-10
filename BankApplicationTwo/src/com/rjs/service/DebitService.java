package com.rjs.service;

import java.util.ArrayList;
import java.util.ListIterator;

import com.rjs.Dao.DataBase;
import com.rjs.bo.CreateAccountBo;
import com.rjs.bo.DebitBo;

public class DebitService {
DataBase dataBase;
	public void debitService(DebitBo debitBo){
		dataBase=new DataBase();
		try{
ArrayList<CreateAccountBo> arrayList=dataBase.createAccount(null);
System.out.println(arrayList.isEmpty());
ListIterator<CreateAccountBo> listIterator=arrayList.listIterator();
while(listIterator.hasNext()){
	System.out.println("from debit operation1 "+listIterator.next());
	
	/*listIterator.next().setUserBalance(listIterator.next().getUserBalance()+debitBo.getDebitAmount());*/
	System.out.println("from debit operation2 "+listIterator.next());

}
		}
		catch(NullPointerException npe){
			System.out.println("null pointer exception");
		}


	}
	
	
}

