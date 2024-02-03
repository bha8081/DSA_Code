// Quick short Pivot number Programm.

public class Pivot_Number
{
	public static void displyArr(int[] arr)
	{
		for (int val: arr)
		{
			System.out.print(val + " ");
		}
	}
	 public static void swap(int[] arr, int x, int y)
     {
		int temp = arr[x];
        arr[x] = arr[y];
		arr[y] = temp;
     }

	 public static int partition(int[] arr, int start, int end)
	 {
		int pivot = arr[start];
		int count = 0;
		for (int i= start + 1; i <= end; i++)
		{
			if(arr[i] <= pivot)
			{
				count++;
			}
				
		}
		int pivotIdx = start + count;
		swap(arr, start, pivotIdx);
		int i = start;
		int j = end;

		while(i < pivotIdx && j > pivotIdx)
		 {
			while (arr[i] <= pivot)
			{
				i++;
			}
			while(arr[j] > pivot)
			 {
				j--;
			 }
			 if(i < pivotIdx && j > pivotIdx)
			 {
				
				swap(arr, i, j);
				i++;
				j--;
			 }

		 }
		 return pivotIdx;
	 }
	 public static void quickSort(int[] arr, int start, int end)
	{
		if (start >= end)
		{
			return;
		}
		int pi = partition(arr, start, end);
		quickSort(arr, start, pi-1);
		quickSort(arr, pi+1, end);
	}
}