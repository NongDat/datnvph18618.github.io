/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luyentap1_Product;

/**
 *
 * @author nongvandat
 */
public class NoTaxtProduct extends Product{

    public NoTaxtProduct() {
    }

    public NoTaxtProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double getImportTaxt() {
        return 0; 
    }

    @Override
    public String xuatThongTin() {
        return super.xuatThongTin(); 
    }
    
   
    
}
