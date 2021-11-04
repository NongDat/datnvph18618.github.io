/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luyentap1_Product;

import java.util.ArrayList;

/**
 *
 * @author nongvandat
 */
public class QLProduct implements QLProductInterface{

    ArrayList<Product> list;
    
    public QLProduct(){
        this.list = new ArrayList<>();
    }

    @Override
    public void them(Product n) {
        this.list.add(n);
    }

    @Override
    public void sua(int viTri, Product n) {
        this.list.set(viTri, n);
    }

    @Override
    public void xoa(int viTri) {
        this.list.remove(viTri);
    }

    @Override
    public ArrayList<Product> getList() {
        return this.list;
    }

    @Override
    public void setList(ArrayList<Product> list) {
        this.list = list;
    }
}
