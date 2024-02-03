public class Reverse2Exce
{
	public static void main(String[] args)
	{
     Reverse2 r = new Reverse2();

	 int arr[] = {1,2,3,4,5,6,7,8};

	 int len = arr.length;
	 int ans[] = r.reverseArray(arr);

	 System.out.println("For the input array: ");
	 for (int i = 0; i < len; i++)
	 {
		 System.out.print(arr[i] + " ");

	 }
     
      System.out.println();
	  System.out.println("The reversed array is: ");
	  for (int i = 0; i < len; i++)
	  {
		  System.out.print(ans[i] + " ");
	  }

	  System.out.println("\n ");

	  //input array 2;
	  int arr1[] = {4,8,5,3,9,2};

	  len = arr1.length;
	  int ans1[] = r.reverseArray(arr1);
 
      System.out.println("For the input array: ");
	  for (int i = 0; i < len; i++)
	  {
		  System.out.print(arr1[i] + " ");
	  }
	  System.out.println();
	  System.out.println("The reversed array is: ");
	  for (int i = 0; i < len; i++)
	  {
		  System.out.print(ans1[i] + " ");
	  }
	}
}