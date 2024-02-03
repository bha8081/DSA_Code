import java.io.*;
import java.util.Scanner;

public class GenrateSpericalExce
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();

		int[][] matrix = generateSpiralMatrix(n);
		GenrateSperical.printMatrix(matrix);
	}
}