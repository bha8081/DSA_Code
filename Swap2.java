public class Swap2
{
	public static void swapWithoutTemp(int a, int b)
	{
		System.out.println("Orignal value before swap: ");
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Values after swap");
		System.out.println("a: " + a);
        System.out.println("b: " + b);
	}

   public static void main (String[] args)
	{
		int a = 9;
		int b = 3;
		int[] arr = {1,2,3,4,5};
		swapWithoutTemp(a, b);
	}
}