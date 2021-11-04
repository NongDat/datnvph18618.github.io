/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestASS1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nongvandat
 */
public class QLSP implements QLSPInterface<Product>{

    private List<Product> list;
    public QLSP(){
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
    public List<Product> openObject(String path) {
      this.list.clear();
      this.list = (List<Product>) XFile.openObject(path);
      return this.list;
      
    }

    @Override
    public void writeObject(String path, Object object) {
        XFile.writeObject(path, list);
    }

    @Override
    public List<Product> getList() {
        return this.list;
    }

    @Override
    public void setList(List<Product> list) {
        this.list = list;
    }
}
