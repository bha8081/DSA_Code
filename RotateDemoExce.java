import java.util.Scanner;

public class RotateDemoExce
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enetr " + n + "element");
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.print("Enetr k: ");
		int k = sc.nextInt();

		System.out.println("Original array");
		printArray(arr);
		int[] ans = rotate(ans, k);
		System.out.println("Array after rotation");
		printArray(ans);
	}
}