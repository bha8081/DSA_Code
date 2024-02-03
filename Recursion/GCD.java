// find the gcd gretest common diviser.

import java.util.Scanner;
public class GCD
{
	public static int gcd(int x, int y)
	{
		if (y == 0)
		{
			return x;
		}
		return gcd(y, x % y);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number: ");
		int x = sc.nextInt();

		System.out.println("Enter The Second Number: ");
		int y = sc.nextInt();

        
		System.out.println("GCD of given number: \n"  +gcd(x, y));
	}
}