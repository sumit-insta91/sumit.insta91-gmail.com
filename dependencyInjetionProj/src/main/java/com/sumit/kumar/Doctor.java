package com.sumit.kumar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Doctor {

	int id;
	
	Specialization specialization;
	
	@Autowired
	public Doctor(Specialization specialization) {
		this.specialization = specialization;
	}
	
	public Specialization getSpecialization() {
		return specialization;
	}

}
