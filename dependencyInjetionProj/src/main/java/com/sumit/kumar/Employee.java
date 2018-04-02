package com.sumit.kumar;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	int Id;
	String Name;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + "]";
	}

}
