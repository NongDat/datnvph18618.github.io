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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nongvandat
 */
public class DemoDataIOStream {
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
        try {
            FileOutputStream fos = new FileOutputStream(name);
            DataOutputStream dataOS = new DataOutputStream(fos);
            
            int i = 20;
            char c = 'B';
            
            dataOS.writeInt(i);
            dataOS.writeChar(c);
            
            dataOS.close();
        }  catch (IOException e) {
            System.out.println("Ghi file thất bại");
            e.printStackTrace();
        }
    }

    public static void docFile(String name) {
        FileInputStream fis = null;
       try{
            fis = new FileInputStream(name);
            DataInputStream dataIS = new DataInputStream(fis);
            
            int i = dataIS.readInt();
            char c = dataIS.readChar();
            System.out.println(i);
            System.out.println(c);
       }catch (IOException e) {
           System.out.println("Đọc file thất bại");
           e.printStackTrace();
       }
    }
    
}
