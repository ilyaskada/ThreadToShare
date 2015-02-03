package com.mql.java.threads2;

public class Processus implements Runnable {
	private Thread runner;

	public Processus(String name) {
		runner = new Thread(this,name);
	}

	public void start(){
		runner.start();
	}
	public void run() {
		do {
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
