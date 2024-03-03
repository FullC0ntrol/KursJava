package p3;

public class c4MiniProjekt {
	public static void main(String[] args)
	{
		/*
		 * a = 1 -> użycie pętli for ( liczby większe od 10 zostaną pominięte )
		 * a = 2 -> użycie pętli while
		 * a = 3 -> użycie pętli do .. while
		 * a > 3 -> wyświetla bład za pomocą funkcji 
		 * j -> liczba od której ma zacząc wypisywać liczby mniejsze
		 */
		int a = 1;
		int j = 121;
		switch(a)
		{
		case 1:
			for (int i = j; i > 0; i--) {
				if (i > 10) continue;
				System.out.println("j = " + i);
			}
			break;
		case 2:
			while(j > 0)
			{
				System.out.println("j = " + j--);
			}
			break;
		case 3:
			do
			{
				System.out.println("j = " + j--);
			}while(j > 0);
			break;
		case 4:
			
		default:
			function(a);
		
		}
		
	}
	static void function(int a)
	{
		System.out.println("zmienna a = " + a + " nie miesci sie w zakresie 1-3.");
		if (a > 100)
		{
			System.out.println("Liczba a jest większa od 100.");
		}
		else
		{
			System.out.println("Liczba jest mniejsza od 100 ale większa od 3.");
		}
		
	}
}
