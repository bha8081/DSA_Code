import java.util.ArrayList;
import java.util.Collections;

public class String_ArrayDemo
{
	public static void main(String[] args)
	{
		ArrayList<String> stri = new ArrayList<> ();

		stri.add("Bhavesh");
		stri.add("Shubham");
		stri.add("Nitesh");
		stri.add("Prince");
		stri.add("Ankush");

		System.out.println("Orignla String Value: " +stri);
		
		// Srot 
         Collections.sort(stri);
		 System.out.println("\nSort List: " +stri);

		 // Descending order;
		 Collections.sort(stri, Collections.reverseOrder());
		 System.out.println("\nDescendin Order List: " +stri);
	}
}