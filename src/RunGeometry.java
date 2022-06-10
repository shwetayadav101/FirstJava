import com.globalpayex.geometry.entities.Rectangle;
import com.globalpayex.geometry.entities.Sqaure;

import abc.geometry.ShapStatistics;
import abc.geometry.entities.Shape;

public class RunGeometry{

	public static void main(String[] args)
	{
		Sqaure sqaure = new Sqaure(7);
		 ShapStatistics.print(sqaure);
	
	
	Shape s = new Sqaure(7);
	ShapStatistics.print(s);
	Shape s1 = new Rectangle(3,4);
	ShapStatistics.print(s1);
	
	}
}
