public class Pivot_Number_Exce
{
	public static void main(String[] args)
	{
		int[] arr = {7,9,5,4,3,2,6,4,3,1};
		System.out.println("Before sorting Array:");

		Pivot_Number p = new Pivot_Number();
		p.displyArr(arr);
		System.out.println();
		p.quickSort(arr, 0, arr.length-1);
		System.out.println("Array after sorting:");
        p.displyArr(arr);
	}
}