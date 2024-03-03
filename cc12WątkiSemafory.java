package p3;

import java.util.concurrent.*;

class Watek extends Thread {
	Semaphore sem;
	int identyfikator;

	public Watek(Semaphore sem, int id) {
		this.identyfikator = id;
		this.sem = sem;
	}

	public void run() {
		try {
			System.out.println("ID " + identyfikator + " czeka.");
			sem.acquire();

			System.out.println("ID " + identyfikator + " moze dzialac i dziala.");
			Thread.sleep(3000);

		} catch (InterruptedException e) {}
		System.out.println("ID " + identyfikator + " konczy.");
		sem.release();
	}
}

public class Hello {
	public static void main(String args[]) throws InterruptedException {

		Semaphore sem = new Semaphore(1);
		Watek w1 = new Watek(sem, 1);
		Watek w2 = new Watek(sem, 2);
		Watek w3 = new Watek(sem, 3);
		Watek w4 = new Watek(sem, 4);

		w1.start();
		w2.start();
		w3.start();
		w4.start();

		// oczekiwanie na koniec wštku
		w1.join();
		w2.join();
		w3.join();
		w4.join();

		System.out.println("Koniec.");
	}
}