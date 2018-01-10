package com.rjs.vector;

public class Student {
private String name;
private String add;
private long phoneNumber;

public Student(String name, String add, long phoneNumber) {
	super();
	this.name = name;
	this.add = add;
	this.phoneNumber = phoneNumber;
}

@Override
public String toString() {
	return "Student [name=" + name + ", add=" + add + ", phoneNumber="
			+ phoneNumber + "]";
}

}
