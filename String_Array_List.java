// String arraylist.

public class String_Array_List
{
	public static void reverse(ArrayList<String> stri)
	{
      int i = 0, j = stri.size() - 1;
	    while (i < j)
	    {
			String temp = String.valueOf(stri.get(i));
			stri.set(i, stri.get(j));
			stri.set(j, temp);

			i++;
			j--;
	    }
	}
}