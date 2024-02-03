// Reverse an array consisting of integer values.

public class Reverse
{
	public static int[] reverseArray(int[] arr)
	{
		int n = arr.length;
		int[] ans = new int[n];
		int j = 0;

		//traverse orignal array in reverse direction
		for(int i = n-1; i >== 0; i--)
		{
			ans[j++] = arr[i];
		}

        return ans;
	}
}