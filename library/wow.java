 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class left extends JFrame{

JLabel x;
	static JButton a,b,c,d,e,f,g;
	GridLayout v;
	public left(){
		super("LIBRARY");
		v=new GridLayout(8,0);
		setLayout(v);
		x=new JLabel("SELECT SUBJECT TO ADD BOOKS");
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
		ten w=new ten();
		a.addActionListener(w);
		b.addActionListener(w);
		c.addActionListener(w);
		d.addActionListener(w);
		e.addActionListener(w);
		f.addActionListener(w);
		g.addActionListener(w);
		}
		}
class ten implements ActionListener{
	public void actionPerformed(ActionEvent event){
			if(event.getSource()==left.a)
			{wow.s.dispose();
			wow.s=null;
			physics1.run();}
			if(event.getSource()==left.b)
			{wow.s.dispose();
			wow.s=null;
			mathematics1.run();}
			if(event.getSource()==left.c)
			{wow.s.dispose();
			wow.s=null;
			chemistry1.run();}
			if(event.getSource()==left.d)
			{wow.s.dispose();
			wow.s=null;
			biology1.run();}
			if(event.getSource()==left.e)
			{wow.s.dispose();
			wow.s=null;
			literature1.run();}
			if(event.getSource()==left.f)
			{wow.s.dispose();
			wow.s=null;
			computer1.run();}
			if(event.getSource()==left.g)
			{wow.s.dispose();
			wow.s=null;
			generalknowledge1.run();}
			}
			}
public class wow{
	static left s;
	public static void run(){
		 s=new left();
		
		s.setSize(800,400);
		s.setVisible(true);
		}
	public static void main(String[]args){
	run();
	}
	}