package com.rjs.listIterator;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.ListIterator;

public class Studentobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student std1=new Student("Anand", "bangalore", 1247791411);
Student std2=new Student("bramha", "bangalore2", 1247791411);
Student std3=new Student("chintu", "pulivendula", 123456789);
ArrayList<Student> arrayList=new ArrayList<Student>();
arrayList.add(std1);
arrayList.add(std2);
arrayList.add(std3);

System.out.println("arraylist");
System.out.println(arrayList);

ListIterator<Student> listIterator=arrayList.listIterator();
int i=1;
while(listIterator.hasNext()){
	Student student=(Student)listIterator.next();
	if(student.getName().equals("Anand")){
		student.setName("Dnana");
	}
System.out.println(student);
}


	
}
}