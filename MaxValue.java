// Maximum Value.
// Find the Seconde Largest Value.

public class MaxValue
{
   public static int findMax(int[] arr)
	{
		int mx = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++)
		{
           if (arr[i] > max)
           {
			   mx = arr[i];
           }
		}
		return mx;
	}

	static  int findSecondMax(int[] arr)
	{
		int mx = findMax(arr);
    }

	for(int i = 0; i < arr.length; i++)
	{
		if (arr[i] == mx)
		{
			arr[i] = Integer.MiN_VALUE;
		}
	}

	int secondMax = findMax(arr);
	return secondMax;
}