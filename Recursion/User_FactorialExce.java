import java.util.Scanner;

public class User_FactorialExce
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Any Number: ");
		int n = sc.nextInt();

	    User_Factorial.fact(n);
		//int a = User_Factorial.fact(n);
		System.out.println("Factorial Of Given Number: ");
		
	}

}