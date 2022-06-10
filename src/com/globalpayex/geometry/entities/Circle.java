package com.globalpayex.geometry.entities;

public class Circle {
	
	int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	
	public float Area()
	{
		return (float) (Math.PI*radius*radius);
	}
	
	public float Perimeter()
	{
		return (float) (2*Math.PI*radius);
	}

}
