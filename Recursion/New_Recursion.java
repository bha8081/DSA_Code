public class New_Recursion
{
	public static void pri(int n)
	{
		if (n == 34)
		{
			System.out.println(n);
			return;
		}

		pri(n-1);
		System.out.println(n);
	}
}