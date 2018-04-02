package com.sumit.kumar;

import org.springframework.stereotype.Component;

@Component
public class Specialization {

	int id;
	String specializationName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecializationName() {
		return specializationName;
	}
	public void setSpecializationName(String specializationName) {
		this.specializationName = specializationName;
	}
	@Override
	public String toString() {
		return "Specialization [id=" + id + ", specializationName=" + specializationName + "]";
	}
}
