public class Rectangle_Sum
{ 
	public static int findSum(int[][] matrix, int l1, int r1, int l2, int r2)
	{
		int sum = 0;
        for (int i = l1; i <= l2; i++)
        {
			for (int j = r1; j <= r2; j++)
			{
				sum += matrix[i][j];
			
			}

		return sum;
	}

   }
} 