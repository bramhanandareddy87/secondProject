package com.rjs.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student std1=new Student("Anand", "bangalore", 101);
Student std2=new Student("bramha", "btm", 103);
Student std3=new Student("chintu", "pulivendula", 102);
Student std4=new Student("david", "kadapa", 106);
Student std5=new Student("eswar", "ananthapur", 104);
Student std6=new Student("fayeem", "madiwala", 105);
TreeMap<Long, Student> treeMap=new TreeMap<Long, Student>(new MyComparator2());
treeMap.put(std1.getPhoneNumber(),std1);
treeMap.put(std2.getPhoneNumber(), std2);
treeMap.put(std3.getPhoneNumber(), std3);
treeMap.put(std4.getPhoneNumber(),std4);
treeMap.put(std5.getPhoneNumber(),std5);
treeMap.put(std6.getPhoneNumber(),std6);
treeMap.put(std1.getPhoneNumber(),std1);


System.out.println(treeMap);
System.out.println(treeMap.firstEntry());
System.out.println(treeMap.firstKey());
Set set=treeMap.entrySet();
System.out.println("set "+set);
Set s1=treeMap.keySet();

System.out.println("s1 "+s1);
Iterator<Student> iterator=set.iterator();
System.out.println(iterator);
while(iterator.hasNext()){
	System.out.println(iterator.next());
}
System.out.println("iterarot keys");
Iterator<Student> iterator1=s1.iterator();
System.out.println(iterator1);
while(iterator1.hasNext()){
	System.out.println(iterator1.next());
}




//ListIterator<Student> listIterator=treeMap.
	}

	
}


