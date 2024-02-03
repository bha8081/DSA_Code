// Return the first value of the repeted value. or no repeted value give the -1.
import java.util.*;
import java.lang.*;

public class FirstRepeatedValue
{
 public static int firstRepeated(int[] a, int n)
  {
	for (int i =0; i<n; i++)
	{
		int curr = a[i];
		for (int j = i+1; j<n; j++)
		{
			if(a[j] == curr)
				return i+1;
		}
	}
	return -1;
   }

   public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int[] a = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}

		int ans = firstRepeated(a,n);
		System.out.println(ans);

	}
}