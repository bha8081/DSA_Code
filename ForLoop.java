// Loops 
// 1. for loop.
// 2. for each loop.

public class ForLoop
{
	public void loop()
	{
	  int [] age = new int[3];

	  age[0]=33;
	  age[1]=11;
	  age[2]=23;


//		for (int i = 0; i < 3; i++)
//		{
//			System.out.println(age[i]);
//		}


// Create the Foor Each loop.
       for (int bhav : age)
       {
		   System.out.println(bhav);
       }

// Create the while loop.
      int i = 0;
	  while (i < 3)
	  {
		  System.out.println(age[i]);
		  i++;
	  }
	}
}