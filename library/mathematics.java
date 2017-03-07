import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class dum1 extends JFrame{
	//JLabel[] h=new JLabel[ban.h1];
	//GridLayout v;

	public dum1(){
		super ("LIBRARY");
		//v=new GridLayout(ban.h1,0);
		setLayout(new BorderLayout());
		String s="";
		for(int i=0;i<ban.h1;i++)
		{//h[i]=new JLabel(hot.l1[i]);
			//add(h[i]);
			s=s+hot.l1[i]+"\n";
			}
			JTextArea f=new JTextArea(s,5,5);
			f.setEditable(false);
			add(new JScrollPane(f), BorderLayout.CENTER);
		
			}
			}
public class mathematics{
	public static void run(){
		dum1 s=new dum1();
		
		s.setSize(800,400);
		s.setVisible(true);
		}
	public static void main(String[]args){
	run();
	}
	}