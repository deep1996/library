import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
class again extends JFrame{
	JLabel p1,p2;
	static JTextField g1,g2;
	static JButton b;
	GridLayout x;
	public again(){
		super ("LIBRARY");
		x=new GridLayout(3,2,5,5);
		setLayout(x);
		p1=new JLabel("Current Password");
		add(p1);
		g1=new JTextField(20);
		add(g1);
		p2=new JLabel("New Password");
		add(p2);
		g2=new JTextField(20);
		add(g2);
		b=new JButton("DONE");
		add(b);
		again1 c=new again1();
		b.addActionListener(c);
	}
}
class again1 implements ActionListener{
	public void actionPerformed(ActionEvent event){
		ant.run();
		
		if(event.getSource()==again.b&&again.g1.getText().equals(ant.s)&&!(again.g2.getText().equals("")))
		{try{
		FileWriter p=new FileWriter("password.txt");
		BufferedWriter q=new BufferedWriter(p);
		PrintWriter r=new PrintWriter(q);
		r.println(again.g2.getText());
		r.close();
		}catch(Exception e){}
		again2.f.dispose();
		again2.f=null;
		}
	else
	JOptionPane.showMessageDialog(null," CURRENT PASSWORD IS INVALID");
	}
}
public class again2{
	static again f;
	public static void run(){
		f=new again();
	
		f.setSize(500,200);
		f.setVisible(true);
	}
	public static void main(String[]args){
		run();
	}
}