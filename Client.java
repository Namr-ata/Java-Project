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
public class Client {
    public static void main(String[] args) throws IOException{
        Socket s= new Socket("localhost",6969);
        
        Scanner in= new Scanner(s.getInputStream());
        PrintWriter out= new PrintWriter(s.getOutputStream());
        
        out.println(5);
        int fact = in.nextInt();
        System.out.println("Factorial from server:"+fact);
        
        
        in.close();
        out.close();
        s.close();
        
        
    }
    
}
