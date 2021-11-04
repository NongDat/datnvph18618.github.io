/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST_ASS1_1;

import java.io.Serializable;

/**
 *
 * @author nongvandat
 */
public class Product implements Serializable{

    private String tenSP,maSp,loai;
    private int tinhTrang;
    private double gia;

    public Product() {
    }

    public Product(String tenSP, String maSp, String loai, int tinhTrang, double gia) {
        this.tenSP = tenSP;
        this.maSp = maSp;
        this.loai = loai;
        this.tinhTrang = tinhTrang;
        this.gia = gia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
}
