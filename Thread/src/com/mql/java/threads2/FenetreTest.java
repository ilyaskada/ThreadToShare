package com.mql.java.threads2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FenetreTest extends JFrame implements ActionListener {
	private JPanel screen;

	public FenetreTest() {
		exp01();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		setVisible(true);
		

	}

	public void actionPerformed(ActionEvent e) {
		Pingouin p=new Pingouin("");
		screen.add(p);
		p.start();

	}

	public void exp01() {
		screen = new JPanel();
		screen.setLayout(null);
		screen.setBackground(Color.black);
		// Pingouin p1=new Pingouin("Paing01");
		// screen.add(p1);
		getContentPane().add("Center", screen);

		JButton b1=new JButton("Nou Pai");
		getContentPane().add("South", b1);
		b1.addActionListener(this);
		
		// p1.start();
	}

	public static void main(String[] args) {
		new FenetreTest();

	}
}
