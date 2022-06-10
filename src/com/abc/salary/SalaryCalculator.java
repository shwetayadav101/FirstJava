package com.abc.salary;

public class SalaryCalculator {

	public static double calculate (SalariedIndividual salariedIndividual)
	{
		int noOfDays = salariedIndividual.getNoOfDaysWorked();
		double costPerDay = salariedIndividual.getPricePerDay();
		
		double costWithoutTax = noOfDays * costPerDay;
		return costWithoutTax - 10000000;
	}
}