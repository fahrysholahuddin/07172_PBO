package Model;

import Entity.Fahry07172_KendaraanEntity;
import java.util.ArrayList;

public class Fahry07172_KendaraanModel implements Fahry07172_ModelInterfaces{
     private ArrayList<Fahry07172_KendaraanEntity> ListKendaraan;
    
    public Fahry07172_KendaraanModel(){
        ListKendaraan = new ArrayList<>();
    }
    
    public ArrayList<Fahry07172_KendaraanEntity> getListKendaraan(){
       return ListKendaraan;
    }   

    @Override
    public void insert(Object x) {
        ListKendaraan.add((Fahry07172_KendaraanEntity) x);
    }

    @Override
    public void update(int index, Object x) {
        ListKendaraan.set(index ,(Fahry07172_KendaraanEntity) x);
    }

    @Override
    public void delete(int index) {
        ListKendaraan.remove(index);
    } 
}
