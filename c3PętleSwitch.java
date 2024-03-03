package p3;

public class c3PętleSwitch {
	public static void main(String[] args)
	{
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("I = " + i + " ,  J = " + j);
			}
			System.out.println("===================");
		}
		
		int j = 10;
		while(j > 0)
		{
			System.out.println("j = " + j--);
		}
		
		j = 1;
		switch(j)
		{
		case 1:
			System.out.println("j = " + j);
		case 2:
			System.out.println("j = " + j);
		default:
			System.out.println("j = " + j);
		
		}
}
