import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class dum4 extends JFrame{
	//JLabel[] h=new JLabel[ban.h4];
	//GridLayout v;
	public dum4(){
		super ("LIBRARY");
		//v=new GridLayout(ban.h4,0);
		setLayout(new BorderLayout());
		//hot.hon4();
		String s="";
		for(int i=0;i<ban.h4;i++)
		{//h[i]=new JLabel(hot.l4[i]);
			//add(h[i]);}
			s=s+hot.l4[i]+"\n";
			}
			JTextArea f=new JTextArea(s,5,5);
			f.setEditable(false);
			add(new JScrollPane(f), BorderLayout.CENTER);
		
			}
			}
public class literature{
	public static void run(){
		dum4 s=new dum4();
		//s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setSize(800,400);
		s.setVisible(true);
		}
	public static void main(String[]args){
	run();
	}
	}