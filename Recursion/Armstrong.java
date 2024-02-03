// Calculate the Armstrong number in gcd.
import java.util.Scanner;
public class Armstrong
{
	int z;
	public static int astro(int x, int y)
	{
		if (x != 0)
		{
			z = x % 10;
			y = y + (z * z * z);
			x /= 10;
			return astro(x, y);
		}

		return y;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        
		int arm;
		System.out.println("Enter number: ");

		for (int i = 0; i < 500; i++)
		{
			arm = Armstrong(x, 0);
		}
		if (arm == x)
		{
			System.out.println(x);
		}
	}
}