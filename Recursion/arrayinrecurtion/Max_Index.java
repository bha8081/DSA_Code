// Print the max value of the array.

public class Max_Index
{
	public static int maxInt(int[] arr, int idx)
	{
		if (idx == arr.length-1)
		{
			return arr[idx];
		}
		// small problem - idx1, end of the array - max - return.
		int smallAns = maxInt(arr, idx + 1);

		//self work and final ans
		return Math.max(arr[idx], smallAns);
	}
}