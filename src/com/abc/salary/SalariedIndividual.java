package com.abc.salary;
public interface SalariedIndividual {
	
	int getNoOfDaysWorked();
	
	double getPricePerDay();
	
	// new thing
	public default double calculate ()
	{
		int noOfDays = this.getNoOfDaysWorked();
		double costPerDay = this.getPricePerDay();
		
		double costWithoutTax = noOfDays * costPerDay;
		return costWithoutTax - 10000000;
	}

}
