package com.mql.java.threads2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Pingouin extends JPanel implements Runnable {
	private Thread runner;
	private int x = 40, y = 50;
	private String path = "resources/seq/";
	private String ex = ".gif";
	private String[] source = { "stop", "left1", "left2", "left3", "right1",
			"right2", "right3" };
	private Image file[];
	private int width = 30, height = 30;
	private int current = 0, step = 3;
	private static int counter = 0;

	public Pingouin(String name) {
		runner = new Thread(this, name);
		y = counter * height;
		counter++;
		setLocation(x, y);
		setSize(width, height);
		loadImages();

	}

	private void loadImages() {
		file = new Image[source.length];
		for (int i = 0; i < source.length; i++) {
			ImageIcon icon = new ImageIcon(path + source[i] + ex);
			file[i] = icon.getImage();
		}
	}

	public void start() {
		runner.start();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawImage(file[current], 0, 0, this);
		// g.setColor(Color.white);
		// g.fillRect(0, 0, 300, 300);
		// g.setColor(Color.red);
		// g.drawLine(0, 0, 100, 100);
	}

	public void run() {
		do {
			double dec = Math.random() * 100;
			if (dec < 40)
				goRight(4);
			else if (dec < 80)
				goLeft(4);
			else
				stop();

		} while (true);
	}

	private void goRight(int n) {
		for (int j = 0; j < n; j++) {
			for (int i = 4; i <= 6; i++) {
				x = x + step;
				current = i;
				setLocation(x, y);
				pause(100);
			}
		}
	}

	private void goLeft(int n) {
		for (int j = 1; j < n; j++) {
			for (int i = 1; i <= 3; i++) {
				x = x - step;
				current = i;
				setLocation(x, y);
				pause(100);
			}
		}
	}

	private void stop() {
		current = 0;
		repaint();
		pause(3000);
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