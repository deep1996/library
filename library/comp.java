//open existing file
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class be extends JFrame{
	JLabel x;
	static JButton a,b,c,d,e,f,g;
	GridLayout v;
	public be(){
		super("LIBRARY");
		v=new GridLayout(8,0);
		setLayout(v);
		x=new JLabel("Please Select a Subject");
		add(x);
		a=new JButton("PHYSICS");
		add(a);
		b=new JButton("MATHEMATICS");
		add(b);
		c=new JButton("CHEMISTRY");
		add(c);
		d=new JButton("BIOLOGY");
		add(d);
		e=new JButton("LITERATURE");
		add(e);
		f=new JButton("COMPUTER");
		add(f);
		g=new JButton("OTHERS");
		add(g); 
		ban w=new ban();
		a.addActionListener(w);
		b.addActionListener(w);
		c.addActionListener(w);
		d.addActionListener(w);
		e.addActionListener(w);
		f.addActionListener(w);
		g.addActionListener(w);
		}
		}
class ban implements ActionListener{
	static int h=0,h1=0,h2=0,h3=0,h4=0,h5=0,h6=0;
	
	public void actionPerformed(ActionEvent event){
		
		if(event.getSource()==be.a)
		{h=0;h1=0;h2=0;h3=0;h4=0;h5=0;h6=0;
		try{

		
		FileReader a=new FileReader("physics.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		h++;
		}

		b.close();
		}catch(Exception e){}
				comp.y.dispose();
		comp.y=null;
		hot.hon();
		}
		if(event.getSource()==be.b)
		{
		try{

		h1=0;
		FileReader a=new FileReader("mathematics.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		h1++;
		}

		b.close();
		}catch(Exception e){}
		comp.y.dispose();
		comp.y=null;
		hot.hon1();
		}
		if(event.getSource()==be.c)
		{h2=0;
		try{

		
		FileReader a=new FileReader("chemistry.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		h2++;
		}

		b.close();
		}catch(Exception e){}
				comp.y.dispose();
		comp.y=null;
		hot.hon2();
		}
		if(event.getSource()==be.d)
		{h3=0;
		try{

		
		FileReader a=new FileReader("biology.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		h3++;
		}

		b.close();
		}catch(Exception e){}
				comp.y.dispose();
		comp.y=null;
		hot.hon3();
		}
		if(event.getSource()==be.e)
		{h4=0;
		try{

		
		FileReader a=new FileReader("literature.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		h4++;
		}

		b.close();
		}catch(Exception e){}
				comp.y.dispose();
		comp.y=null;
		hot.hon4();
		}
		if(event.getSource()==be.f)
		{h5=0;
		try{

		
		FileReader a=new FileReader("computer.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		h5++;
		}

		b.close();
		}catch(Exception e){}
				comp.y.dispose();
		comp.y=null;
		hot.hon5();
		}
		if(event.getSource()==be.g)
		{h6=0;
		try{

		
		FileReader a=new FileReader("generalknowledge.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		h6++;
		}

		b.close();
		}catch(Exception e){}
				comp.y.dispose();
		comp.y=null;
		hot.hon6();
		}
		}
		}
class hot{
static String[] l;
static String[] l1;
static String[] l2;
static String[] l3;
static String[] l4;
static String[] l5;
static String[] l6;
//static String s="",s1="",s2="",s3="",s4="",s5="",s6="";
public static void hon(){		
		 l=new String[ban.h];
		int k=0;
		try{

		
		FileReader a=new FileReader("physics.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		l[k]=s;
		k++;
		//s=s+sx+"\n";
		}

		b.close();
		}catch(Exception e){}
		physics.run();
		
		}
	public static void hon1(){		
		 l1=new String[ban.h1];
		int k=0;
		try{

		
		FileReader a=new FileReader("mathematics.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		l1[k]=s;
		k++;
		}

		b.close();
		}catch(Exception e){}
		mathematics.run();
		
		}
	public static void hon2(){		
		 l2=new String[ban.h2];
		int k=0;
		try{

		
		FileReader a=new FileReader("chemistry.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		l2[k]=s;
		k++;
		}

		b.close();
		}catch(Exception e){}
		chemistry.run();
		
		}
	public static void hon3(){		
		 l3=new String[ban.h3];
		int k=0;
		try{

		
		FileReader a=new FileReader("biology.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		l3[k]=s;
		k++;
		}

		b.close();
		}catch(Exception e){}
		biology.run();
		
		}
	public static void hon4(){		
		 l4=new String[ban.h4];
		int k=0;
		try{

		
		FileReader a=new FileReader("literature.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		l4[k]=s;
		k++;
		//s4=s4+sx+"\n";
		}

		b.close();
		}catch(Exception e){}
		literature.run();
		
		}
	public static void hon5(){		
		 l5=new String[ban.h5];
		int k=0;
		try{

		
		FileReader a=new FileReader("computer.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		l5[k]=s;
		k++;
		}

		b.close();
		}catch(Exception e){}
		computer.run();
		
		}
	public static void hon6(){		
		 l6=new String[ban.h6];
		int k=0;
		try{

		
		FileReader a=new FileReader("generalknowledge.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		l6[k]=s;
		k++;
		}

		b.close();
		}catch(Exception e){}
		generalknowledge.run();
		
		}
		
		
		}
		
		
		
		
public class comp{
static be y;
	public static void run(){
		y=new be();
		
		y.setSize(400,400);
		y.setVisible(true);
		}

	public static void main (String [] args) {

		run();

}

}
		