import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class man5{
	static int h=0;
	public static void leg(){
	try{
	h = 0;
	FileReader a=new FileReader(cut.space7.getText()+"a.txt");
	BufferedReader b=new BufferedReader(a);
	String s;
	while((s=b.readLine())!=null)
	{h++;}
	b.close();
	}catch(Exception e){}
	}
}
	
class man {
	static String[] be;
	static int w=0;
	public static void more(){
	man5.leg();
	be=new String[man5.h];
	try{
	w = 0;
	FileReader a=new FileReader(cut.space7.getText()+"a.txt");
	BufferedReader b=new BufferedReader(a);
	String s;
	while((s=b.readLine())!=null)
	{be[w]=s;
	w++;}
	b.close();
	}catch(Exception e){}
	}
}

class man1 extends JFrame{
	
	static JLabel[] de;
	GridLayout e;
	static JTextField retur,s1;
	static JButton ok;
	
	public man1(){
		super("LIBRARY");
		man.more();
		e=new GridLayout((man.w+3),0);
		setLayout(e);
		
		de=new JLabel[man.w];
		for(int i=0;i<man.w;i++)
		{de[i]=new JLabel(man.be[i]);
		add(de[i]);}
		
		
		retur=new JTextField("Return Date (dd/mm/yyyy)");
		retur.setEditable(false);
		add(retur);
		s1=new JTextField(20);
		
		add(s1);
		ok=new JButton("SUBMIT");
		add(ok);
		man2 s=new man2();
		ok.addActionListener(s);
	}
}
class man2 implements ActionListener{
	public void actionPerformed(ActionEvent event){
		
		if(event.getSource()==man1.ok&&!(man1.s1.getText().equals("")))
		{String asd,bsd,csd,dsd,esd,fsd,gsd,hsd;
		String sx=man1.s1.getText();
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
		
		if((10*asw+bsw)<32&&(10*csw+dsw)<13&&(1000*esw+100*fsw+10*gsw+hsw)>2000&&sx.length()==10)
		
		{date1.run();}
		else
		{JOptionPane.showMessageDialog(null,"ENTER A VALID DATE");return;}
		
		
		int jk=0;
		try{
		FileReader a=new FileReader(cut.space7.getText()+"a.txt");
		BufferedReader b=new BufferedReader(a);
		String s="";
		while((s=b.readLine())!=null)
		{jk++;}
		b.close();
		}catch(Exception e){}
		String[] bv=new String[jk];
		int dc=0;
		try{
		FileReader as=new FileReader(cut.space7.getText()+"a.txt");
		BufferedReader bs=new BufferedReader(as);
		String s="";
		while((s=bs.readLine())!=null)
			{bv[dc]=s;
			dc++;}
			bs.close();
		}catch(Exception e){}
		for(int j=0;j<jk;j++)
		{
		int f=0;
		try{
		FileReader a=new FileReader("issued.txt");
		BufferedReader b=new BufferedReader(a);
		String s="";
		while((s=b.readLine())!=null)
		{f++;}
		b.close();
		}catch(Exception e){}
		String[] gh=new String[f];
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
		for(int i=0;i<f;i++)
		{int u=0;
		
		
		
		if(gh[i].compareTo(bv[j])==0)
		{u++;}
		
		if(u==0)
		{c.println(gh[i]);}
		if(u!=0)
		{for(int k=i+1;k<f;k++)
		{c.println(gh[k]);}
		break;}
		}	
		c.close();
		}catch(Exception e){}
		
		}	
		
		try{
		FileWriter a=new FileWriter(new File(cut.space7.getText()+"a.txt"));
		BufferedWriter b=new BufferedWriter(a);
		PrintWriter c=new PrintWriter(b);
		c.println("");
		
		c.close();
		}catch(Exception e){}
		int g=0;
		try{
		FileReader a=new FileReader(cut.space7.getText()+"b.txt");
		BufferedReader b=new BufferedReader(a);
		String u="";
		while((u=b.readLine())!=null)
		{g++;}
		b.close();
		}catch(Exception e){}
		
		String[] v=new String[g];
		int h=0;
		try{
		FileReader a=new FileReader(cut.space7.getText()+"b.txt");
		BufferedReader b=new BufferedReader(a);
		String u="";
		for(int i = 0; i < v.length; i++)
			v[i] = "";
			
		while((u=b.readLine())!=null)
		{v[h]=u;
		h++;}
		b.close();
		}catch(Exception e){}
		
		
		if(!(man1.s1.getText().equals("")))
		{
		
		
		try{
		FileWriter a=new FileWriter(cut.space7.getText()+"b.txt");
		BufferedWriter b=new BufferedWriter(a);
		PrintWriter c=new PrintWriter(b);
		
		for(int o=0;o<h;o++)
		{c.println(v[o]);
		}
		for(int i=0;i<man.w;i++)
		{c.println((man.be[i]));}
		c.println("RETURN DATE="+man1.s1.getText() );
		c.println("");
		c.println("");
		c.close();
		}catch(Exception e){}
		}
		
		int yh;
		man3.d.dispose();
		//Date.run();
		if(date1.w>3)
		{yh=date1.w-3;
		JOptionPane.showMessageDialog(null,"Fine is Rs."+(yh*5));
		}
		//if(date1.w<0)
		//{JOptionPane.showMessageDialog(null,"CHECK RETURN DATE");
		//return;}
		}
		if(event.getSource()==man1.ok&&(man1.s1.getText().equals("")))
		{JOptionPane.showMessageDialog(null,"Please Enter Return Date");}
	}
}
public class man3{
	static man1 d;
	public static void run(){
		d=new man1();
		d.setSize(200,300);
		d.setVisible(true);
	}
	public static void main(String[]args){
		run();
	}
}