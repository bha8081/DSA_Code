// give na number n. find the sum of natural number's till n but with alternate sings.

public class Sum_Allternat
{
	public static int sum(int n)
	{
		if (n == 0)
		{
			return 0;
		}

		if (n % 2 == 0)
		{
			return sum(n - 1) - n;
		} else {
			return sum(n - 1) + n;
		}
	}
}