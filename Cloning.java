// Cloning an Array.
// Cloning mens insert the new value in array.

public class Cloning
{
	public static void main(String[] args)
	{
		int a[] = {23,54,64,46,54};
		int n = a.length;

		int b[] = a.clone();
		//b[0] = 6;
		b[2] = 29;

		System.out.println("Original array ");
		for(int i = 0; i <n; i++)
			System.out.println(a[i] + " ");
		System.out.println("\nCloned Array ");
		for(int i = 0; i < b.length; i++)
			System.out.println(b[i] + " ");
	    
	}
}