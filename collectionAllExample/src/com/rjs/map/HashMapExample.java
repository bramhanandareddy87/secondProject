package com.rjs.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student std1=new Student("Anand", "bangalore", 101);
Student std2=new Student("bramha", "btm", 103);
Student std3=new Student("chintu", "pulivendula", 102);
Student std4=new Student("david", "kadapa", 106);
Student std5=new Student("eswar", "ananthapur", 104);
Student std6=new Student("fayeem", "madiwala", 105);
HashMap<Long, Student> hashMap=new HashMap<Long, Student>();
//duplicates are not allowed
hashMap.put(std1.getPhoneNumber(), std1);
hashMap.put(std2.getPhoneNumber(), std2);
hashMap.put(std3.getPhoneNumber(), std3);
hashMap.put(std4.getPhoneNumber(), std4);
hashMap.put(std5.getPhoneNumber(), std5);
hashMap.put(std6.getPhoneNumber(), std6);
hashMap.put(std1.getPhoneNumber(), std1);

System.out.println(hashMap);
//Set of hashMap entry
System.out.println("Entry Set Iterator");
Set<Entry<Long, Student>> entSet=hashMap.entrySet();
Iterator iterator=entSet.iterator();
while(iterator.hasNext()){
	System.out.println(iterator.next());
}

//Set of hasphMap
System.out.println("Set Iterator");
Set set=hashMap.entrySet();
Iterator iterator2=set.iterator();
while(iterator2.hasNext()){
	System.out.println(iterator2.next());
}

//dealing with Entries
System.out.println("dealing with Entries");
Set set2=hashMap.entrySet();
Iterator iterator3=set2.iterator();
while(iterator3.hasNext()){
	Map.Entry<Long, Student> mEntry=(Map.Entry<Long, Student>)iterator3.next();
	System.out.println(mEntry.getKey()+"            "+mEntry.getValue());
}

	}

	
}


