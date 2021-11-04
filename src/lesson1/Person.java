/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

/**
 *
 * @author nongvandat
 */
public class Person {

    private String hoTen;
    private int tuoi;
    private String cccd;
    //Constructor

    public Person() {
    }

    public Person(String hoTen, int tuoi, String cccd) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.cccd = cccd;
    }
    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public void xuatTT(){
        System.out.printf("%s - %s - %d\n",this.cccd ,this.hoTen ,this.tuoi);
    }

}
