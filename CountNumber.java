// Count the number of occurrences of a particular element x.
// Input a[] = {4,7,9,1}
// x = 1
import java.util.*;
public class CountNumber
{
	public static int countOfElements(int a[], int x)
	{
		int count = 0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==x)
				count++;
		}
		return count;
	}

	public static void main(String[] args)
	{
		int a[] = {1,4,9,1};
		System.out.println(countOfElements(a,2));
	} 
}