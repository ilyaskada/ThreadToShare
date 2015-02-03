package com.mql.java.threads;

public class Writer extends Thread {
	private Buffer buffer;

	public Writer(String name, Buffer buffer) {
		super(name);
		this.buffer = buffer;
	}

	public void run() {
		do {
			buffer.write();
		} while (true);
	}
}