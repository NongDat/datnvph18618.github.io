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
public class NoTaxtProduct extends Product{

    public NoTaxtProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double getImportTaxt() {
        return 0;
    }


    
}
