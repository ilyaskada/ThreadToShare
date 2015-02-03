package com.mql.java.threads;

public class Processus extends Thread {
	public Processus(String name) {
		super(name);
	}

	public void run() {
		do {
			System.out.print(getName() + " - ");
			System.out.println(Thread.currentThread().getName());
			pause(1000);
		} while (true);
	}

	public void pause(long time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			System.out
					.println("l'Erreur dans Processus pause" + e.getMessage());
		}
	}
}
