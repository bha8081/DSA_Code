// find the total number of pairs in the array whose sum is equal to the given value x.
//import java.util.Scanner;

public class PairSum
{
	static int pairSum(int[] arr, int target)
	{
	  int n = arr.length;
	   int ans = 0;

	   for (int i = 0; i < n; i++)
	   {
		   for (int j = i + 1; j < n; j++)
		   {
			   if(arr[i] + arr[j] == target)
			   {
				ans++;
			   }
		   }
	   }
	   return ans;
	}
	
}