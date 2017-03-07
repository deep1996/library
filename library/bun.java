import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class hell extends JFrame{
JLabel a;
static JButton b,c,d;
GridLayout g;
public hell(){
super("LIBRARY");
g=new GridLayout(4,0);
setLayout(g);
a=new JLabel("Choose From The Following Options");
add(a);
b=new JButton("Existing Books");
add(b);
c=new JButton("Add Books");
add(c);
d=new JButton("Issued Books");
add(d);
you z=new you();
b.addActionListener(z);
c.addActionListener(z);
d.addActionListener(z);
}
}
class you implements ActionListener{
public void actionPerformed(ActionEvent event){
String x="";
if(event.getSource()==hell.b)
{ bun.y.dispose();
 bun.y=null;
comp.run();}
if(event.getSource()==hell.c)
{ bun.y.dispose();
 bun.y=null;
wow.run();}
if(event.getSource()==hell.d)
{bun.y.dispose();
 bun.y=null;
none1.run();}

}
}
public class bun{
static hell y;
public static void run(){
 y=new hell();

y.setSize(400,200);
y.setVisible(true);
}

public static void main (String [] args) {

run();

}

}