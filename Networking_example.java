/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
import java.net.*;
public class Networking_example {
    public static void main(String[] args) throws UnknownHostException{
//       InetAddress ip=InetAddress.getByName("www.pkmc.tu.edu.np");
//       System.out.println("ip:"+ip);
       
       //InetAddress ip1=InetAddress.getLocalHost();
       //System.out.println("Localhost:"+ip1);
       
         //InetAddress ip1=InetAddress.getByName("192.168.1.27");
       //System.out.println("Hostname:"+ip1.getHostName());
        
        InetAddress ip1=InetAddress.getByName("www.pkmc.tu.edu.np");
       System.out.println("Hostname:"+ip1.getHostAddress());
    }
}
