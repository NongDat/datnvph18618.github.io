/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1.BT1;

/**
 *
 * @author nongvandat
 */
public class Student extends Person {

   private String maSV;
   private String chuyenNganh;

    public Student() {
    }

    public Student(String maSV, String chuyenNganh) {
        this.maSV = maSV;
        this.chuyenNganh = chuyenNganh;
    }

    public Student( String hoTen, int gioiTinh, String queQuan, String diaChi,String maSV, String chuyenNganh) {
        super(hoTen, gioiTinh, queQuan, diaChi);
        this.maSV = maSV;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.printf("mã SV :%s  chuyên ngành: %s",this.maSV,this.chuyenNganh);
    }
    
    
}
