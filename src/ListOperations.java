import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOperations {
	public static void main(String[] args) {
		List<Integer> nos = Arrays.asList(4,2,3,1,6,7,9);
		Stream<Integer> stream =nos.stream();
		//create a new list consisting of odd numbers more than 3 from the nos list
		//print the new list
		List<Integer> odds =stream
				.filter(element -> element % 2 != 0 && element > 3)
				.collect(Collectors.toList());
		System.out.println(odds); 
		int [] n = { 
		
		+
		//ArrayList<Integer> lt = new ArrayList<Integer>();
		//nos.forEach((o) -> {
			//if(o%2 !=0 && o>3 ) lt.add(o);});
		
	
	    //System.out.println(lt);
		
		
	
}
