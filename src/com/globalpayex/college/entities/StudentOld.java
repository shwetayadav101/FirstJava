package com.globalpayex.college.entities;

public class StudentOld {
	
	String name;
	char gender;
	int roll;
	int marks;
	public static int count = 0;
	String getDetails() {
		
		return String.format("Name : %s \n Gender : %s \n Roll : %s \n Marks : %s\n",name,gender,roll,marks);
	}
	
	char getGrade()
	{
		return 'A'; 
	}
	
	public StudentOld()
	{
		this("NA",'n',-1,0);
	}
	
	public StudentOld(String name,char gender,int roll,int marks)
	{
		this.name = name;
		this.gender = gender;
		this.roll = roll;
		this.marks = marks;
		StudentOld.count++;
	}
	
	StudentOld (int name,char gender,int roll,int marks)
	{
		this.name = "aa";
		this.gender = gender;
		this.roll = roll;
		this.marks = marks;
	}

	
	
	static StudentOld newInstance(String name,char gender,int roll,int marks)
	{
		return new StudentOld(name,gender,roll,marks);
		
	}

	public String getNameGrade() {
		return name + '\n' + gender;
		
	}
}


