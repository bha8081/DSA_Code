import java.util.Scanner;

public class PascalTringleExce
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();

		int[][] ans = pascal(n);
		printMatri(ans);
	}
}