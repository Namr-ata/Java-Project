/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
import java.io.*;
import java.net.*;

public class Myserver {
    public static void main(String[] args){
    try{
    ServerSocket ss=new ServerSocket(9999);
    Socket s=ss.accept();
    DataInputStream dis= new DataInputStream (s.getInputStream());
    String str=(String)dis.readUTF();
    System.out.println("message="+str);
    ss.close();
    }
    catch(Exception e){System.out.println(e);
    }
    
}
}