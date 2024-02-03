// given a nuymber num and a value k. print k multiples of num.

public class Multi_Number
{
	public static void mult(int n, int k)
	{
		// base case.
		if (k == 1)
		{
		  System.out.println(n);
          return;
		}

		//recursive work.
		  mult(n, k-1);

		// self work.
          System.out.println(n * k);
	}
}