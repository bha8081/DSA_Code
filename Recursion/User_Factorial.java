// Find Factorial n number By user input.

public class User_Factorial
{
	public static int fact(int n)
	{
		if (n == 0)
		{
			return 1;
		}
		//System.out.println("hi");
		return n * fact(n-1);
	}
}