import java.util.ArrayList;
import java.util.Comparator;

public class PlayArrayListAgain{
	

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		for(int i= 0;i<10;i++)
		{
			marks.add(10-i);
		}
		
		marks.sort( new DecendingComparator());
		
		
		marks.sort(new Comparator<Integer>()
		{
			@Override
			public int compare(Integer o1,Integer o2)
			{
				return o2.compareTo(o1);
			}
		});
		// lambda expression
		// be in the moment
		marks.sort((o1,o2) -> o2.compareTo(o1));
		// Functional Interface 
		/*
		 * 
		 * */
		
		System.out.print(marks);
	}
	

}
