

public class GenrateSperical
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

   public static int[][] generateSpiralMatrix(int n)
	{
        int[][] matrix = new int[n][n];

		int topRow = 0, bottomRow = n-1, leftCol = 0, rightCol = n-1;
		int curr = 1;  // curr= current element.

		while (curr <= n * n)
		{
			//top row -> leftCol to RightCol
			for(int j = leftCol; j <= rightCol && curr <= n*n; j++)
			{
				matrix[topRow][j] = curr; // other wise matrix[topRow][j] = curr++;
				curr++;
			}
			topRow++;

			//bottomRow -> rightCol to leftCol
			for (int j = rightCol; j >=leftCol && curr <= n*n; j--)
			{
				matrix[bottomRow][j] = curr;
				 curr++;
			}
			bottomRow--;

			//left Col -> bottomRow to topRow
			for (int i = bottomRow; i >= topRow && curr <= n*n; i--)
			{
				matrix[i][leftCol] = curr;
				  curr++;
			}
			leftCol++;
		}
    }
}
