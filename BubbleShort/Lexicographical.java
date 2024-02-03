/* Give an array of names of the fruits; you are supposed to sort it in lexicographical order using
   the selection sort.

   INPUTE : ["bhavesh", "shubham", "nitesh", "prince","dev"]
*/

import java.io.*;
import java.util.*;

public class Lexicographical
{
	public static void sortName(String[] args)
	{
		int n = data.length;
		for (int i = 0; i < n-1; i++)
		{
			int min_index = i;
			for (int j = i+1; j < n; j++)
			{
				if(data[j].compareTo(data[min_index]) < 0)
				{
					min_index = j;
				}
			}
			//swap name[min_index], name[i]
			String temp = data[i];
			data[i] = data[min_index];
			data[min_index] = temp;
		}
	}

	public static void main(String[] args)
	{
		String[] data = {"bhavesh", "shubham", "nitesh", "prince", "dev"};
		sortName(data);
		for(String val : data)
		{
			System.out.print(val + " ");
		}
	}
}