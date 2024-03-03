package p3;

public class Hello


{
	
    public static void main (String [] args) {
		System.out.println ("Start");

		Watek w = new Watek(1);
		w.start(); 
		new Watek(2).start();		
	 }
} //class


class Watek extends Thread {
	int identyfikator;
	public Watek(){}
	public Watek(int id){identyfikator = id;}
	public void run () {
		setPriority (Thread.MIN_PRIORITY);
		while (true) {			
			try {
				sleep (500);
				System.out.println ("Z watku:"+identyfikator);
				}
			catch (InterruptedException e) {
			}
		}//while		
	}//run
}//class


