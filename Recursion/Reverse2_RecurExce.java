import java.util.Scanner;

public class Reverse2_RecurExce
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();

		System.out.println("Output of Given Number: ");
		Reverse2_Recur.reverse(n);

	}
}