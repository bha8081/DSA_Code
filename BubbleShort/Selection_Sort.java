public class Selection_Sort
{
   public static void selectionsort(int[] arr)
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
		{
			//i represent the current index.
			// Find the minimum element in unsorted part of array.
			int min_index = i;
			for(int j = i+1; j < n; j++)
			{
				if(arr[j] < arr[min_index])
				{
					min_index = j;
				}
			}
// Sawp current element and minimum element --> current index i will have correct.
// a[min_index], a[i]

           int temp = arr[i];
		   arr[i] = arr[min_index];
		   arr[min_index] = temp;
		}
	}
}