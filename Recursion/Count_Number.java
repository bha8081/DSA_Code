// Count the Given n Number.
// num = 1234556
// ans = 7

public class Count_Number
{
	public static int count(int n)
	{
		if (n == 0)
		{
			return n;
		}

		return count(n/10) + 1;
	}

	public static void main(String[] args)
	{
		System.out.println(count(134246456));
	}
}