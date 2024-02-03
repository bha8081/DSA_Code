//import java.io.*;
//import java.util.*;

public class Insertion_Exce
{
	public static void main(String[] args)
	{
		int[] a = {4,8,47,86,2,78};

		Insertion.insertionsort(a);
		for(int val : a) {
			System.out.print(val + " ");
		}
	}
}