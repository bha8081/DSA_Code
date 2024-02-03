public class MultiArray
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

//  public static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2)
//	{}

	public static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2)
	{
		if(r1 != r2 || c1 != c2)
		{
			System.out.println("Wrong Input - Addition not possible ");
			return;
		}

		int[][] sum = new int[r1][c1];

		for(int i = 0; i < r1; i++) // row number
		{
			for(int j = 0; j < c1; i++) // column number
			{
				sum[i][j] = a[i][j] + b[i][j];
			}
		}

	   System.out.println("Sum of matrix 1 and matrix 2: ");
       printMatrix(sum);
	}
} 
