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
public interface QLDanhSachInterface {
    public void them(Nguoi n);
    public void sua(int viTri,Nguoi n);
    public void xoa(int viTri);
    public ArrayList<Nguoi> getList();
    public void setList(ArrayList<Nguoi> list);
}
