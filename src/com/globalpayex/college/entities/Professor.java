package com.globalpayex.college.entities;

import com.abc.salary.SalariedIndividual;

public class Professor extends CollegeUser implements SalariedIndividual  {

	double costPerDay;
	int workingDays;
	String[] subjects;
	public Professor(String name, char gender, double costPerDay, int workingDays, String[] subjects) {
		super(name, gender);
		this.costPerDay = costPerDay;
		this.workingDays = workingDays;
		this.subjects = subjects;
	}
	@Override
	public int getNoOfDaysWorked() {
		// TODO Auto-generated method stub
		return workingDays;
	}
	@Override
	public double getPricePerDay() {
		// TODO Auto-generated method stub
		return costPerDay;
	}
		
	
		
		
	
}
