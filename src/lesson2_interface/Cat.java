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
public class Cat extends Animal{

    public void run(){
        System.out.println("Running......");
    }

    @Override
    public void tiengKeu() {
        System.out.println("meow...."); //To change body of generated methods, choose Tools | Templates.
    }
}
