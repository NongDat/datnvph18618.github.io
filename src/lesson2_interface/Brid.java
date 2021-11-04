/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2_interface;

/**
 *
 * @author nongvandat
 */
public class Brid extends Animal implements Flyable,Runable{
/*
    Class là thể hiện chi tiết
    Interface là thể hiện trừu tượng
*/
    
/*
    Khi 1 class thực thi lại interface,
    tất cả các phương thức được khai báo trong interface
    phải được triển khai trong class
    -không khai bảo thì tên class báo đỏ
*/
    @Override
    public void fly(){
        System.out.println("Flying...");
    }
    

    @Override
    public void tiengKeu() {
        System.out.println("bay bay"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        System.out.println("Running slowly...");
    }
}
