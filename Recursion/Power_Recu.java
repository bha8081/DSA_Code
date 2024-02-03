// Given two number p & q, find the value p ^ q using a recursive function.

public class Power_Recu
{
	public static int pow(int p, int q)
	{
		if (q == 0)
		{
			return 1;
		}
 
       // 1st method
		//int samllAns = pow(p, q-1);
        //return samllAns * p;

		// 2nd method.
		return pow(p, q-1) * p;
	}
}