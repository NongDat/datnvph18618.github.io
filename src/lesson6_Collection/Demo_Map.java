/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6_Collection;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nongvandat
 */
public class Demo_Map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Integer> diemTP = new HashMap<String, Integer>();

        diemTP.put("lap1", 10);
        diemTP.put("lap2", 6);
        diemTP.put("lap3", 9);
        diemTP.put("lap4", 8);
        System.out.println(diemTP);
        
        diemTP.put("lap1", 8);
        System.out.println(diemTP); //nó sẽ lấy phần cập nhập
    }

}
