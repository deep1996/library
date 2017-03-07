import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class forever extends JFrame{
	static JTextField a,b;
	static JButton c;
	public forever(){
	super("LIBRARY");
	run1();
	}
	
	
	public void run1(){
	
	
	setLayout(new FlowLayout());
	a=new JTextField("Number of Books to be Borrowed");
	a.setEditable(false);
	add(a);
	b=new JTextField(10);
	add(b);
	c=new JButton("OK");
	add(c);
	forever1 x=new forever1();
	c.addActionListener(x);
	}
}
class forever1 implements ActionListener{
	public void actionPerformed(ActionEvent event){
	if(event.getSource()==forever.c)
	{try{
	int er=Integer.parseInt(forever.b.getText());
	}catch(NumberFormatException e){JOptionPane.showMessageDialog(null,"Please Enter An Integer!");return;}
	hand2.run();
	forever2.l.dispose();
	forever2.l=null;
	}
	}
	}
public class forever2{
	static forever l;
	public static void run(){
		 l=new forever();
		
		l.setSize(400,200);
		l.setVisible(true);
	}
	public static void main(String[]args){
	run();
	}
}