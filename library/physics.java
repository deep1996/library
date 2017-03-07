import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class dum extends JFrame{
	//JLabel[] h=new JLabel[ban.h];
	//GridLayout v;
	public dum(){
		super ("LIBRARY");
		//v=new GridLayout(ban.h,0);
		setLayout(new BorderLayout());
		String s="";
		for(int i=0;i<ban.h;i++)
		{//h[i]=new JLabel(hot.l[i]);
			//add(h[i]);
			s=s+hot.l[i]+"\n";
			}
			JTextArea f=new JTextArea(s,5,5);
			f.setEditable(false);
			add(new JScrollPane(f), BorderLayout.CENTER);
		
			}
			}
public class physics{
	public static void run(){
		dum s=new dum();
		
		s.setSize(1500,1500);
		s.setVisible(true);
		}
	public static void main(String[]args){
	run();
	}
	}