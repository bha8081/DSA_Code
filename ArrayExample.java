public class ArrayExample
{
    public void demoArray() // Public is the Opt you can be use or not . in the java JVM always provide the Default . 
	{
	   //Create the Array.
	   int[] ages = new int[8]; // ages[0], ages[1] ------------ages[8].
	   float[] weights = new float[15];
	   // String[] names = new String[10];
	   String[] names = {"Shubham Yadav", "Bhavesh Yadav"};

      // Provide the Array Values.
	  ages[5]=45;
	  ages[2]=23;
	  ages[4]=46;
//	  ages[9]=45;  // Index out of the bound for length 9.
   
      // Provide the float Value.
	  weights[5]=67.8f;
	  weights[14]=23.0f;
	  weights[2]=99.9f;

	  // Provide String value.
	  // names[9]= "Bhavesh";

	  // Print the ages.
	  System.out.println(ages[5]);
	  System.out.println(ages[2]);
	  System.out.println(ages[4]); 
//	  System.out.println(ages[9]);

      System.out.println(weights[5]);
	  System.out.println(weights[14]);
	  System.out.println(weights[2]);

	  System.out.println(names[0]);
	  System.out.println(names[1]);
	}
}