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
public abstract class Animal {
    private String ten;
    private String mau;

    public Animal() {
    }

    public Animal(String ten, String mau) {
        this.ten = ten;
        this.mau = mau;
    }
 
   //Speak
    public abstract void tiengKeu();

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
    
}

