/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyen_tap_1;

import java.util.Scanner;

/**
 *
 * @author nongvandat
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QLDanhSachInterface qlds = new QuanLyDanhSach();
        Scanner sc= new Scanner(System.in);
        
           
        while (true) {
            System.out.println("/******************/");
            System.out.println("Chon:");
            System.out.println("\t1. Them nguoi.");
            System.out.println("\t2. Them sinh vien.");
            System.out.println("\t3. Xuat danh sach.");
            System.out.println("\t0. Dung chuong trinh.");
            System.out.println("/******************/");

            // ...
        }
    }
    
}
