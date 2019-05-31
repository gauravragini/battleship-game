package Battleship;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;



class Frame3 extends JFrame implements ActionListener 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container c;
	JButton startagain;
    JLabel background,title;
	JLabel l1,l2,l3,l4;
	ImageIcon img1=new ImageIcon("win.gif");
	Font f2=new Font("Cooper Black",Font.PLAIN,50);
	Font f3=new Font("Cooper Black",Font.PLAIN,30);
	Font f1=new Font("Castellar",Font.BOLD,20);	
	
	Frame3(String n,int i,int j,int l)
	{
		c=this.getContentPane();
		c.setLayout(null);
	
		
		l3=new JLabel(""+n);
		l3.setBounds(200,80,200,100);
		l3.setForeground(Color.PINK);
        l3.setFont(f3);
		c.add(l3);
     
	
		l1=new JLabel("NO. OF ATTEMPTS: "+i);
		l1.setBounds(170,150,300,100);
		l1.setForeground(Color.WHITE);
        l1.setFont(f1);
		c.add(l1);
		
		l2=new JLabel(" NUMBER OF HITS :"+(j-1));
		l2.setBounds(170,200,300,100);
		l2.setForeground(Color.WHITE);
        l2.setFont(f1);
		 c.add(l2);
		
		
		l4=new JLabel();
		l4.setBounds(180,15,300,100);
        l4.setForeground(Color.CYAN);
        l4.setFont(f2);
		c.add(l4);
		 if(j==9||j>l)
		    l4.setText("YOU WIN");
		 else if(j==l)
			 l4.setText("DRAW");
		 else
			 l4.setText("YOU LOSE");
		
	    startagain=new JButton("START AGAIN");
	    startagain.setBounds(350,400,150,50);
	    startagain.setOpaque(false);
		startagain.setContentAreaFilled(false);
		startagain.setBorderPainted(false);
		startagain.setForeground(Color.RED);
    	startagain.addActionListener(this);
	    c.add(startagain);
	    

		background=new JLabel(img1);
	    background.setBounds(0,0,640,640);
		c.add(background);
     
	}
	public void  actionPerformed(ActionEvent e)
	{
	if(e.getSource()==startagain)
	{
		this.setVisible(false);
	    Frame1 f4=new Frame1();
		 f4.setTitle("BATTLESHIP");
		 f4.setVisible(true);
		 
		 f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 f4.setBounds(150,50,1000,570);
		 ImageIcon icon=new ImageIcon("icon.jpg");
		 f4.setIconImage(icon.getImage());
	
	}
	}
	
}
