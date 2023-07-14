package com.kh.day15.swing.component;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Exam_JMenuBar extends JFrame {
	public Exam_JMenuBar() {
		setTitle("JButton 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		setSize(250, 220);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar bar = new JMenuBar();
		JMenu screenMenu = new JMenu("screen"); 
		
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("Project"));
		screenMenu.add(new JMenuItem("Run"));
		
		bar.add(screenMenu);
		bar.add(new JMenuItem("Edit"));
		bar.add(new JMenuItem("Source"));
		bar.add(new JMenuItem("Project"));
		bar.add(new JMenuItem("Run"));
		
		setJMenuBar(bar);
	}
	public static void main(String[] args) {
		new Exam_JMenuBar();
	}
}
