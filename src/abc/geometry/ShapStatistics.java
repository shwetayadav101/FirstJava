package abc.geometry;

import abc.geometry.entities.Shape;

public class ShapStatistics {

	public static void print(Shape shape)
	{
		System.out.println("***************Statistics************");
		System.out.println(String.format("Area is %s",shape.Area()));
		System.out.println(String.format("Area is %s",shape.Perimeter()));
		System.out.println("***************Statistics************\n");
	}
}
