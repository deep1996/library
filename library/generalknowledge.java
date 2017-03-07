import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class dum6 extends JFrame{
	//JLabel[] h=new JLabel[ban.h6];
	//GridLayout v;
	public dum6(){
		super ("LIBRARY");
		//v=new GridLayout(ban.h6,0);
		setLayout(new BorderLayout());
		String s="";
		for(int i=0;i<ban.h6;i++)
		{//h[i]=new JLabel(hot.l6[i]);
			//add(h[i]);
			s=s+hot.l6[i]+"\n";
			}
			JTextArea f=new JTextArea(s,5,5);
			f.setEditable(false);
			add(new JScrollPane(f), BorderLayout.CENTER);
		
			}
			}
public class generalknowledge{
	public static void run(){
		dum6 s=new dum6();
		
		s.setSize(800,400);
		s.setVisible(true);
		}
	public static void main(String[]args){
	run();
	}
	}