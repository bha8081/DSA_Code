import java.io.*;
import java.util.*;
public class TargetDemo
{
	public static int[] sortArrayByPriinty(int[] a)
	{
		int i = 0, j = a.length-1;
		while(i < j)
		{
			if (a[i] % 2 == 1 && a[j] % 2 == 0)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}

			if(a[i] % 2 == 0)
				i++;
            if(a[j] % 2 == 1)
				j--;
		}
		return a;
	}

	public static void main(String[] args)
	{
		int[] a = {1,2,4,5,6,9,7};
		int[] ans = sortArrayByPriinty(a);
		 for (int element: ans)
		 {
			 System.out.println(element + " ");
		 }
	}
}