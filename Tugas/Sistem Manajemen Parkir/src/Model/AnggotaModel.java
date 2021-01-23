package Model;

import Entity.AnggotaEntity;
import java.util.ArrayList;

public class AnggotaModel implements ModelInterfaces{
    private ArrayList<AnggotaEntity> Anggota;
    
    public AnggotaModel(){
       Anggota = new ArrayList<>();
    }
    
    public ArrayList<AnggotaEntity> getAnggota(){
       return Anggota;
    }
    
    public ArrayList<AnggotaEntity> anggota(){
       return Anggota;
    }
    @Override
    public void insert(Object x) {
        Anggota.add((AnggotaEntity) x);
    }

    @Override
    public void update(int index, Object x) {
        
    }

    @Override
    public void delete(int index) {
    
    }
    
  public AnggotaEntity showsiswa (int index){
        return Anggota.get(index);
}
}
