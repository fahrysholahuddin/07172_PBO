package Model;

import Entity.Fahry07172_SiswaEntity;
import java.util.ArrayList;

public class Fahry07172_SiswaModel implements Fahry07172_ModelInterfaces{
    private ArrayList<Fahry07172_SiswaEntity> Anggota;
    
    public Fahry07172_SiswaModel(){
       Anggota = new ArrayList<>();
    }
    
    public ArrayList<Fahry07172_SiswaEntity> getAnggota(){
       return Anggota;
    }
    
    public ArrayList<Fahry07172_SiswaEntity> anggota(){
       return Anggota;
    }
    @Override
    public void insert(Object x) {
        Anggota.add((Fahry07172_SiswaEntity) x);
    }

    @Override
    public void update(int index, Object x) {
        
    }

    @Override
    public void delete(int index) {
    
    }
    
  public Fahry07172_SiswaEntity showsiswa (int index){
        return Anggota.get(index);
}
}
