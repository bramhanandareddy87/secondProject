package com.rjs.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class WeakHashMapExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Student std1=new Student("Anand", "bangalore", 101);
Student std2=new Student("bramha", "btm", 103);
Student std3=new Student("chintu", "pulivendula", 102);
Student std4=new Student("david", "kadapa", 106);
Student std5=new Student("eswar", "ananthapur", 104);
Student std6=new Student("fayeem", "madiwala", 105);

HashMap hashMap=new HashMap();
Test test=new Test();
hashMap.put(test, "anand");
System.out.println(hashMap);
Thread.sleep(2000);
test=null;
System.gc();//This wont call finalize() for garbage collection because it is HashMap and so test is not destroyed
//Here Garbage Collection wont work
System.out.println(hashMap);

WeakHashMap weakHashMap=new WeakHashMap();
Test test1=new Test();
weakHashMap.put(test1, "anand");
System.out.println(weakHashMap);
Thread.sleep(2000);
test1=null;
System.gc();//This will call finalize() for garbage collection because it is WeakHashMap and so test is destroyed
//Here garbage collection is working
System.out.println(weakHashMap);

	}

	
}


