package Battleship;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class Help extends JFrame implements ActionListener
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container c;
	JLabel l1;
	JButton btn;
	Font f=new Font("Cooper Black",Font.PLAIN,20);	
	 ImageIcon bg=new ImageIcon("help.jpg");
	Help()
	{
		c=this.getContentPane();
		c.setLayout(null);
		
		
		btn=new JButton("BACK");
		btn.setBounds(500,400,100,50);
		btn.setFont(f);
		btn.setForeground(Color.WHITE);
        btn.setBackground(Color.DARK_GRAY);
        btn.addActionListener(this);
        c.add(btn);

		l1=new JLabel(bg);
		l1.setBounds(0,0,1000,570);
		c.add(l1);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn)
		{
			this.setVisible(false);
		    Frame1 f4=new Frame1();
			 f4.setTitle("BATTLESHIP");
			 f4.setVisible(true);
			 
			 f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 f4.setBounds(150,50,1000,570);
			 ImageIcon icon=new ImageIcon("C:/Users/hp/workspace/test/src/Play/icon.jpg");
			 f4.setIconImage(icon.getImage());
		}
	}
	
	
	
	
	
}//end of class highscores