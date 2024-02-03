import java.io.*;
import java.util.Scanner;

public class MultiArrayExce
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of array");
		int r1 = sc.nextInt();
        int c1 = sc.nextInt();

		int[][] a = new int[r1][c1];
		System.out.println("Enter matrix values: ");
		for (int i = 0; i < r1; i++)
		{
			for (int j = 0; j < c1; j++)
			{
              a[i][j] = sc.nextInt();
			}
		}
      System.out.println("Enter number of rows and columns of matrix 2: ");
	  int r2 = sc.nextInt();
	  int c2 = sc.nextInt();
	  int[][] b = new int[r2][c2];
	  System.out.println("Enter matrix values: ");
	   for (int i = 0; i < r2; i++)
	   {
		   for (int j = 0; j < c2; j++)
		   {
             b[i][j] = sc.nextInt();
		   }
	   }

	   System.out.println("Matrix 1: ");
	   MultiArray.printMatrix(a);

	   System.out.println("Matrix 2: ");
	   MultiArray.printMatrix(b);

	   MultiArray.add(a, r1, c1, b, r2, c2);
	   //System.out.println("" +add(a, r1, c1, b, r2, c2));
	}
}