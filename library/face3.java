import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class face{
	static int v=0;
	public static void any(){
	
	try{
	
	FileReader m=new FileReader(deep.space1.getText()+"b.txt");
	BufferedReader n=new BufferedReader(m);
	String t="";
	while((t=n.readLine())!=null)
	{v++;}
	n.close();
	}catch(Exception e){e.getStackTrace();}
	}
}
class face1{
	static String[] a;
	static int b=0;
	public static void any1(){
	face.v = 0;
	b = 0;
	face.any();
	a=new String[face.v];
	
	try{
	FileReader m=new FileReader(deep.space1.getText()+"b.txt");
	BufferedReader n=new BufferedReader(m);
	String t="";
	
	while((t=n.readLine())!=null)
	{a[b]=t;
	
	b++;}
	n.close();
	}catch(Exception e){e.getStackTrace();}
	}
}
class face2 extends JFrame{
	//static JLabel[] d;
	//GridLayout y;
	public face2(){
	super("library");
	face1.any1();
	//y=new GridLayout(face1.b,0);
	setLayout(new BorderLayout());
	String s="";
	//d=new JLabel[face1.b];
	
	for(int i=0;i<face1.b;i++)
	{//d[i]=new JLabel(face1.a[i]);
	//add (d[i]);
	s=s+face1.a[i]+"\n";
	}
	JTextArea f=new JTextArea(s,5,5);
			f.setEditable(false);
			add(new JScrollPane(f), BorderLayout.CENTER);
		
	}
}
public class face3{
	public static void run(){
	face2 h=new face2();
	h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	h.setSize(400,400);
	h.setVisible(true);
	}
	public static void main(String[]args)
	{run();}
}
	