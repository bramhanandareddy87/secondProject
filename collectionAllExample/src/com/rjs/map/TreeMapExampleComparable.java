package com.rjs.map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExampleComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee std1 = new Employee("Anand", "bangalore", 101);
		System.out.println("1");
		Employee std2 = new Employee("bramha", "btm", 103);
		System.out.println("2");
		Employee std3 = new Employee("chintu", "pulivendula", 102);
		System.out.println("3");
		Employee std4 = new Employee("david", "kadapa", 106);
		Employee std5 = new Employee("eswar", "ananthapur", 104);
		Employee std6 = new Employee("fayeem", "madiwala", 105);
		TreeMap<Employee, Long> treeMap = new TreeMap<Employee, Long>();
		/*treeMap.put(std1.getPhoneNumber(), std1);
		treeMap.put(std2.getPhoneNumber(), std2);
		treeMap.put(std3.getPhoneNumber(), std3);
		treeMap.put(std4.getPhoneNumber(), std4);
		treeMap.put(std5.getPhoneNumber(), std5);
		treeMap.put(std6.getPhoneNumber(), std6);
		treeMap.put(std1.getPhoneNumber(), std1);
*/
		treeMap.put(std1, std1.getPhoneNumber());
		treeMap.put(std2, std2.getPhoneNumber());
		treeMap.put(std3, std3.getPhoneNumber());
		treeMap.put(std4, std4.getPhoneNumber());
		treeMap.put(std5, std5.getPhoneNumber());
		treeMap.put(std6, std6.getPhoneNumber());

		System.out.println(treeMap);
		System.out.println(treeMap.firstEntry());
		System.out.println(treeMap.firstKey());
		Set set = treeMap.entrySet();
		System.out.println("set " + set);
		Set s1 = treeMap.keySet();

		System.out.println("s1 " + s1);
		Iterator<Student> iterator = set.iterator();
		System.out.println(iterator);
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("iterarot keys");
		Iterator<Student> iterator1 = s1.iterator();
		System.out.println(iterator1);
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

	}

}
