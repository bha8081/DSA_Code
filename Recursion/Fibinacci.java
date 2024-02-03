// Write a program nth number fibinacci number.

public class Fibinacci
{
	public static int fib(int n)
	{
		//Base case.
		if (n == 0 || n == 1)
		{
			return n;
		}

		//sub-problems,  Recursive worck.
		int prv = fib(n-1);
		int prv1 = fib(n-2);

		// Self Work.
		//return prv + prv1;

		int ans = prv + prv1;
	     return ans;
	}
}