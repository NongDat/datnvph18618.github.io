/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide4ExCeption;

import luyen_tap_1.QuanLyDanhSach;

/**
 *
 * @author nongvandat
 */
public class DemoMultiException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] s = {"1", "2", "abc", "4" ,null, "5"};
       for (int i = 0 ; i < 7 ; i++){
           try{
               //Mở file(đọc và ghi)
               int t = Integer.parseInt(s[i]);
               System.out.println(t);
           }catch (NumberFormatException e){
               System.out.println("---------------------");
               e.printStackTrace();
               System.out.println("----------------------");
           }catch( ArrayIndexOutOfBoundsException e){
               System.out.println("------------------------");
               e.printStackTrace();
               System.out.println("----------------------");
           }catch ( Exception e){
               //
           } finally {
               //  => đóng file (dù đọc /ghi) thì cũng phải đóng file dọn dẹp bộ nhớ 
               //các khối code trong này luôn luôn được chạy đù TRY thành công hay đang lam mà có lỗi
               // => finally dọn dẹp những công việc đang làm ở trên 
           }
       }
    }
}

       
    

