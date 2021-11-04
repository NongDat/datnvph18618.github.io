/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NongVanDatPH18618_lap1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nongvandat
 */
public class QLSP implements QLSPInterface {

    private ArrayList<Product> listSP ;
    public QLSP(){
        listSP = new ArrayList<>();
    }

    public void QLSP() {
        this.listSP = new ArrayList<>();
    }
    
    @Override
    public void insert(Product n) {
       this.listSP.add(n);
    }

    @Override
    public void update(int viTri, Product n) {
      this.listSP.set(viTri, n);
    }

    @Override
    public void delete(int viTri) {
        this.listSP.remove(viTri);
    }
    
     @Override
    public void get(int viTri) {
        this.listSP.get(viTri);
    }

    @Override
    public ArrayList<Product> getListSP() {
        return this.listSP;
    }

    @Override
    public void setListSP(ArrayList<Product> listSP) {
        this.listSP = listSP;
    }
   
}