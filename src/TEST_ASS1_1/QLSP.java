/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST_ASS1_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nongvandat
 */
public class QLSP implements QPSPInterface<Product>{

    private List<Product> list;

    public QLSP() {
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
    public List<Product> openFile(String path) {
        this.list.clear();
        this.list = (List<Product>) XFile.readObject(path);
        return this.list;
    }

    @Override
    public void saveFile(String path, Object object) {
        XFile.writeObject(path, object);
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
