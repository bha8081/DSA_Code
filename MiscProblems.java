// Second swape question.,

public class MiscProblems
{
	public static void swap(int a, int b)
	{
		System.out.println("Orignal value before swap: ");
		System.out.println("a: " +a);
		System.out.println("b: " +b);

		a = b;
		b = a;

		System.out.println("Value after swap: ");
		System.out.println("a: " +a);
		System.out.println("b: " +b);
	}
//	public static void main(String[] args)
//	{
//		int a = 9;
//		int b = 5;
//		int[] arr = {1,3,5,6,8,9};
//		swap(a, b);
//	}
}