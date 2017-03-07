 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class horr1 extends JFrame{
static JLabel a;
static JButton c;
static JTextField b;
	public horr1(){
	super("deepanshu");
	setLayout(new FlowLayout());
	a=new JLabel("enter book name");
	add(a);
	b=new JTextField(20);
	add(b);
	c=new JButton("ok");
	add(c);
	hoo1 d=new hoo1();
	c.addActionListener(d);
	}
}
class hoo1 implements ActionListener{

	
	static int k,h;
	public void actionPerformed(ActionEvent event){
	if(event.getSource()==horr1.c&&!(horr1.b.getText().equals("")))
	{
	try{
		h=0;
		
		FileReader a=new FileReader("mathematics.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		h++;
		}

		b.close();
		}catch(Exception e){}
	 String l[]=new String[h];
	k=0;
	try{
		k=0;
		
		FileReader a=new FileReader("mathematics.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		l[k]=s;
		k++;
		}

		b.close();
		}catch(Exception e){}
	mathematics1.s.dispose();
	mathematics1.s=null;
	String[] faltu=new String[k+1];
		for(int i=0;i<k;i++)
		{faltu[i]=l[i];}
		faltu[k]=horr1.b.getText();
		for(int i=0;i<k;i++)
		{for(int j=i+1;j<k+1;j++)
		{if((faltu[i].compareTo(faltu[j]))>0)
		{String a,b;
		a=faltu[i];
		b=faltu[j];
		faltu[i]=b;
		faltu[j]=a;
		
		}
		
		}
		
		}
		
		try{
		FileWriter p=new FileWriter("mathematics.txt");
		BufferedWriter q=new BufferedWriter(p);
		PrintWriter r=new PrintWriter(q);
		for(int i=0;i<k+1;i++)
		{r.println(faltu[i]);}
	r.close();
	}catch(Exception e){}
	
	
	}
	else
{JOptionPane.showMessageDialog(null,"invalid operation");}

	}
	}
public class mathematics1{
	static horr1 s;
	public static void run(){
		 s=new horr1();
	
		s.setSize(800,400);
		s.setVisible(true);
		}
	public static void main(String[]args){
	run();
	}
	}