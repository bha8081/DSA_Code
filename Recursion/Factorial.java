// Q Find the value of factorial n.

public class Factorial
{
	public static int fact(int n)
	{

		//Base case
		if (n==0)
		{
			return 1;
		}

		//Smaller problem - recursive work.
		int smallAns = fact(n-1);

		//big problem - self work.
		int ans = n * smallAns;
		return ans;
	}
}