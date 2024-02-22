/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
class ThreadExample extends Thread{
    String tname;
    ThreadExample(String n){
        tname=n;
        System.out.println("creating"+tname);
    }
    public void run()
    {
        System.out.println("running"+tname);
        try{
           for(int i=10;i>0;i--){
               System.out.println("thread"+tname+"printing"+i);
               //Thread.sleep(500);
           }
        } catch(Exception e){
                   System.out.println("thread"+tname+"interrupted");
                  
                   }
        System.out.println("thread"+tname+"exisiting");
    }
    
}
public class ThreadDemo {
    public static void main(String []args){
        ThreadExample tg =new ThreadExample("t1");
        ThreadExample tg1 =new ThreadExample("t2");
        tg.setPriority(10);
        
        int p = tg1.getPriority();
        System.out.println("The priority of the t2= "+ p);
        tg.start();
        tg1.start();
        
        
    }
    
}
