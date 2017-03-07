import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class hand extends JFrame{
	static JLabel date;
	static JTextField de;
	static JTextField[] a;
	static JTextField[] b;
	static JButton ok;
	GridLayout l;
	public hand(){
		super("LIBRARY");
		a=new JTextField[Integer.parseInt(forever.b.getText())];
		b=new JTextField[Integer.parseInt(forever.b.getText())];
		l=new GridLayout(Integer.parseInt(forever.b.getText())+2,2);
		setLayout(l);
		date=new JLabel("Date (dd/mm/yyyy)");
		add(date);
		de=new JTextField(20);
		add(de);
		//System.out.println(a.length);
		for(int i=0;i<Integer.parseInt(forever.b.getText());i++)
		{
		//System.out.println(i);
		a[i]=new JTextField("Book "+(i+1));
		a[i].setEditable(false);
		add(a[i]);
		b[i]=new JTextField(20);
		add(b[i]);
		}
		ok=new JButton("SUBMIT");
		add(ok);
		hand1 s=new hand1();
		ok.addActionListener(s);
	}
}
class hand1 implements ActionListener{
	public void actionPerformed(ActionEvent event){
		if(event.getSource()==hand.ok&&!(hand.b[0].getText().equals("")))
		{String asd,bsd,csd,dsd,esd,fsd,gsd,hsd;
		String sx=hand.de.getText();
		int asw,bsw,csw,dsw,esw,fsw,gsw,hsw;
		try{
		 asd=""+sx.charAt(0);
		 bsd=""+sx.charAt(1);
		 csd=""+sx.charAt(3);
		 dsd=""+sx.charAt(4);
		 esd=""+sx.charAt(6);
		 fsd=""+sx.charAt(7);
		 gsd=""+sx.charAt(8);
		 hsd=""+sx.charAt(9);
		asw=Integer.parseInt(asd);
		bsw=Integer.parseInt(bsd);
		csw=Integer.parseInt(csd);
		dsw=Integer.parseInt(dsd);
		esw=Integer.parseInt(esd);
		fsw=Integer.parseInt(fsd);
		gsw=Integer.parseInt(gsd);
		hsw=Integer.parseInt(hsd);
		if(sx.charAt(2)!='/'||sx.charAt(5)!='/')
		{JOptionPane.showMessageDialog(null,"Please Enter Date In Given Format!");return;}
		}catch(Exception e){JOptionPane.showMessageDialog(null,"Please Enter Date In Given Format!");return;}
		
		if(!((10*asw+bsw)<32||(10*csw+dsw)<13||(1000*esw+100*fsw+10*gsw+hsw)>2000||sx.length()==10))
		
		//{Date.run();}
		//else
		{JOptionPane.showMessageDialog(null,"ENTER A VALID DATE");return;}
		
		
		
		
		
		
		
		try{
		FileWriter a=new FileWriter(new File(cut.space7.getText()+"a.txt"));
		BufferedWriter b=new BufferedWriter(a);
		PrintWriter c=new PrintWriter(b);
		
		c.println("Borrow Date="+hand.de.getText());
		for(int i=0;i<Integer.parseInt(forever.b.getText());i++)
		{c.println(hand.b[i].getText());}
		c.close();
		}catch(Exception e){}
		hand2.d.dispose();
		hand2.d=null;		
		int d=0;
		try{
		FileReader a=new FileReader("issued.txt");
		BufferedReader b=new BufferedReader(a);
		String s="";
		while((s=b.readLine())!=null)
		{d++;}
		b.close();
		}catch(Exception e){}
		
		String[] gh=new String[d];
		int y=0;
		try{
		FileReader a=new FileReader("issued.txt");
		BufferedReader b=new BufferedReader(a);
		String s="";
		while((s=b.readLine())!=null)
		{gh[y]=s;
		y++;}
		b.close();
		}catch(Exception e){}
		
		try{
		FileWriter a=new FileWriter("issued.txt");
		BufferedWriter b=new BufferedWriter(a);
		PrintWriter c=new PrintWriter(b);
		for(int i=0;i<d;i++)
		{c.println(gh[i]);}
		for(int i=0;i<Integer.parseInt(forever.b.getText());i++)
		{c.println(hand.b[i].getText());}
		c.close();
		}catch(Exception e){}
		
		
		
		
		
		
		
		
		
		}
	}
}
public class hand2{
	static hand d;
	public static void run(){
		d=new hand();
		d.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		d.setSize(400,400);
		d.setVisible(true);
	}
	public static void main(String[]args){
		run();
	}
}