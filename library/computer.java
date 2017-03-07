import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class dum5 extends JFrame{
	//JLabel[] h=new JLabel[ban.h5];
	//GridLayout v;
	public dum5(){
		super ("LIBRARY");
		//v=new GridLayout(ban.h5,0);
		setLayout(new BorderLayout());
		String s="";
		for(int i=0;i<ban.h5;i++)
		{//h[i]=new JLabel(hot.l5[i]);
			//add(h[i]);
			s=s+hot.l5[i]+"\n";
			}
			JTextArea f=new JTextArea(s,5,5);
			f.setEditable(false);
			add(new JScrollPane(f), BorderLayout.CENTER);
		
			}
			}
public class computer{
	public static void run(){
		dum5 s=new dum5();
		
		s.setSize(800,400);
		s.setVisible(true);
		}
	public static void main(String[]args){
	run();
	}
	}