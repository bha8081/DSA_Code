// Given @ integers a and b. Swap thw 2 given values using temporary variables.
 
 public class Swape
 {
   public static void swap(int a, int b)
	 {
		System.out.println("Original values before swap");
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);


		a = b;
		b = a;

		System.out.println("Values after swap: ");
        System.out.println("a: "+a);
		System.out.println("b: "+b);


  }
 }