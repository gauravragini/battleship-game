package Battleship;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.EventListener;
import java.util.Random;


public class MyShips extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
    JPanel p;
   Container c;
   int k=0;
   String name;
   JButton[] btn1=new JButton[100];
   JButton done;
   JLabel l1,bg,l2;
   int[] myship=new int[8];
	ImageIcon s=new ImageIcon("s.jpg");
	ImageIcon ship=new ImageIcon("myship.jpg");
   Font f1=new Font("Cooper Black",Font.BOLD,20);	
   
   MyShips(String name)
   {
	   this.name=name;
	   
	    c=this.getContentPane();
		c.setLayout(null);
		
		p=new JPanel();
		p.setBounds(50,35,300,300);
		p.setOpaque(false);
		GridLayout g1=new GridLayout(10,10);
		p.setLayout(g1);
		
		c.add(p);
		
		l1=new JLabel("PLACE YOUR SHIPS ");
		l1.setBounds(60,5,250,20);
		l1.setForeground(Color.GREEN);
		l1.setFont(f1);
		c.add(l1);
	
		
	   done=new JButton("DONE");
   	  done.setBounds(300,350,80,30);
   	  done.addActionListener(new ActionListener(){public void actionPerformed
										(ActionEvent e){done_btn_action(e);}});
   	  done.setEnabled(false);
   	  c.add(done);

		for(int i=0;i<100;i++)
		{
			btn1[i]=new JButton();
			btn1[i].addActionListener(this);
			
			btn1[i].setOpaque(false);
			btn1[i].setContentAreaFilled(false);
			btn1[i].setBorderPainted(true);
			p.add(btn1[i]);
		}
		
		
		bg=new JLabel(s);
		bg.setBounds(0,0,500,500);
		c.add(bg);
   }//end of contructor
   
public void actionPerformed(ActionEvent e)
  {
	if(k!=8){
	for(int i=0;i<100;i++){
	   if(e.getSource()==btn1[i])
		{
		   btn1[i].setOpaque(true);
	      btn1[i].setIcon(ship);
	      btn1[i].setDisabledIcon(ship);
	      btn1[i].setEnabled(false);
	      myship[k]=i;
	      k++;
		}}
	      if(k==8)
	    	    done.setEnabled(true);
		}
		
  }//end of action event

 public void done_btn_action(ActionEvent e)
 {
	 this.setVisible(false);
	 Frame2 f2=new Frame2(name,myship);
		 f2.setTitle("BATTLESHIP");
		 f2.setVisible(true);
   	 f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 f2.setBounds(150,50,1000,570);
 	 ImageIcon icon=new ImageIcon("icon.jpg");
   	 f2.setIconImage(icon.getImage());
 }

}//end of class myships
