/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyen_tap_1;

import java.util.ArrayList;

/**
 *
 * @author nongvandat
 */
public class QuanLyDanhSach implements QLDanhSachInterface{

  
        private ArrayList<Nguoi> list;

    public QuanLyDanhSach() {
        this.list= new ArrayList<>();
    }

    
    public void them1(Nguoi n) throws Exception{
        this.list.add(n);
        try{
            //lỗi
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        } 
    }
    public void them(Nguoi n){
        this.list.add(n);
    }

    @Override
    public void sua(int viTri, Nguoi n) {
        this.list.set(viTri, n);
    }

    @Override
    public void xoa(int viTri) {
        this.list.remove(viTri);
    }

    @Override
    public ArrayList<Nguoi> getList() {
        return this.list;
    }

    @Override
    public void setList(ArrayList<Nguoi> list) {
        this.list= list;
    }
        
        
    
}
