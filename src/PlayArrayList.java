import java.util.*;
public class PlayArrayList {
	
	public static void main(String[] args)
	{
		ArrayList<String> cars = new ArrayList<>();
		
		cars.add("i10");
		cars.add("i20");
		
		System.out.print(cars);
		
		cars.add(1,"Porche");
		System.out.println(cars.size());
		
		System.out.println(cars.remove(0));
		System.out.println(cars);
		
		cars.remove("Porche");
		System.out.println(cars);
		
		cars.set(0, "i10");
		System.out.println(cars);
		
	}

}
