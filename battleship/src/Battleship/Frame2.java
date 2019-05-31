package Battleship;
import java.util.*;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;


class Frame2 extends JFrame implements ActionListener 
{
	private static final long serialVersionUID = 1L;
	String player_name;
	int f=0;
	public int i=0,j=1,k=0,l=1;
	Container c;
	JButton[] btn1=new JButton[100];
	JLabel[] btn2=new JLabel[100];
	JPanel p1,p2;
	JLabel l1,l2,l3,name1,name2,l4,l5,l6,l7;
	JButton endgame;
	
	ImageIcon blast=new ImageIcon("blast.gif");
	Image scaleImage = blast.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
	ImageIcon img=new ImageIcon("ship.jpg");
	ImageIcon s=new ImageIcon("myship.jpg");
	
	Font f1=new Font("Castellar",Font.BOLD,20);	
	Font f2=new Font("Cooper Black",Font.PLAIN,17);	
	Font f3=new Font("Cooper Black",Font.PLAIN,15);
	
	Border b;
	int[] ship=new int[8];
	int[] myship=new int[8];
	int[] check={100,100,100,100,100,100,100,100};
	  Random r=new Random();

	  
	Frame2(String n,int m[])
	{
		this.player_name=n;
		for(int x=0;x<8;x++)
		myship[x]=m[x];
	
		c=this.getContentPane();
		c.setLayout(null);


		
		p1=new JPanel();
		p1.setBounds(90,200,300,300);
		p1.setOpaque(false);
		GridLayout g1=new GridLayout(10,10);
		p1.setLayout(g1);
		c.add(p1);
		
	
		
		name1=new JLabel("YOUR FLEET" );
		name1.setBounds(600,70,700,100);
		name1.setFont(f1);
		c.add(name1);
		
		name2=new JLabel("ENEMY FLEET" );
		name2.setBounds(80,70,700,100);
		name2.setFont(f1);
		c.add(name2);
		

		l7=new JLabel("No. of hits: ");
		l7.setBounds(650,130,200,100);
		l7.setFont(f2);
		c.add(l7);
		
		
		l1=new JLabel("No. of attempts: ");
		l1.setBounds(650,100,200,100);
		l1.setFont(f2);
		c.add(l1);

		l3=new JLabel("No. of attempts: ");
		l3.setBounds(100,100,200,100);
		l3.setFont(f2);
		c.add(l3);

		l2=new JLabel("No. of hits: ");
		l2.setBounds(650,130,200,100);
		l2.setFont(f2);
		c.add(l2);
		
		
		l5=new JLabel("No. of hits: ");
		l5.setBounds(100,130,200,100);
		l5.setFont(f2);
		c.add(l5);
		
		
		p2=new JPanel();
		p2.setBounds(600,200,300,300);
		p2.setOpaque(false);
		//GridLayout g1=new GridLayout(10,10);
		p2.setLayout(g1);
		
		
		endgame=new JButton("END GAME");
		endgame.setBounds(430,470,150,30);
		endgame.setFont(f3);
		endgame.setOpaque(false);
		endgame.setContentAreaFilled(false);
		endgame.setBorderPainted(false);
		endgame.setForeground(Color.RED);
		endgame.addActionListener(new ActionListener(){public void actionPerformed
											(ActionEvent e){endgame_btn_action(e);}});
		c.add(endgame);
		
		
		
		for(int i=0;i<100;i++)
		{
			btn1[i]=new JButton();
			btn1[i].addActionListener(new ActionListener(){public void actionPerformed
														(ActionEvent e){btn1_action(e);}});
			btn1[i].setOpaque(false);
			btn1[i].setContentAreaFilled(false);
			btn1[i].setBorderPainted(true);
			p1.add(btn1[i]);
			
			
			btn2[i]=new JLabel();
			b=BorderFactory.createLineBorder(Color.GRAY,1);
			btn2[i].setBorder(b);
			
			p2.add(btn2[i]);
		} 
		for(int k=0;k<8;k++)
		{	btn2[m[k]].setOpaque(true);
	         btn2[m[k]].setIcon(s);	} //my ships
		
			   

		
	   for(int k=0;k<8;k++)
	       {
		     ship[k]=r.nextInt(99); 
		     for(int i=0;i<k;i++)
		    	{if(ship[k]==ship[i])
		    		  ship[k]=r.nextInt(99);} 		   
		     }//enmey ships
	   c.add(p2);
	   
	   ImageIcon title=new ImageIcon("ocean.jpg");
		l4=new JLabel(title);
		l4.setBounds(0,0, 1000, 570);
		c.add(l4);
		
		
	}//constructor end
	
  
	
	 void  btn1_action(ActionEvent e)
	{       i++;
			l1.setText("No. of attempts: "+i);
			
		
			for(int i=0;i<8;i++)
			 {	
				 if(e.getSource()==btn1[ship[i]])
			 	      { btn1[ship[i]].setIcon(img);
			 	     btn1[ship[i]].setDisabledIcon(img);
			 			btn1[ship[i]].setEnabled(false);
			 			
			 		    l2.setText("No. of hits: "+j);
			 			j++;}
			 	if(j==9)
			 	   { 
			 		 this.setVisible(false);
		 			 Frame3 f3=new Frame3(player_name,i,j,l);
		 			 f3.setTitle("BATTLESHIP");
		 			 f3.setVisible(true);
				   	 f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 f3.setBounds(150,50,550,550);
				 	 ImageIcon icon=new ImageIcon("icon.jpg");
				   	 f3.setIconImage(icon.getImage());
			 	   }
			 	
			 }
		/*	try
			{
				Thread.sleep(500);
			}catch(InterruptedException a)
			{
				Thread.currentThread().interrupt();
			}*/
			
			int d=r.nextInt(99);
			for(int q1 = 0;q1<8;q1++)
			{
				if(d== check[q1])
					d= r.nextInt();
			}
			k++;
			System.out.println(d);
			l3.setText("No. of attempts:"+k);
			
			boolean temp =false;
			for(int m=0;m<8;m++)
			{
			if(btn2[d]==btn2[myship[m]])
			{
			l5.setText("No. of hits: "+l);l++;
			btn2[myship[m]].setOpaque(true);	
			btn2[myship[m]].setIcon(img);
			temp = true;
			check[f]=d;f++;
			}
			
			else if(m==7 && temp!=true)
				{ 
				btn2[d].setOpaque(true);
				btn2[d].setBackground(Color.BLUE); 
				
				btn2[d].setOpaque(false);
				}
			
			if(l==9)
		 	   { 
		 		 this.setVisible(false);
	 			 Frame3 f3=new Frame3(player_name,i,j,l);
	 			 f3.setTitle("BATTLESHIP");
	 			 f3.setVisible(true);
			   	 f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 f3.setBounds(150,50,550,550);
			 	 ImageIcon icon=new ImageIcon("icon.jpg");
			   	 f3.setIconImage(icon.getImage());
		 	   }
			}
		
		
	   }//end of btn1 action event
	
	      void	endgame_btn_action(ActionEvent e)
			{
				this.setVisible(false);
				Frame3 f3=new Frame3(player_name,i,j,l);
 				f3.setTitle("BATTLESHIP");
 				f3.setVisible(true);
				f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f3.setBounds(150,50,550,550);
				ImageIcon icon=new ImageIcon("icon.jpg");
				f3.setIconImage(icon.getImage());	
			}//end of endbtn action event


		public void actionPerformed(ActionEvent e)	{}
		
	
}//end of Frame2 class