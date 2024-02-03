// Find the unique number in a given array where all the elements are repeated twice with one value being unique.
import java.util.*;
import java.lang.*;

public class Target1
{
	public static int findUnique(int[] a)
	{
		int n = a.length;
		for (int i=0; i<n; i++)
		{
          for (int j=i+1; j<n; j++)
          {
			  if (a[i]==a[j])
			  {
				  a[i] = a[j] = -1;
			  }
          }
		}
		for (int i=0; i<n; i++)
			if (a[i]>0)
		     return a[i];
			return 1;
	}

/*	   public static void main(String[] args)
	    {
		  int a[]={22,4,2,54,74,2};
		   System.out.println(findUnique(a));
	     } */
 }