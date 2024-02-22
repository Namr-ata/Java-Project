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
import java.util.*;
 class InvalidHeightException extends Exception{
   InvalidHeightException(String msg){
       super(msg);
   }
}

public class customExecption {
    static void validate(float height)throws InvalidHeightException{
     if(height<5.8)
         throw new InvalidHeightException("sorry you are not allowed to love me");
     else
         System.out.println("welcome baby!");
 }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your height:");
        float height= sc.nextFloat();
        
        
     try{
         validate(height);
     }catch(Exception e){
     System.out.println("exception occurred!");
     }
     }
    
    }
    

