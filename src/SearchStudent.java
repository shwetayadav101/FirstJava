import java.util.HashMap;
import java.util.Scanner;

import com.globalpayex.college.entities.Student;

public class SearchStudent {
	public static void main(String[] args) {
		
	
	HashMap<Integer , Student> map = new HashMap<>();
	map.put(10 ,new Student("shweta",'F',10,90));
	map.put(10,	new Student("jane",'F',10,50));
	map.put(11 ,new Student("rahul",'m',11,80));
	map.put(10,	new Student("akshay",'m',10,60));
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("enter number to search");
	int n = scanner.nextInt();
	
	
	if(map.containsKey(n))
	{
		Student s1=map.get(n);
		System.out.print(s1.getDetails());
		
	}else
	{
		System.out.print("dont exist");
	}
	
	
	}	

}
