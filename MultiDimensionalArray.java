import java.util.Scanner;

public class MultiDimensionalArray
{
   public static void printArray(int[][] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
//			System.out.println(arr[i]);
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
//       int[][] arr = new int[2][3];
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter number of row: ");
	   int r = sc.nextInt();
	   System.out.println("Enter number of the columns: ");
	   int c = sc.nextInt();

	   int[][] arr = new int [r][c]; // total = r*c;

       System.out.println("Enter " + r*c + " elements");
       for (int i = 0; i < r; i++)
       {
		   for (int j = 0; j < c; j++)
		   {
			   arr[i][j] = sc.nextInt();
		   }
       }

//		int[][] arr = {
//			{1, 4, 6},
//			{3, 6, 9},
//			{2, 8, 0}
//	};
    System.out.println("Value of the Array");
		printArray(arr);
	}
}