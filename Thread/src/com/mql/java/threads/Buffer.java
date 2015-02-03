package com.mql.java.threads;

public class Buffer {
	synchronized void read() {
		System.out.println(">> Début Lecture par : "
				+ Thread.currentThread().getName());
		pause(5000);
		System.out.println(">> Fin Lecture par : "
				+ Thread.currentThread().getName());
	}

	synchronized void write() {
		System.out.println(">> Début Ecritue par : "
				+ Thread.currentThread().getName());
		pause(5000);
		System.out.println(">> Fin Ecritue par : "
				+ Thread.currentThread().getName());
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
