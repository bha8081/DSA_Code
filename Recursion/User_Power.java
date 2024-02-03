// Calculat p^q using user input.

import java.util.Scanner;

public class User_Power
{
	public static int pow(int p, int q)
	{
		if (q == 0)
		{
			return 1;
		}

		return pow(p, q-1) * p;
	}

	public static void main(String[] args)
	{
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the Number: ");
		//int n = sc.nextInt();

		System.out.println(pow(5,4));
	}
}