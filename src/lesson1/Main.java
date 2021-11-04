/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

/**
 *
 * @author nongvandat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person obj;//Khai báo biến
        //ép kiểu ngầm định
        //Khởi tạo đối tượng của lớp SV & gắn vào biến obj
        obj=new Student("PH0123",1000,"Đạt",20,"2121");
        obj.xuatTT();
        
        //ngược lại
        //ép kiểu tường minh
        Student sv=(Student) new Person("Anh Đạt",30,"12344");
        sv.xuatTT();
    }
    
}
