package com.rjs.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class IdentityHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student std1=new Student("Anand", "bangalore", 101);

Student std2=new Student("bramha", "btm", 103);
Student std3=new Student("chintu", "pulivendula", 102);
Student std4=new Student("david", "kadapa", 106);
Student std5=new Student("eswar", "ananthapur", 104);
Student std6=new Student("fayeem", "madiwala", 105);
Student std7=new Student("Anand", "bangalore", 101);

IdentityHashMap<Integer, String> identityHashMap=new IdentityHashMap<Integer, String>();
Integer integer=new Integer(10);
Integer integer2=new Integer(20);
Integer integer3=new Integer(10);
identityHashMap.put(integer, "anand");
identityHashMap.put(integer2, "dinesh");
identityHashMap.put(integer3, "chaitanya");
identityHashMap.put(integer, "augnesh");
System.out.println("From IdentityHashMap");
System.out.println(identityHashMap);

HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
hashMap.put(integer, "anand");
hashMap.put(integer2, "dinesh");
hashMap.put(integer3, "chaitanya");
hashMap.put(integer, "augnesh");
System.out.println("From HashMap");
	System.out.println(hashMap);
	}

	
}


