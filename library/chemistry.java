import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class dum2 extends JFrame{
	//JLabel[] h=new JLabel[ban.h2];
	//GridLayout v;
	public dum2(){
		super ("LIBRARY");
		//v=new GridLayout(ban.h2,0);
		setLayout(new BorderLayout());
		String s="";
		for(int i=0;i<ban.h2;i++)
		{//h[i]=new JLabel(hot.l2[i]);
			//add(h[i]);
			s=s+hot.l2[i]+"\n";
			}
			JTextArea f=new JTextArea(s,5,5);
			f.setEditable(false);
			add(new JScrollPane(f), BorderLayout.CENTER);
		
			}
			}
public class chemistry{
	public static void run(){
		dum2 s=new dum2();
		
		s.setSize(800,400);
		s.setVisible(true);
		}
	public static void main(String[]args){
	run();
	}
	}