import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PlayHashset {
	public static void main(String[] args) {
		
		List<Integer> nos =  Arrays.asList(4,1,6,7,9,10,3,5,1,7,9);
		HashSet<Integer> hashSet = new HashSet<> (nos);
		System.out.println(hashSet);
		
		HashSet<String[]> fruits = new HashSet<>();
		fruits.addAll("banana");
		fruits.add("Apple");
		fruits.add("orange");
		System.out.println(fruits);
		
		
		
		
		
		
		
	}

}
