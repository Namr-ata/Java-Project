
   import java.io.*;
import java.net.*;
public class Myclient {
 



    
    public static void main(String[] args){
    try{
    Socket s= new Socket ("localhost",9999);
    System.out.println("connect to client");
    DataOutputStream dout= new DataOutputStream (s.getOutputStream());
    dout.writeUTF("hello server");
    
    }
    catch(Exception e){System.out.println(e);
    }
    
}
}
