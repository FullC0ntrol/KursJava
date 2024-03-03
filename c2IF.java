package p3;

public static void main(String[] args)
{
	boolean def = false;
	int a = 99;
	int b = (a % 10) + 4;
	def = funkcja(a, b);
	if (def)
	{
		System.out.println("OK");
	}
	else
	{
		System.out.println("Not ok");
	}
}
static boolean funkcja(int a, int b)
{
	if (a > b)
	{
		System.out.println("JD");
		return true;
	}
	else
	{
		return false;
	}
}