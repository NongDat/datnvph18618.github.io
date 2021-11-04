/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide5_B10_file_IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
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
public class DATA {

    public static void main(String[] args) {
        String filename = "demo_data_io.txt";
        System.out.println("Bắt đầu ghi data");
        ghiFile(filename);
        System.out.println("Ghi data thành công");
        System.out.println("--------------------");
        System.out.println("Bắt đầu ghi data");
        docFile(filename);
        System.out.println("Ghi data thành công");
    }

    public static void ghiFile(String name) {
       
          Nguoi n = new Nguoi("Nguyễn Văn A",1,"HN","HN");
          
        try {     
            FileOutputStream fos = new FileOutputStream(name);
            ObjectOutputStream oos =new ObjectOutputStream(fos);
            oos.writeObject(n);
            oos.close();
        }  catch (IOException e) {
            System.out.println("Ghi file thất bại");
            e.printStackTrace();
        }
    }

    public static void docFile(String name) {
        
       try{
            FileInputStream fis = new FileInputStream(name);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Nguoi n= (Nguoi)ois.readObject();
            
            System.out.println(n.getHoTen());
            System.out.println(n.getDiaChi());
            System.out.println(n.getGioiTinh());
            System.out.println(n.getQueQuan());
            ois.close();
       }catch (IOException e) {
           System.out.println("Đọc file thất bại");
           e.printStackTrace();
       } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
           System.out.println("Đọc file thất bại");
       }
    }
    
}
