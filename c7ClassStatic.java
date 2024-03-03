package p3;

public class C1{
	public static void main(String[] args)
	{
		C1 c = new C1();
		c.attr = 9;
		c.metoda1();
		c.attr = 9;
		attr2 = 10;
		metoda2();
	}
	int attr = 0;
	public void metoda1()
	{
		attr2 = 11;
		System.out.println("dziala " + attr + " " + attr2);
		metoda2();
	}
	static int attr2 = 0;
	public static void metoda2()
	{
		
		System.out.println("dziala2x  " + attr2);
	}
}