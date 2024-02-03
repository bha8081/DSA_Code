import java.io.*;
import java.util.*;

public class Selection_SortExce
{
	public static void main(String[] args)
	{
		int[] arr = {23, 5, 64, 8, 42, 2, 0};
        Selection_Sort.selectionsort(arr);
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}