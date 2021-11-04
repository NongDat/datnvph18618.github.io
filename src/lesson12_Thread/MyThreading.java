/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson12_Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nongvandat
 */
public class MyThreading extends Thread{
    private String message;
    public MyThreading(String message){ //hàm khởi tạo
        this.message = message;
    }
    @Override
    public void run(){
        Thread t = new Thread();
        String txt = this.message;
        System.out.println(txt);
        int i = 0;
        while(true){
            System.out.println(i);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThreading.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
