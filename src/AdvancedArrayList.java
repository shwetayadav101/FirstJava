import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
//import java.util.Arrays;
import java.util.List;

public class AdvancedArrayList {
	public static void main(String[] args) {
		List<Integer> nos = Arrays.asList(4,1,6,7,9,10,3,5,1,7,9);
		System.out.println(nos);
		System.out.println(nos.getClass());
		
		LinkedList<Integer> l = new LinkedList<>(nos);
		System.out.println(l);
		//to print all the nos without using a loop
			
		nos.forEach(n -> System.out.print(n));
		
		//to print alll the even nos without explicitly using a loop
		
		nos.forEach(n -> {
			if(n%2==0 ) {
			
			System.out.println(n);
		}
		
		
	});
		//method refrences
		System.out.println("*******all numbers(method refrences)*****");
		nos.forEach(System.out::println);
		
}

}
