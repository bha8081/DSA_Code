// eremoving an element e.
import java.util.ArrayList;

public class ArrayRemoving_List
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l1 = new ArrayList<> ();

		// Add the Array List elements.
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);

		//ArrayList calling.
		System.out.println(l1);

		//removing e element.
		l1.remove(Integer.valueOf(2));
		System.out.println(l1);

		// other mathed remove element.
		System.out.println(l1.remove(Integer.valueOf(6))); // when the element is the avilable is return true.

        System.out.println(l1.remove(Integer.valueOf(12))); // When the element is not present in the given element it's give false.
	          
	    // Cheking if an element exists.
		boolean ans = l1.contains(Integer.valueOf(5));  // when the element is the avilable is return true
		System.out.println(ans);

		boolean an = l1.contains(Integer.valueOf(15));  // When the element is not present in the given element it's give false.
		System.out.println(an);
	
	}
}