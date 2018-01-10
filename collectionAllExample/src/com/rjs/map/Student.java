package com.rjs.map;

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

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAdd() {
	return add;
}

public void setAdd(String add) {
	this.add = add;
}

public long getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}

@Override
public String toString() {
	return "Student [name=" + name + ", add=" + add + ", phoneNumber="
			+ phoneNumber + "]";
}


}
