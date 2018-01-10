package com.rjs.map;

public class Employee implements Comparable<Object> {
	private String name;
	private String add;
	private long phoneNumber;

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

	public Employee(String name, String add, long phoneNumber) {
		super();
		this.name = name;
		this.add = add;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", add=" + add + ", phoneNumber="
				+ phoneNumber + "]";
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		long p1 = this.phoneNumber;
		System.out.println("p1 "+p1);
		Employee emp=(Employee)obj;
		long p2 = emp.phoneNumber;
		System.out.println("p2 "+p2);
		return (int) (p2-p1);
	}

}
