/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson12_Thread;

/**
 *
 * @author nongvandat
 */
public class MainClass {

    public static void main(String[] args) {
      Thread t1 = new MyThreading("Đay là thread t1"),
              t2 = new MyThreading("Đay là thread t2");
              t1.start();
              System.out.println("-------------");
              t2.start();
    }
    
}
