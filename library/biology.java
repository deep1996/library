import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class dum3 extends JFrame{
	JLabel[] h=new JLabel[ban.h3];
	//GridLayout v;
	public dum3(){
		super ("LIBRARY");
		//v=new GridLayout(ban.h3,0);
		setLayout(new BorderLayout() );
		String s="";
		for(int i=0;i<ban.h3;i++)
		{//h[i]=new JLabel(hot.l3[i]);
			//add(h[i]);
			s=s+hot.l3[i]+"\n";
			}
			JTextArea f=new JTextArea(s,5,5);
			f.setEditable(false);
			add(new JScrollPane(f), BorderLayout.CENTER);
		
			}
			}
public class biology{
	public static void run(){
		dum3 s=new dum3();
		
		s.setSize(800,400);
		s.setVisible(true);
		}
	public static void main(String[]args){
	run();
	}
	}