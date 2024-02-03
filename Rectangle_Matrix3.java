import java.io.*;
import java.util.*;

public class Rectangle_Matrix3
{
	public static int solve(int[][] a, int l1, int l2, int r1, int r2)
	{
		int ans = 0;
		int n = a.length, m = a[0].length;

		// calculating the horizontal sum for each row in the Matrix.

		for (int i = 0; i < n; i++) // 'i' is row
		{
			for (int j = 1; j < m; j++) // 'j' is column.
			{
				a[i][j] += a[i][j-1];
			}
		}

		// now only traversing over rows through below for loop
		// as we have precalculated profix matrix.

		for (int i = l1; i <= l2; i++)
		{
			if (r1 >= 1) 
			{
				ans += a[i][r2] - a[i][r1-1];
			}
			else
			{
				ans += a[i][r2];
			}
		}

		return ans;
	}

/*	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Row:");
		int r = sc.nextInt();
		System.out.println("Enter the number of Columns:");
		int c = sc.nextInt();

		int[][] matrix = new int[r][c];
		System.out.println("Enter the elements of matrices:");
		for(int i=0; i < r; i++)
		{
			for(int j=0; j < c; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the value of l1, l2, r1, r2");
		int l1 = sc.nextInt();
		int l2 = sc.nextInt();
		int r1 = sc.nextInt();
		int r2 = sc.nextInt();
        
		//Rectangle_Matrix3.solve(matrix, l1, l2, r1, r2);
		System.out.println(solve(matrix, l1, l2, r1, r2));
	} */
  }