package com.rjs.vector;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;

public class Studentobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student std1=new Student("Anand", "bangalore", 1247791411);
Student std2=new Student("bramha", "bangalore2", 1247791411);
Student std3=new Student("chintu", "pulivendula", 123456789);
Vector<Student> vector=new Vector<Student>();
vector.add(std1);
vector.addElement(std2);
vector.add(std3);
System.out.println(vector);
	}
}
