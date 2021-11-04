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
public class Student extends Person {

    /**
     * class con kế thừa class cha
     * class con có quyền truy xuất đến thuộc tính & phương thức(không PRIVATE) của cha
     * 
     * 
     * 
     * 
     */
    private String maSV;
    private int soTienTrongViAP;

    public Student(String maSV, int soTienTrongViAP, String hoTen, int tuoi, String cccd) {
        super(hoTen, tuoi, cccd);
        this.maSV = maSV;
        this.soTienTrongViAP = soTienTrongViAP;
    }

        
    @Override
    public void xuatTT() {
        super.xuatTT(); //To change body of generated methods, choose Tools | Templates.
        System.out.printf("mã SV: %s \n so tiền: %d",maSV,soTienTrongViAP);
    }
    
    

    
    
}
