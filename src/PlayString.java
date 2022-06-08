public class PlayString 
{
	public static void main(String[] args) 
	{
		String s1 = "Shweta";
		String s2 ="yadav";
		String s3 = "S" + "y";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1+" "+s2);
	}
}