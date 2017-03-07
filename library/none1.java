import java.awt.*;
import javax.swing.*;
import java.io.*;

class none4{
	String[] p; 
	public void ho(){
	none3 q=new none3();
	q.has();
	p=new String[q.b];
	String a="",b="";
	if(q.b>0)
	{for(int i=0;i<q.b-1;i++)
	{
	for(int j=i+1;j<q.b;j++)
	{
	if((q.x[i].compareTo(q.x[j]))>0)
	{a=q.x[i];
	b=q.x[j];
	q.x[i]=b;
	q.x[j]=a;
	}
	}
	p[i]=q.x[i];
	}
	p[q.b-1]=q.x[q.b-1];
	}
	else if(q.b==0)
	{p=null;}
	}
}


class none2{
	int a=0;
	public void how(){
	try{
	FileReader p=new FileReader("issued.txt");
	BufferedReader q=new BufferedReader(p);
	String s="";
	while((s=q.readLine())!=null)
	{a++;}
	q.close();
	}catch(Exception e){}
	}
}


class none3{
	String[] x; 
	int b;
	public void has(){
	
	none2 l=new none2();
	l.how();
	x=new String[l.a];
	
	try{
	FileReader p=new FileReader("issued.txt");
	BufferedReader q=new BufferedReader(p);
	String s="";
	b=0;
	while((s=q.readLine())!=null)
	{x[b]=s;
	b++;}
	q.close();
	}catch(Exception e){}
	}
}
	
	
class none extends JFrame{
	public none(){
	super("LIBRARY");
	//GridLayout g;
	none3 d=new none3();
	d.has();
	none4 w=new none4();
	w.ho();
	//g=new GridLayout(d.b,0);
	setLayout(new BorderLayout());	
	//JLabel[] a=new JLabel[d.b];
	String s="";
	for(int i=0;i<d.b;i++)
	{//a[i]=new JLabel(w.p[i]);
	//add(a[i]);
	s=s+w.p[i]+"\n";
	}
	JTextArea f=new JTextArea(s,5,5);
			f.setEditable(false);
			add(new JScrollPane(f), BorderLayout.CENTER);
		
	}
}


public class none1{
	public static void run(){
	none c=new none();
	
	c.setVisible(true);
	c.setSize(400,200);
	}
	public static void main(String[]args)  
	{run();
	}
}	
	