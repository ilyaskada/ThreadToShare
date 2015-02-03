package com.mql.java.threads;

public class Reader extends Thread {
	private Buffer buffer;

	public Reader(String name, Buffer buffer) {
		super(name);
		this.buffer = buffer;
	}

	public void run() {
		do {
			buffer.read();
		} while (true);
	}
}
