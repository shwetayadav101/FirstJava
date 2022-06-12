import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.globalpayex.college.entities.Student;

public class ContainsElement {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
			new Student("shweta",'F',10,90),
			new Student("jane",'F',10,50),
			new Student("rahul",'m',11,80),
			new Student("akshay",'m',10,60)
			);
		
		System.out.print("enter roll you want to search");
		Scanner sc = new Scanner(System.in);
		int roll=sc.nextInt();
		
		/*for (Student x :students)
		{
			if(x.roll == roll) {
				
				System.out.print(x.getDetails()); 
			return ;
			}
			
			
		}
		System.out.print("no user found");
		
			
		*/
		boolean isFound= students.contains(new Student("NA",'m',roll,0));
		
		System.out.print(isFound ? "student found" : "student not found");
		
		
		
		
		
	}
	}


