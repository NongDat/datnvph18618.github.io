/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_class1_NongVanDatPH18618;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nongvandat
 */
public class XFile {

    public static void writeObject(String path,Object object){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(object);
            oos.close();
        }  catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Ghi file thất bại !");
        }
    }
    public static Object openObject(String path){
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object object = ois.readObject();
            ois.close();
            return object;
        }  catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Ghi file thất bại !");
            return null;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("Ghi file thất bại !");
            return null;
        }
    }
    
}
