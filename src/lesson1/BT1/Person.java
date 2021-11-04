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
public class Person {

   private String hoTen;
   private int gioiTinh;
   private String queQuan;
   private String diaChi;

    public Person() {
    }

    public Person(String hoTen, int gioiTinh, String queQuan, String diaChi) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.diaChi = diaChi;
    }
   
   //get set

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    //toString
    @Override
    public String toString(){
        return "Person{" + "hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", queQuan=" + queQuan + ", diaChi=" + diaChi + '}';
        
    }

    //xuất
    public void xuatThongTin() {
        System.out.println("name:"+hoTen);
        System.out.println("giới tính:");
        if(gioiTinh==0){
            System.out.println("Nam");
        }else if(gioiTinh==1){
            System.out.println("Nữ");
        }
        System.out.println("quê quán:"+queQuan);
        System.out.println("Địa chỉ:"+diaChi);
    }
}
