public class PascalTringle
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

		public static int[][] pascal(int n)
		{
			int[][] ans = new int[n][];
			int col = 1;

			for (int i = 0; i < n; i++)
			{
				ans[i] = new int[col];

				for (int j = 0; j < col; j++)
				{
					if (j==0)
					{
						ans[i][j] = 1;
					}
					else if (j == col-1)
					{
						ans[i][j] = 1;
					}
                     else {
						ans[i][j] = ans[i-1][j-1]+ans[i-1][j];
                     }
				}

				col++;
			}

			return ans;
		}

	}

}

	  