/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide5_B10_file_IO;

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
public class DemoFileIOStream {

    public static void main(String[] args) {
        String filename = "demo_file_io.txt";
        System.out.println("Bắt đầu ghi file");
        ghiFile(filename);
        System.out.println("Ghi file thành công");
        System.out.println("--------------------");
        System.out.println("Bắt đầu ghi file");
        docFile(filename);
        System.out.println("Ghi file thành công");
    }

    public static void ghiFile(String name) {
        try {
            FileOutputStream fos = new FileOutputStream(name);
            String txt = "Hello Poly _ xin chào";
            byte[] b = txt.getBytes();
            fos.write(b); // 
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
// cách1       byte[] b = fis.readAllBytes();
//            String txt = new String(b);
//            System.out.println(txt);
//cach 2 đọc từng kí tự,
        while(fis.available() != 0){  //nếu fis.available() = 0 thì k trả ra kĩ tự nào thì dừng
//            int i = fis.read();
//            char c = (char) i;
//            System.out.println(c);
//cách 3 dùng hàm 
            byte[] b = new byte[fis.available()];
            fis.read(b);
            String txt = new String(b);
            System.out.println(txt);
        }
        } catch (FileNotFoundException e) {
            System.out.println("Đọc file thất bại");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Đọc file thất bại");
            e.printStackTrace();
        }
    }

}
