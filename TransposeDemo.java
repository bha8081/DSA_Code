import java.io.*;
import java.util.*;

public class TransposeDemo
{
	public static void main(String[] args)
	{
		int m, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the row: ");
		m = sc.nextInt();
		System.out.println("Enter the number iof the colunms: ");
		n = sc.nextInt();

		int arr[][] = new int[m][n];
		int i, j;
		System.out.println("Enter the Matrix elements:\n ");
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		int trans[][] = new int[m][n];
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < m; j++)
			{
				trans[i][j] = arr[j][i];
			}
		}
    
   //printing result
   for (i = 0; i < m; i++)
   {
	   for (j = 0; j < n; j++)
	   {
		   System.out.println(trans[i][j] + " ");
	   }

	   System.out.println(" ");
   }

	}
}