/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1.BT1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nongvandat
 */
public class QLList {

    ArrayList<Person> listPS = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("            Menu Chương Trình");
            System.out.println("1.Thêm đối tượng mới");
            System.out.println("2.Xuất danh sách đối tượng mới");
            System.out.println("0.Dừng chương trình");
            System.out.println("________________________");
            System.out.println("Xin mời chọn chức năng 0 -> 1");
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    ADDlist();
                    
                    break;
                case 2:xuatTT();
                    break;
                case 0:
                    System.exit(0);
                    System.out.println("Dừng chương trình");
                default:
                    System.out.println("Xin mời chọn lại chức năng 0 -> 1");
                    break;
            }
        }
    }
    //nhập

    public void ADDlist() {
        while (true) {
            System.out.println("Xin mời nhập Name");
            String hoTen = sc.nextLine();
            System.out.println("Xin mời nhập giới tính 0(Nam) 1(Nữ)");
            int gioiTinh ;
            do{
                System.out.println("Chỉ nhập 0 hoặc 1");
                gioiTinh = Integer.parseInt(sc.nextLine());
            }while(gioiTinh!=0 && gioiTinh!=1 );
            System.out.println("Xin mời nhập quê quán");
            String queQuan = sc.nextLine();
            System.out.println("Xin mời nhập địa chỉ");
            String diaChi = sc.nextLine();
            System.out.println("Bạn có phải là sinh viên không 1.Y(yes) 2 N(No)");
            String luaChon=sc.nextLine();
            if (luaChon.equalsIgnoreCase("N")) {
                listPS.add(new Person(hoTen, gioiTinh, queQuan, diaChi));

            } else if (luaChon.equalsIgnoreCase("Y")) {
                System.out.println("Xin mời nhập MSSV");
                String maSV = sc.nextLine();
                System.out.println("Xin mời nhập chuyên ngành");
                String chuyenNganh = sc.nextLine();
                listPS.add(new Student(hoTen, gioiTinh, queQuan, diaChi, maSV, chuyenNganh));

            } else {
                System.out.println("Xin mời nhập lại Y hoặc N");

            }
            System.out.println("Bạn có muốn nhập nữa không Y /N");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    
    //xuất
    public void xuatTT(){
        System.out.println("Danh sách ");
        for(Person PS:listPS){
            PS.xuatThongTin();
        }
    }
    
}
