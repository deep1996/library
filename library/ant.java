import java.io.*;
public class ant{
static String s;
public static void run(){
try{
FileReader a=new FileReader("password.txt");
BufferedReader b=new BufferedReader(a);
String x;
if((x=b.readLine())!=null)
{s=x;
}
b.close();
}catch(Exception e){}
}
public static void main(String[]args){
run();}
}
