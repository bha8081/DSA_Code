import java.util.Scanner;
public class Count_User_InputExce
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number: ");
		int n = sc.nextInt();

		int a = Count_User_Input.user(n);
		//Count_User_Input.user(n);
		System.out.println("It is the Number Digit: " +a);
		
	}
}