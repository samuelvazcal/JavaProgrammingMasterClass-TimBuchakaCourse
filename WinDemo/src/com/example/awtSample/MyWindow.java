package com.example.awtSample;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyWindow extends Frame {

	public MyWindow(String title){
		super(title);
		setSize(700,120);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font sansSerifLarge = new Font("SansSerifLarge", Font.BOLD, 18);
		Font sansSerifSmall = new Font("SansSerifLarge", Font.BOLD, 12);
		g.setFont(sansSerifLarge);
		g.drawString("Learning the Complete Java Developer Course by Tim Buchalka",60,60);
		g.setFont(sansSerifSmall);
		g.drawString("by Samuel Vazquez",60,100);
	}
}
