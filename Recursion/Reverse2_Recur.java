public class Reverse2_Recur
{
   public static void reverse(int n)
	{
		if (n == 23)
		{
			System.out.println(23);
			return;
		}

		System.out.println(n);

		reverse(n-1);
		
	}
}