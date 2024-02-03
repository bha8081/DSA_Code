// Find GCD in Itreated method.
public class Itreated_Gcd
{
	public static int sum(int x, int y)
	{
      while (x % y != 0)
      {
		  int rem = x % y;
		  x = y;
		  y = rem;
      }

	  return y;
   }
}