package com.sumit.kumar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjetionProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjetionProjApplication.class, args);
		
		/*Setter-based dependency injection starts*/
		Employee e=new Employee();
		e.setId(1);
		e.setName("Sumit");
		
		Person p=new Person();
		p.setEmployee(e);//Setter-based injection
		
		System.out.println("setter-based dependency injection :"+p.getEmployee());
		/*Setter-based dependency injection ends*/
		
		/*Constructor-based injection starts*/		
		Specialization sp=new Specialization();
		sp.setId(1);
		sp.setSpecializationName("Dermatologist");
		
		Doctor d=new Doctor(sp);//Constructor-based injection
		
		System.out.println("constructor-based dependency injection :"+d.getSpecialization());
		/*Constructor-based injection ends*/
	}
}
