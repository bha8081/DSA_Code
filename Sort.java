// Sort an array consisiting of only 0s and 1.

public class Sort
{
	public static void sortZeroesAndOne(int[] a)
	{
		int n = a.length;
		int i = 0;
		int j = n - 1;
		while (i < j)
		{
			if (a[i] == 1 && a[j] == 0)
			{
				a[i] = 0;
				a[j] = 1;
				i++;
				j++;
			}

			if (a[i] == 0)
			 i++;
			if(a[j] == 1)
				j--;
		}
	}
}