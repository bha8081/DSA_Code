// Given a number n, print the following pattern without using any loop.
// n,n-5,n-10,...,0,5,10...,n-5,n.

public class N_Pattern
{
	public static int patt(int n, int m)
	{
		if (m-5 > 0)
		{
			return 0;
		}
		return patt(m-5)
	}
}