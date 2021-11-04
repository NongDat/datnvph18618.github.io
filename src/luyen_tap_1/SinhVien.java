/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyen_tap_1;

/**
 *
 * @author nongvandat
 */
public class SinhVien extends Nguoi{
    private String maSV;
    private String chuyenNganh;

//    public SinhVien() {
//    }

    public SinhVien(String maSV, String chuyenNganh, String hoTen, int gioiTinh, String queQuan, String diaChi) {
        super(hoTen, gioiTinh, queQuan, diaChi);
        this.maSV = maSV;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    public String xuatThongTin(){
        String infoCoBan = super.xuatThongTin();
        return this.maSV + " - "+this.chuyenNganh+ " - "+ infoCoBan;
    }
}
