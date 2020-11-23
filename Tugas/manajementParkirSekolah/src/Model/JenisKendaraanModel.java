package Model;
import Entity.JenisKendaraanEntity;
import java.util.ArrayList;
public class JenisKendaraanModel {
    private ArrayList<JenisKendaraanEntity> jenisKendaraan;

public  JenisKendaraanModel () {
    
}    
    
    public JenisKendaraanModel(ArrayList<JenisKendaraanEntity> jenisKendaraan) {
        jenisKendaraan = new ArrayList <>();
    }
    
    public ArrayList<JenisKendaraanEntity> getJenisKendaraan(){
       return jenisKendaraan;
    }

public void insert(Object x) {
        jenisKendaraan.add((JenisKendaraanEntity) x);
    }



}
