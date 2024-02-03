// Count The Number Digits By Taking User Input.

public class Count_User_Input
{
	public static int user(int n)
	{
		if (n == 0)
		{
			return n;
		}

		return 1 + user(n / 10);
	}
}