/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestASS1;

import java.util.List;

/**
 *
 * @author nongvandat
 */
public interface QLSPInterface<E> {
    public void them(E n);
    public void sua(int viTri,E n);
    public void xoa(int viTri);
    public List<E> openObject(String path);
    public void writeObject(String path,Object object);
    
    public List<E> getList();
    public void setList(List<E> list);
}
