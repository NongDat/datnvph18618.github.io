/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11_Character;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nongvandat
 */
public class Demo_FileCharacter_io {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("demo_charater_file_io.txt");
        try {
            FileWriter writer = new FileWriter(file);
            String txt = "Xin chào IT17101";
            writer.write(txt);
            writer.write("Tôi là Nông Văn Đạt");
            writer.write("Lớp IT17101");
            writer.close();
            
            FileReader reader = new FileReader(file);
            
            while(true){
                int i = reader.read();
                if(i == -1){
                    System.out.println("");
                    break;
                }else{
                    char c = (char) i;
                     System.out.print(c);
                  //  System.out.println(c);  
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
