import java.util.*;
public class RandomArray {
	
	
	static <T extends Number> T randomElement(T[] x)
	{
		Random random = new Random();
		int index = random.nextInt(x.length);
		return x[index];
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		int index = random.nextInt();
		
		Integer[] x = {2,3,4,5};
		int dd = randomElement(x);
		System.out.print(dd);
	}


}
