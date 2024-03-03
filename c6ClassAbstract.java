package p3;

public class C1{
	public static void main(String[] args)
	{
		C3 c = new C3();
		c.m1();
		c.wiek = 20;
		System.out.println(c.wiek);
	}
}
abstract class C2
{
	int wiek;
	abstract void m1();
}

class C3 extends C2
{
	void m1() {
		System.out.println("C3.m1");
	}
}
