import java.util.Scanner;

public class PairSumExce
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.print("Enetr " + n + "elements");
		for(int i = 0; i < n; i++)
		 {
			arr[i] = sc.nextInt();
		 }

		 System.out.print("Enter target sum: ");
		 int target = sc.nextInt();

		 //System.out.println(pairSum(arr, target));

         PairSum.pairSum();
		 System.out.println(pairSum(arr, target));
	}
}