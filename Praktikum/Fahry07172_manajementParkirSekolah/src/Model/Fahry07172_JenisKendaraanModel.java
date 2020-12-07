package Model;
import Entity.Fahry07172_JenisKendaraanEntity;
import java.util.ArrayList;
public class Fahry07172_JenisKendaraanModel {
    private ArrayList<Fahry07172_JenisKendaraanEntity> jenisKendaraan;

public  Fahry07172_JenisKendaraanModel () {
    
}    
    
    public Fahry07172_JenisKendaraanModel(ArrayList<Fahry07172_JenisKendaraanEntity> jenisKendaraan) {
        jenisKendaraan = new ArrayList <>();
    }
    
    public ArrayList<Fahry07172_JenisKendaraanEntity> getJenisKendaraan(){
       return jenisKendaraan;
    }

public void insert(Object x) {
        jenisKendaraan.add((Fahry07172_JenisKendaraanEntity) x);
    }



}
