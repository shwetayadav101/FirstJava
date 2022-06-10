package com.globalpayex.geometry.entities;

import abc.geometry.entities.Shape;

public class Sqaure extends Shape {
	
	int side;
	int area;
	int parameter;
	public Sqaure(int side) {
		super();
		this.side = side;
	}
	
	public float Area()
	{
		float ans = this.side * this.side;
		return ans;
	}
	
	public float Perimeter()
	{
		float ans = this.side * 4;
		return ans;
	}
	
	

}
