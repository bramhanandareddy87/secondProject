package com.rjs.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Studentobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student std1=new Student("Anand", "bangalore", 1247791411);
Student std2=new Student("bramha", "bangalore2", 1247791411);
Student std3=new Student("chintu", "pulivendula", 123456789);
LinkedList<Student> linkedList=new LinkedList<Student>();
//adding
linkedList.add(std1);
linkedList.add(std2);
linkedList.add(std3);
System.out.println(linkedList);
//addFirst addLast
linkedList.addFirst(std3);
linkedList.addLast(std1);
System.out.println(linkedList);

//clear
linkedList.clear();
System.out.println(linkedList);

//contains
System.out.println(linkedList.contains(std3));
linkedList.add(std1);
linkedList.add(std2);
linkedList.add(std3);
System.out.println(linkedList.contains(std3));

//equals
System.out.println(linkedList.equals(linkedList));

System.out.println(linkedList.getFirst());
System.out.println(linkedList.getLast());
System.out.println(linkedList);
System.out.println(linkedList.pollFirst());
System.out.println(linkedList);
System.out.println(linkedList.pollFirst());
System.out.println(linkedList);





	}

	
}
