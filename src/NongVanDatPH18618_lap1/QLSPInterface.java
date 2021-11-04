
package NongVanDatPH18618_lap1;

import java.util.ArrayList;

/**
 *
 * @author nongvandat
 */
public interface QLSPInterface {

    public void insert(Product n);
    public void update(int viTri, Product n);
    public void delete(int viTri);
    public void get(int viTri);
    
    public ArrayList<Product> getListSP();
    public void setListSP(ArrayList<Product> listSP);
}
