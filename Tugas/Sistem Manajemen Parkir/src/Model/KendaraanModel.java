package Model;

import Entity.KendaraanEntity;
import java.util.ArrayList;

public class KendaraanModel implements ModelInterfaces{
     private ArrayList<KendaraanEntity> ListKendaraan;
    
    public KendaraanModel(){
        ListKendaraan = new ArrayList<>();
    }
    
    public ArrayList<KendaraanEntity> getListKendaraan(){
       return ListKendaraan;
    }  
     

    @Override
    public void insert(Object x) {
        ListKendaraan.add((KendaraanEntity) x);
    }

    @Override
    public void update(int index, Object x) {
        ListKendaraan.set(index ,(KendaraanEntity) x);
    }

    @Override
    public void delete(int index) {
        ListKendaraan.remove(index);
    } 
}
