package com.rjs.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student std1=new Student("Anand", "bangalore", 101);
Student std2=new Student("bramha", "btm", 103);
Student std3=new Student("chintu", "pulivendula", 102);
Student std4=new Student("david", "kadapa", 106);
Student std5=new Student("eswar", "ananthapur", 104);
Student std6=new Student("fayeem", "madiwala", 105);
SortedMap<Long, Student> sortedMap=new TreeMap<Long,Student>();
sortedMap.put(std1.getPhoneNumber(), std1);
sortedMap.put(std2.getPhoneNumber(), std2);
sortedMap.put(std3.getPhoneNumber(), std3);
sortedMap.put(std4.getPhoneNumber(), std4);
sortedMap.put(std5.getPhoneNumber(), std5);
sortedMap.put(std6.getPhoneNumber(), std6);
System.out.println(sortedMap);
System.out.println(sortedMap.headMap((long) 103));
System.out.println(sortedMap.tailMap((long)103));
System.out.println(sortedMap.firstKey());
System.out.println(sortedMap.lastKey());
System.out.println();

	}

	
}


