// Taking Array Input In Java.
import java.io.*;
import java.util.Scanner;

public class TakingInput
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
     
	    System.out.println("Enter size of Array");
		int n = sc.nextInt();
		int [] put= new int[n];
		

		System.out.println("Enter array" + n + "elements");
		for (int i = 0; i < n; i++)
		{
			put[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++)
		{
			System.out.print(put[i] + " ");
		}
	}
}