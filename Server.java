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
import java.io.*;
import java.util.*;
public class Server {
    static int fact(int a){
        if(a==0)
            return 1;
        else
            return a*fact(a-1);
    }
    public static void main(String[] args)throws IOException{
        ServerSocket ss= new ServerSocket(6969);
        Socket s= ss.accept();
        
        Scanner in= new Scanner(s.getInputStream());
        PrintWriter out= new PrintWriter(s.getOutputStream());
        
        int num=in.nextInt();
        out.println(fact(num));
        
        in.close();
        out.close();
        ss.close();
        s.close();
        
        
    }
}
