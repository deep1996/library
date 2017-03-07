import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class fat extends JFrame{
	static JLabel a;
	static JButton b,c;
	GridLayout v; 
	public fat(){
	super("LIBRARY");
	v=new GridLayout(3,0);
	setLayout(v);
	a=new JLabel("Choose an Action");
	add(a);
	b=new JButton("Add Suggestions");
	add(b);
	c=new JButton("View Suggestions");
	add(c);
	mat x=new mat();
	b.addActionListener(x);
	c.addActionListener(x);
	}
}
class mat implements ActionListener{
	public void actionPerformed(ActionEvent event){ 
	if(event.getSource()==fat.b)
	{suggestion.e.dispose();
	suggestion.e=null;
	sugg.run();
	}
	if(event.getSource()==fat.c)
	{suggestion.e.dispose();
	suggestion.e=null;
	complete.run();}
	}
}
public class suggestion{
	static fat e;
	public static void run(){
	e=new fat();

	e.setSize(300,200);
	e.setVisible(true);
	}
	public static void main(String []args){
	run();
	}
}