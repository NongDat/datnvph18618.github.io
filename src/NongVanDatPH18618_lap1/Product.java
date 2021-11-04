/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NongVanDatPH18618_lap1;

/**
 *
 * @author nongvandat
 */
public class Product{

    /**
     * @param args the command line arguments
     */
    private String name;
    private double price;
    //constructor

    public Product() {
    }
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // get set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //Thuế
    public double getImportTaxt(){
        return 0.1*price;
    }
    
    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", Thuế=" + getImportTaxt() + '}';
    }
    public void xuatThongTin(){
        System.out.println("Tên sản phẩm: "+name);
        System.out.println("Giá sản phẩm: "+price);
        System.out.println("Thuế của sản phẩm: "+getImportTaxt());
        
    }

}
