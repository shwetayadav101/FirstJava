package com.globalpayex.college.entities;

public class Student extends CollegeUser {
	
	public int roll;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + marks;
		result = prime * result + roll;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		//if (marks != other.marks)
			//return false;
		if (roll != other.roll)
			return false;
		return true;
	}
    
    

}
