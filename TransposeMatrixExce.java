import java.util.Scanner;

public class TransposeMatrixExce
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows and columns of matrix: ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] matrix = new int[r][c];
		int totalElements = r * c;
		System.out.println("Enter " + totalElements + "values:");
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Input Matrix");
        TransposeMatrix.printMatrix(matrix);

		System.out.println("Transpose of Matrix");
		transposeInPlace(matrix, r, c);
		TransposeMatrix.printMatrix(matrix);
//		int[][] ans = findTranspose(matrix, r, c);
//		TransposeMatrix.findTranspose(matrix);
	}
}