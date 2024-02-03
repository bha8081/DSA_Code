// Find the sum of the elements of the array[2,4,5,6].

public class Sum_Of_Array
{
	public static int sumof(int[] arr, int index)
	{
		//Base Case
		if(index == arr.length)
		{
			return 0;
		}

       //recursive work.
	   int SmallAns = sumof(arr, index + 1);

	   // self work.
	   return SmallAns + arr[index];
	}
}