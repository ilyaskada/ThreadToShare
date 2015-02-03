package com.mql.java.threads;

import java.lang.reflect.Method;

public class Test01 {
	public void exp01() {
		// Thread p1 = new Thread();
		// p1.start();// démarrer le procesus
		Processus p01 = new Processus("P01");
		Processus p02 = new Processus("P02");
		p01.start();
		p02.start();
		do {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		} while (true);

	}

	public void exp02() {
		Buffer buffer = new Buffer();
		Reader r1 = new Reader("R01", buffer);
		Reader r2 = new Reader("R02", buffer);
		Writer w1 = new Writer("W01", buffer);
		r1.start();
		r2.start();
		w1.start();
	}

	public Test01() {
		exp02();
	}

	public static void main(String[] args) {
		new Test01();
	}

}
