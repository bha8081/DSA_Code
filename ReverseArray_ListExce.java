import java.util.ArrayList;
import java.util.Collections;

public class ReverseArray_ListExce
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<> ();
		a.add(23);
		a.add(24);
		a.add(25);
		a.add(26);
		a.add(27);
		a.add(28);

		System.out.println("Original Array List: " +a);

		//ReverseArray_List.reverse(a);
		Collections.reverse(a);
		System.out.println("\nReverse Array List: " +a);

		//Ascenidng Order Short Array List.
		Collections.reverse(a);
		System.out.println("\nShort Assending Array List: " +a);
        

		// Desending Order Short Array List.
		Collections.sort(a, Collections.reverseOrder());
		System.out.println("\nDesceding Order Array List: " +(a));
	}
}