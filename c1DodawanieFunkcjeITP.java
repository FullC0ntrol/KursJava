package p3;


	public class C1 {
		public static void main(String[] args)
		{
			//DODAWANIE !!!!!!!!!!!
			int d1 = 10;
			d1 = (d1 + 3) * 15;
			d1 %= 100;
			System.out.println(d1);
			
			
			int a1 = 10;
			float b1 = (float)a1 / 3;
			
			System.out.println(b1);
			
			a1 = (a1 + 2) * 15;
			a1 %= 100;
			System.out.println(a1);
			int a1 = 10;
			boolean tocos = true;
			System.out.println("ok, działa " + a1);
			funkcja1();
			funkcja2(a1, tocos);
//			a1 = funkcja3 ();
			System.out.println("wynik " + funkcja3());
			System.out.println(a1);
			
		}
		static void funkcja1 ()
		{
			System.out.println("funkcja");
		}
		static void funkcja2 (int p1, boolean p2)
		{
			System.out.println("funkcja " + p1);
			System.out.println("funkcja " + p2);
		}
		static int funkcja3 ()
		{
			System.out.println("funkcja 3");
			System.out.println("funkcja123 ");
			return 5;
		}
	}
}
