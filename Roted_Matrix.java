// Rotate a matrix.

public class Roted_Matrix
{
	public static void printMatrix(int[][] matrix)
	{
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}
	}

	public static void transposeInPlace(int[][] matrix, int r, int c)
	{
		for (int i = 0; i < c; i++)
		{
			for (int j = i; j < r; j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}

	public static void reverseArray(int[] arr)
	{
		int i =0, j = arr.length-1;

		while (i < j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

  public static void rotate(int[][] matrix, int n)
	{
		//transpose
		transposeInPlace(matrix, n , n);

		//reverse each row of the transposed matrix.
		for(int i = 0; i < n; i++)
		{
		reverseArray(matrix[i]);
	}

  }
}