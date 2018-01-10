package com.rjs.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Studentobj {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Student std1=new Student("Anand", "bangalore", 1247791411);
Student std2=new Student("bramha", "bangalore2", 1247791411);
Student std3=new Student("chintu", "pulivendula", 123456789);
//adding objects
ArrayList<Student> arrayList=new ArrayList<Student>();
arrayList.add(std1);
arrayList.add(std2);
arrayList.add(std3);

System.out.println("arraylist ");
System.out.println(arrayList);

//adding total arraylist to another
System.out.println("arraylist1");
ArrayList<Student> arrayList1=new ArrayList<Student>();
arrayList1.addAll(arrayList);
System.out.println(arrayList1);

//Arraylist1 with adding collection at index 1
arrayList1.addAll(1, arrayList);
System.out.println("Arraylist1 with adding collection at index 1");
System.out.println(arrayList1);

//Clearing Arraylist
arrayList1.clear();
System.out.println(arrayList1);

arrayList1.addAll(arrayList);
System.out.println(arrayList1);

//contains test
System.out.println(arrayList1.contains(std1));
System.out.println(arrayList1.containsAll(arrayList));
System.out.println(arrayList.equals(arrayList1));
//indexOf
System.out.println(arrayList.indexOf(std2));
//isEmpty
System.out.println(arrayList.isEmpty());

//remove and removeAll
System.out.println(arrayList.remove(std1));
System.out.println(arrayList);
System.out.println(arrayList1.removeAll(arrayList));
System.out.println(arrayList1);

arrayList.add(std1);
arrayList.add(std2);
arrayList.add(std3);
System.out.println(arrayList);

//size
System.out.println(arrayList.size());

System.out.println();

//subList
System.out.println(arrayList.subList(2, 4));
System.out.println();


	}

	
}
