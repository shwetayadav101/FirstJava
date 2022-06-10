
public class PowerfulFunction {

	static int nextGenAdd(int... nos)
	{
		int sum =0;
		for(int x:nos) sum+=x;
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(nextGenAdd(1,2,3,4));
		System.out.println(nextGenAdd(1,2));
	}
}
