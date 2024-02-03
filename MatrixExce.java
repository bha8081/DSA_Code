import java.io.*;
import java.util.*;

public class Roted_MatrixExce
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of the row: ");
		int r = sc.nextInt();

		System.out.println*("Enter the number of the columns: ");
		int c = sc.nnnnextInt();

		int[][] matrix = new int[r][c];
		int totalElements = r * c;

		System.out.println("Enter " +totalElements + "values");
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c; j++)
			{
			 matrix[i][j] = sc.nextInt();

			}
		}                                   

		System.out.println("Input Matrix: ");
		Roted_Matrix.printMatrix(matrix);

		rotate(matrix, r);

		System.out.println("Rotation of Matrix: ");
		Roted_Matrix.printMatrix(matrix);
	}
}