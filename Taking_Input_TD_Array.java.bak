import java.io.*;
import java.util.Scanner;

public class Taking_Input_TD_Array
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int r = sc.nextInt();
		System.out.println("Enter the number of the columns: ");
		int c = sc.nextInt();
		int arr[][] = new int[r][c];

		int total = r * c;
		System.out.println("Please enter " + total + "elements now: ");
        
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		sc.close();
		System.out.println("The Input array is: ");
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
				System.out.println();
		}
	}
}