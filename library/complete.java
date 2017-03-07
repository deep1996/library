import java.awt.*;
import javax.swing.*;
import java.io.*;
class please{
static int h;
	public static void any(){
		try{
		h=0;
		
		FileReader a=new FileReader("suggestion.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		h++;
		}

		b.close();
		}catch(Exception e){}
	}
}
class plea{
	static String[] w;
	public static void plea1(){
		please.any();
		w=new String[please.h];
		int k=0;
		try{

		
		FileReader a=new FileReader("suggestion.txt");
		BufferedReader b=new BufferedReader(a);
		String s;

		while((s = b.readLine()) != null)
		{
		w[k]=s;
		k++;
		}

		b.close();
		}catch(Exception e){}
		}
		}
class bad extends JFrame{
	//static JLabel[] z;
	GridLayout v;
	public bad(){
	super("LIBRARY");
		please.any();
		//v=new GridLayout(please.h,0);
		setLayout(new BorderLayout());
		//z=new JLabel[please.h];
		//Box box=new Box();
		
		String s="";
		for(int i=0;i<please.h;i++)
			{
			//z[i]=new JLabel(plea.w[i]);
			//add(z[i]);
			s=s+plea.w[i]+"\n";
			}
			JTextArea gh=new JTextArea(s,5,5);
			gh.setEditable(false);
			add(new JScrollPane(gh), BorderLayout.CENTER);
		}
	}
	public class complete{
	public static void run(){
	please.any();
	plea.plea1();
	bad e=new bad();
	//e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setSize(200,200);
	e.setVisible(true);
	}
	public static void main(String[]args)
	{

	run();
	}
	}

		