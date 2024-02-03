// Given n integer, find out the sum of its digits using recursion.

public class SumOf_Number
{
	public static int sumof(int n)
	{
		// base case.
		if (n >= 0 && n <= 9)
		{
			return n;
		}
		//recursive work- small work.
		int smallAns = sumof(n / 10);

		// self work.
		int ans = smallAns + n % 10;
		return ans;
	}
}