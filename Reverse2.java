public class Reverse2
{
	public int[] reverseArray(int arr[])
	{
		//Computing the size of the array;
		int size = arr.length;

		//auxiliary array for reversing the 
		//elements of the array arr

		int temp[] = new int[size];

		int index = 0;
		for (int i = size-1; i >= 0; i--)
		{
			temp[i] = arr[index];
			index = index + 1;
		}
	}

	return temp;
}