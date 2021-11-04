/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap1_Swing_NongVanDatPH18618;

import java.util.ArrayList;

/**
 *
 * @author nongvandat
 */
public interface QLProductInterface {
    public void them(Product n);
    public void sua(int viTri,Product n);
    public void xoa(int viTri);
    public void get(int viTri);
    public ArrayList<Product> getList();
    public void setList(ArrayList<Product> list);
}
