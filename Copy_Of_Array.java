// Array Copy in Java.
import java.io.*;
import java.util.*;

public class Copy_Of_Array
{
	public static void main(String[] args)
	{
		int a[] = {23,45,65,86,86};
		int n = a.length;

		int b[] = Arrays.copyOf(a, 5);
		b[0] = 35;

		System.out.println("Original array ");
		for(int i = 0; i < n; i++)
			System.out.println(a[i] + " ");
		System.out.println("\nCopied Array ");
		for(int i = 0; i <b.length; i++)
			System.out.println(b[i] + " ");
	}
}