import java.util.Scanner;
public class Multi_NumberExce
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		int n = sc.nextInt();

		System.out.println("Enter Second Number: ");
		int k = sc.nextInt();

		System.out.println("Multiple give number is: ");
		Multi_Number.mult(n, k);
	}
}