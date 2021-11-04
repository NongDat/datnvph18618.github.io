/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide4ExCeption;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author nongvandat
 */
public class checkRong {

 public static boolean check(JTextField diem,String mss){
     if(diem.getText().equals("")){
         JOptionPane.showMessageDialog(null, mss);
         diem.requestFocus();
         return true;
     }
     return false;
 }
    
}
