package p3;

public class Hello


{
	public static void main (String [] args) {
		Pracownik p1 = new Pracownik();
		try {	
			p1.setPesel(-1);
			System.out.println ("Przeszlo bez wyjatku");
		} catch (NowyWyjatek e)
		{
			System.out.print ("Zlapano wyjatek pesel: ");
			System.out.println (e.getMessage());
		}


    }
} //class


class Pracownik
{
	 public static int ilePracownikow = 0;
	 int pesel = 0;
	 public Pracownik(){
		 ilePracownikow++;
	 }
	 public void setPesel (int pesel) throws NowyWyjatek{
		 if (pesel < 0) 
			 throw new NowyWyjatek("zly pesel");
		 this.pesel = pesel;
	 }

	 
}

class NowyWyjatek extends Exception 
{
		NowyWyjatek() 
		{
 		}
		NowyWyjatek(String s) 
		{ 
			super("Tekst z naszego wyjštku " + s); 
		}
}


