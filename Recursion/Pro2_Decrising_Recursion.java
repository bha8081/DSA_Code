// Write a program to print all natural number from n to 1 using recursion.

public class Pro2_Decrising_Recursion
{
	public static void printDecresing(int n)
	{
		//Base Case
		if (n == 1)
		{
			System.out.println(1);
			return;
		}
		// Self work 
		System.out.println(n);

		//recursive work.
		printDecresing(n-1);


	}
}