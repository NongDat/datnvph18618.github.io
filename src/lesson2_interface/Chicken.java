/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2_interface;

/**
 *
 * @author nongvandat
 */
public class Chicken extends Animal implements Runable{
   public static int soChan =2;
    @Override
    public void run(){

    }
    @Override
    public void tiengKeu() {
        System.out.println("cúc cu");
    }
 
}
