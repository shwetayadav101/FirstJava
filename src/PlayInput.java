import java.util.*;
import java.io.*;

public class PlayInput {
	
	static String isEven(int n)
	{
		return n%2 == 0 ? "It's even" : "It's odd";
	}
	public static void main(String[] args){
		System.out.println("Program Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number n:");
		while(true)
		{
			try {
				 int n = sc.nextInt();
				 System.out.println(isEven(n));
				 break;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Give int value");
				sc.nextLine(); // refresh the scanner
			}
		}
		
		
		sc.close();
		System.out.println("Program ended");
		
		
	}

}
