public class Sum_NumberDemo
{
	public static int sumof(int n)
	{
		if (n >= 0 && n <= 9)
		{
			return n;
		}

		return sumof(n/10) + n%10;
	}

}