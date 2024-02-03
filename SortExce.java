import java.io.*;
import java.util.*;

public class SortExce
{
	public static void main(String[] args)
	{
		int[] a = {0,1,1,0,1,1,0,1,1};
		Sort.sortZeroesAndOne(a);
		for (int element: a)
		{
			System.out.print(element + " ");
		}
	}
}