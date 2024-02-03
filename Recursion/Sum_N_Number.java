// Print the sum of the n number.
//import java.util.Scanner;
public class Sum_N_Number
{
	public static int sum(int n)
	{
		if (n == 0)
		{
			//System.out.println(n);
			return 0;
		}

		return sum(n-1) + n;
	}
/*   public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);

	  System.out.println("Enter The Number: ");  
	  int n = sc.nextInt();

	  
	  System.out.println("Sum Of 1 to Given Number's: \n" +sum(n));
	} */

}