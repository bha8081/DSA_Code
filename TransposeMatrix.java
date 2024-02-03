// Write a program to display transpose of matrix extered by the user.

public class TransposeMatrix
{
/*	public static void printMatrix(int[][] matrix)
	{
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();
		}
	} */

	public static int[][] findTranspose(int[][] matrix, int r, int c)
	{
		int[][] ans = new int[c][r];

		for (int i = 0; i < c; i++)
		{
			for (int j = 0; j < r; j++)
			{
				ans[i][j] = matrix[j][i];
			}
		}
		return ans;
	}
    
 /* public static void transposeInPlace(int[][] matrix, int r, int c)
	{
		for (int i = 0; i < c; i++)
		{
			for (int j = 0; j < r; j++)
			{
				int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	} */
}
