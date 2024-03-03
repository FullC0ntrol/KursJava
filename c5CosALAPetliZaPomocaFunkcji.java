package p3;

public class c5CosALAPetliZaPomocaFunkcji {
	public static void main(String[] args)
	{
		funkcja(5);
	}
	static void funkcja(int a)
	{
		System.out.println("Wywołanie, wartość: " + a);
		a--;
		if(a > 0) {
			funkcja(a);
//			funkcja(a);
		}
		System.out.println("Wyjście z funkcji, wartość :" + a);
	}
}
