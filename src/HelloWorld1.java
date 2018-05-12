
public class HelloWorld1 {
	
	private static double result;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition(3.0, 5);
		mult(3, 5);
		sub(3, 5);
	}
	
	public static void mult(double one, double two)
	{
		result = one * two;
		System.out.println(result);
	}
	
	public static void addition(double one, double two)
	{
		result = one + two;
		System.out.println(result);
	}
	
	public static void sub(double one, double two) 
	{
		result = one - two;
		System.out.println(result);
	}
	
	
}
