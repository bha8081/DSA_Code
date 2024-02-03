// 2D Array . Write a program to display Multiplication of two matrices entered by the user.

public class Multipication
{
	public static void printMatrix(int[][] matrix){...}

	public static void multiply(int[][] a,int r1, int c1, int[][] b, int r2, int c2)
	{
		if (c1 != r2)
		{
			System.out.println("Multiplication not possible - worng dimension: ");
			return;
		}

		int[][] mul = new int[r1][c2];

		for (int i = 0; i < r1; i++) //		row number
		{
			for (int j = 0; j < c2; j++) // column number
			{
               /*
			      i = 1, j = 0;
			      mul[i][j] = ith row of a * jth col of b
			   */

			   for (int k = 0; k < c1; k++)
			   {
                 mul[i][j] += (a[i][k] * b[k][j]); 
			   }

			}
		}
	}

   System.out.println("Multiplication of 2 matrices: ");
   printMatrix(mul);
 
}