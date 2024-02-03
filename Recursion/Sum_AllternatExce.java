import java.util.Scanner;

public class Sum_AllternatExce
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number: ");
		int n = sc.nextInt();

		int a = Sum_Allternat.sum(n);
		System.out.println("Sum of Number's: \n" +a);
	}
}