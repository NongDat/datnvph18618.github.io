/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide5_B10_file_IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import luyen_tap_1.Nguoi;

/**
 *
 * @author nongvandat
 */
public class Demo_ObjectIOStream {

    public static void main(String[] args) {
        String filename = "demo_Object_io.txt";
        
        System.out.println("Bắt đầu ghi data");
        ghiFile(filename);
        System.out.println("Ghi data thành công");
        System.out.println("--------------------");
        System.out.println("Bắt đầu ghi data");
        docFile(filename);
        System.out.println("Ghi data thành công");
    }

    public static void ghiFile(String name) {
        try {
            FileOutputStream fos = new FileOutputStream(name);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Nguoi n = new Nguoi("Nguyễn Văn A",1,"HN","HN");
            oos.writeObject(n);
            
            
            oos.close();  //đóng lệnh
        } catch (FileNotFoundException e) {
            System.out.println("Ghi file thất bại");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ghi file thất bại");
            e.printStackTrace();
        }
    }

    public static void docFile(String name) {
      
        try {
              FileInputStream fis = new FileInputStream(name);
              ObjectInputStream ois = new ObjectInputStream(fis);
              
              Nguoi n = (Nguoi) ois.readObject();
              
              System.out.println(n.getHoTen());
               System.out.println(n.getGioiTinh());
                System.out.println(n.getDiaChi());
                
              
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("đọc file thất bại");
        } catch (ClassNotFoundException ex) {
            System.out.println("Đọc file thất bại");
        } 
    }
}
