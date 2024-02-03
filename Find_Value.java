// Find the last occurrence of an element x in a given array.
// Input a[] = {32,65,76,47}

public class Find_Value
{
	public static int lastOccurance(int a[], int x)
	{
		int index = -1;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i] == x)
				index = i;
		}
		return index;
	}
}