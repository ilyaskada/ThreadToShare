package com.mql.java.threads2;

public class Test02 {
	public void exp01() {
		Processus p1 = new Processus("P01");
		Processus p2 = new Processus("P02");
		p1.start();
		p2.start();
	}

	public Test02() {
		exp01();
	}
	public void exp02(){
		
	}

	public static void main(String[] args) {
		new Test02();
	}
}
