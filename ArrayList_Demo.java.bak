// Array list.
import java.util.ArrayList;

public class ArrayList_Demo
{
	public static void main(String[] agrs)
	{
		ArrayList<Integer>l1 = new ArrayList<> ();

		ArrayList<String>b1 = new ArrayList<> ();
		
		// Add Integer Element.
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		l1.add(9);

		// Add Boolean Elements.
		b1.add("Bhavesh");
		b1.add("Shubham");
		b1.add("Nitesh");
		b1.add("Prince");

		// Get an element at index i.
		System.out.println(l1.get(2));

		// print with for loop.
		for (int i = 0; i < l1.size(); i++)
		{
			System.out.println(l1.get(i));
		}  

		//printing the array list directly.
		System.out.println(l1);

		// Bollean Elements Calling.
		System.out.println(b1);
		

		//Adding some element at index i.
		l1.add(2, 200);
		System.out.println(l1); // error.

		// modifying element at index i.
		l1.set(0,10); // 0 is the insert index number.
		System.out.println(l1); 

		// removing an element at index.
		l1.remove(3);
		System.out.println(l1);

		// removing an element e (e mean's jb hame pata nahi hota hai koon se index ki value ko remove karana hai.)
		l1.remove(Integer.valueOf(4));
		System.out.println(l1);

		// Cheking if an element exists.
		boolean ans = l1.contains(Integer.valueOf(200)); // When 200 is not present it gives the false.
		System.out.println(ans);

		// if you add don't specify class, you can put anything inside l.
/*		ArrayList l = new ArrayList();
		l.add("Bhaveh Yadav");
        l.add(90); 
		l.add(true);
		System.out.println(l); */


	}
}