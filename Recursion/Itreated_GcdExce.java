import java.util.Scanner;
public class Itreated_GcdExce
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first Number: ");
		int x = sc.nextInt();

		System.out.println("Enter the Second Number: ");
		int y = sc.nextInt();

		int r = Itreated_Gcd.sum(x, y);
		System.out.println("GCD of given number: \n" +r);
	}
}