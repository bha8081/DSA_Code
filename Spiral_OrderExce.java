import java.io.*;
import java.util.*;

public class Spiral_OrderExce
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int r = sc.nextInt();

		System.out.println("Emter the number of column: ");
		int c = sc.nextInt();
		int[][] matrix = new int[r][c];
		int total = r * c;
		System.out.println("Enter " + total + " values");

		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Input Matrix: ");
		Spiral_Order.printMatrix(matrix);

		System.out.println("Spiral Order: ");
		Spiral_Order.printSpiralOrder(matrix, r, c);
	}
}