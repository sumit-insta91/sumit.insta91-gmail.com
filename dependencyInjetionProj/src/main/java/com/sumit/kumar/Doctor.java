package com.sumit.kumar;

public class Doctor {

	int id;
	
	Specialization specialization;
	
	public Doctor(Specialization specialization) {
		this.specialization = specialization;
	}
	
	public Specialization getSpecialization() {
		return specialization;
	}

}
