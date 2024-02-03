import java.io.*;
import java.util.*;

public class SortedExce 
{
  public static void main(String[] args)
	{
		int[] a = {-10, -30, 2, 5, 6};
        Sorted s = new Sorted();

		int[] ans = s.sortedSquares(a);
		for (int element: ans)
		{
			System.out.print(element + " ");
		}
	}
}