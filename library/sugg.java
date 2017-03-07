import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class suggc extends JFrame{
	static JLabel a;
	static JTextField b;
	static JButton c;
	public suggc(){
		super("LIBRARY");
		setLayout(new FlowLayout());
		a=new JLabel("Suggest Books");
		add(a);
		b=new JTextField(20);
		add(b);
		c=new JButton("OK");
		add(c);
		hack x=new hack();
		c.addActionListener(x);
	}
}
class hack implements ActionListener{
	static int h=0,k=0;
	
	public void actionPerformed(ActionEvent event){
	if(event.getSource()==suggc.c&&!(suggc.b.getText().equals("")))
	{try{

		
		FileReader a=new FileReader("suggestion.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		h++;
		}

		b.close();
		}catch(Exception e){}
	 String l[]=new String[h];
	try{

		
		FileReader a=new FileReader("suggestion.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		l[k]=s;
		k++;
		}

		b.close();
		}catch(Exception e){}
	try{
	FileWriter p=new FileWriter("suggestion.txt");
	BufferedWriter q=new BufferedWriter(p);
	PrintWriter r=new PrintWriter(q);
	for(int i=0;i<h;i++)
	{r.println(l[i]);}
	r.println(suggc.b.getText());
	r.close();
	}catch(Exception e){}
	sugg.s.dispose();
	sugg.s=null;
	}
	else
{JOptionPane.showMessageDialog(null,"INVALID OPERATION!");}

	}
	}
	public class sugg{
	static suggc s;
	public static void run(){
		 s=new suggc();
	
		s.setSize(800,400);
		s.setVisible(true);
		}
	public static void main(String[]args){
	run();
	}
	}
		