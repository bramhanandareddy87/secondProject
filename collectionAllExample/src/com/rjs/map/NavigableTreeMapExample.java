package com.rjs.map;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class NavigableTreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student std1=new Student("Anand", "bangalore", 101);
Student std2=new Student("bramha", "btm", 103);
Student std3=new Student("chintu", "pulivendula", 102);
Student std4=new Student("david", "kadapa", 106);
Student std5=new Student("eswar", "ananthapur", 104);
Student std6=new Student("fayeem", "madiwala", 105);
NavigableMap<Long, Student> navigableMap=new TreeMap<Long, Student>(new MyComparator());
navigableMap.put(std1.getPhoneNumber(),std1);
navigableMap.put(std2.getPhoneNumber(), std2);
navigableMap.put(std3.getPhoneNumber(), std3);
navigableMap.put(std4.getPhoneNumber(),std4);
navigableMap.put(std5.getPhoneNumber(),std5);
navigableMap.put(std6.getPhoneNumber(),std6);
navigableMap.put(std1.getPhoneNumber(),std1);


System.out.println(navigableMap.ceilingEntry((long) 101));
System.out.println(navigableMap.floorEntry((long)102));
System.out.println(navigableMap.higherEntry((long)102));
System.out.println(navigableMap.lowerEntry((long)104));
System.out.println(navigableMap.pollFirstEntry());
System.out.println(navigableMap);
System.out.println(navigableMap.descendingMap());
	}	
}


