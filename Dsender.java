import java.net.*;
import java.io.*;
import java.util.*;
public class Dsender {
    public static void main(String[] args)throws Exception{
        DatagramSocket ds=new DatagramSocket();
        String str="hello reciver k xa khabr";
        InetAddress ip=InetAddress.getByName("localHost");
        DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ip,3000);
        ds.send(dp);
        ds.close();
        
    }
}
