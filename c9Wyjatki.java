package p3;

public class CC


{
	
	String argument1;
	String argument2;

    public static void main (String [] args) {
		System.out.println ("Start");
		Pracownik p1 = new Pracownik();
		try {	
			p1.setPesel(1);
			System.out.println ("Przeszlo bez wyjatku");
		} catch (Exception e)
		{
			System.out.println ("zlapano wyjatek pesel");
		}
		
		
		p1 = null;
		//Pracownik.ilePracownikow ++;
		System.out.println ("Ile pracownikow:" 
				+ Pracownik.policzPracownikow());
		KlientFaktyczny k1 = new KlientFaktyczny ();
    }
} //class
abstract class Klient extends Osoba
{
	abstract void metoda();// tu nic nie robię
}

class KlientFaktyczny extends Klient
{
	void metoda() // tu robię coś konkretnego więc mogę utworzyć obiekt
	{
		
	};
}



class Pracownik extends Osoba
{
	 public static int ilePracownikow = 0;
	 int pesel = 0;
	 public Pracownik(){
		 ilePracownikow++;
	 }
	 public void setPesel (int pesel) throws Exception{
		 if (pesel < 0) throw new Exception("zly pesel");
		 this.pesel = pesel;
	 }
	 public static int policzPracownikow(){
		 return ilePracownikow;
	 }
}

class Osoba {
	String imie;	String nazwisko;	int punkty;
	int identyfikuj (){return 0;}
	void powiedz (String co){System.out.println ("Mowie: " + co);}
	public Osoba ()
	{
		imie = "";
		nazwisko = "";
		punkty = 0;
	}
}