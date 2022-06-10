package com.globalpayex.college.entities;

public class Student extends CollegeUser {
	
	int roll;
	int marks;
	
	public Student(String name, char gender, int roll, int marks) {
		super(name,gender);
		this.roll = roll;
		this.marks = marks;
	}
    
    @Override
    public String getDetails(){
		
           String str =  super.getDetails();
            return String.format(" %s Roll : %s \n Marks : %s\n",str,roll,marks);
    }

}
