package Battleship;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

 public class Play 
 {
	 public static void main(String[] args)
	 {
		 Frame1 g=new Frame1();
		
		 g.setTitle("GAME");
		 g.setVisible(true);
		 g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 g.setResizable(false);
		 g.setBounds(150,50,1000,570);
		 ImageIcon icon=new ImageIcon("icon.jpg");
	   	 g.setIconImage(icon.getImage());
		 
		
		 
	 }
 }
