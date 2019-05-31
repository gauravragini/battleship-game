package Battleship;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


class Frame1 extends JFrame implements ActionListener
{
	
	
	private static final long serialVersionUID = 1L;
	Container c;
	JButton start,help,back;
	JLabel l1;
	JTextField t1;
	Font f2=new Font("Cooper Black",Font.PLAIN,20);	
	Frame1()
	{
		Container c=this.getContentPane();
		c.setLayout(null);
		
	 		

		t1=new JTextField();
		t1.setBounds(375,365, 250,35);
		t1.setFont(f2);
		c.add(t1);

		start=new JButton("START GAME");
		start.setBounds(40,440,150,50);
		start.addActionListener(this);
		c.add(start);
		
		help=new JButton("HELP");
		help.setBounds(230,440,150,50);
		help.addActionListener(this);
		c.add(help);
			
		back=new JButton("CLOSE");
		back.setBounds(420,440,150,50);
		back.addActionListener(this);
		c.add(back);
		
		  ImageIcon img1=new ImageIcon("background.jpg");
			l1=new JLabel(img1);
			l1.setBounds(0,0, 1000, 562);
			c.add(l1);



		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==start)
		{
			
		this.setVisible(false);	 
		 MyShips s=new MyShips(t1.getText());
		 s.setTitle(" SHIPS");
		 s.setVisible(true);
		 s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 s.setBounds(150,50,420,450);
	 	 ImageIcon icon=new ImageIcon("icon.jpg");
		s.setIconImage(icon.getImage());
		 
		 
		 
	     }
		
		if(e.getSource()==help)
		{
			this.setVisible(false);
			 Help h =new Help();
 			 h.setTitle("BATTLESHIP");
 			 h.setVisible(true);
		   	 h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 h.setBounds(150,50,1000,562);
		 	 ImageIcon icon=new ImageIcon("icon.jpg");
		   	 h.setIconImage(icon.getImage());
		}
	
		if(e.getSource()==back)
		{
	        System.exit(0);

		}
	
		
	}
}


