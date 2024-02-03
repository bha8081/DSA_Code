import java.util.*;
import java.lang.*;

public class Target3
{
	public static int secondLargestValue(int [] a)
	{
		int n = a.length;
        int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		for(int i=0; i<n; i++)
		{
			if (max<a[i])
			  max=a[i];
         }

		 for (int i=0; i<n; i++)
		 {
		   if(a[i]!=max)
			 {
			   if(a[i]>smax)
		        smax = a[i];
		 }
	}
	return smax;
	}

  public static void main(String[] args)
  {
	int a[]={32,42,42,4,3,23,44};
	System.out.println(secondLargestValue(a));
  }

}