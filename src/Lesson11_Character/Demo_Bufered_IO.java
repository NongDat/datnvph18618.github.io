
package Lesson11_Character;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nongvandat
 */
public class Demo_Bufered_IO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fileName = "Demo_Bufered_writeer.txt";
        System.out.println("Bắt đầu ghi file");
        ghiFile(fileName);
        System.out.println("Kết thúc ghi file");
        System.out.println("--------------------------");
        System.out.println("Bắt đầu đọc file");
        docFile(fileName);
        System.out.println("Kết thúc đọc file");
    }
    public static void ghiFile(String fileName){
        try {
            FileWriter fWriter = new FileWriter(fileName);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            String[] txt={
                "\nHọc kỳ FALL 2021 _Block 1\n",
                "Lớp IT17101 - Môn MOB1023\n",
                "Xin chào ong vàng\n\n"
            };
            for(int i = 0; i < txt.length;i++){
                bWriter.write(txt[i]);
            }
            bWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Ghi fie  thất bại");
        }
    }
    public static void docFile(String fileName) {
        try {
            FileReader fReader = new FileReader(fileName);
            BufferedReader bReader = new BufferedReader(fReader);
            
            while(true){
                String txt = bReader.readLine();
                if(txt == null){
                    break;
                }else{
                    System.out.println(txt);
                }
            }
            bReader.close();
             System.out.println("Đọc file thành công !");
        }  catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Đọc file thất bại !");
        }
    }
    
}
