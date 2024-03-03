package p3;

public class C1{
	public static void main(String[] args)
	{
		C5 c = new C5();
		c.mi1();
		c.mi2();
	}
}
interface I1{
	void mi1();
	void mi2();
}
class C5 implements I1
{
	public void mi1() {
		System.out.println("C3.m1");
	}
	public void mi2() {
		System.out.println("C3.m2");
	}
}

