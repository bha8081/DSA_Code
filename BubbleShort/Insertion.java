public class Insertion
{
	public static void insertionsort(int[] a)
	{
		int n = a.length;
		for (int i = 0; i < n; i++)
		{
			int j = i;
			
		  while (j > 0 && a[j] < a[j-1])
		  {
			  int temp = a[j];
			  a[j] = a[j-1];
			  a[j-1] = temp;
			  j--;
		  }
		}
	}
}