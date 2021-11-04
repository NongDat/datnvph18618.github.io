/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestASS1;

import java.io.Serializable;

/**
 *
 * @author nongvandat
 */
public class Product implements Serializable{

   private String tenSP,maSP;
   private double gia;
   private int tinhTrang;
   private String loai;

    public Product(String tenSP, String maSP, double gia, int tinhTrang, String loai) {
        this.tenSP = tenSP;
        this.maSP = maSP;
        this.gia = gia;
        this.tinhTrang = tinhTrang;
        this.loai = loai;
    }
   
    public Product() {
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
   
    
}
