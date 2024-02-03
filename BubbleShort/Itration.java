public class Itration 
{
	public static void bubbleSort(int[] a)
	{
		int n = a.length;
		// n-1 iterations/passes
		for (int i = 0; i < n-1; i++)
		{
			for (int j = 0; j < n-i-1; j++)
			{
				/*
				 Last i elements are already at carrect sorted positions,
				 so no need to check them.
				*/
				
				if (a[j] > a[j + 1])
				{
					//swap - a[j], a[j + 1]
					int temp = a[j];
				    a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		int[] a = {34, 75, 8, 0, 98, 64, 24, 3};
		bubbleSort(a);
		for (int i : a)
		{
			System.out.print(i + " ");
		}
	}

}