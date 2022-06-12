
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class MathematicalSet {
	public static void main(String[] args) {
		List<Integer> d1 =Arrays.asList(1,3,9,10);
		List<Integer> d2 = Arrays.asList(3,9,8);
		
		LinkedHashSet<Integer> sd1= new LinkedHashSet<>(d1);
		LinkedHashSet<Integer> sd2= new LinkedHashSet<>(d2);
		
		LinkedHashSet<Integer> csd1 = (LinkedHashSet<Integer>) sd1.clone();
		System.out.print(csd1);
		
		//union
		//csd1.addAll(sd2);
		//System.out.print(csd1);
		
		//intersection
		HashSet<Integer >csd11 = (LinkedHashSet<Integer>) sd1.clone();
		csd11.retainAll(s2);
		System.out.print(cs1);
		
		
		}
}
