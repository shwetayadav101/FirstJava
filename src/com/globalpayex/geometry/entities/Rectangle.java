package com.globalpayex.geometry.entities;

import abc.geometry.entities.Shape;

public class Rectangle extends Shape {
	
	float length;
	float breath;
	public Rectangle(float length, float breath) {
		super();
		this.length = length;
		this.breath = breath;
	}
	
	@Override
	public float Area()
	{
		return length*breath;
	}
	
	@Override
	public float Perimeter()
	{
		return 2 * (length + breath);
	}
	

}
