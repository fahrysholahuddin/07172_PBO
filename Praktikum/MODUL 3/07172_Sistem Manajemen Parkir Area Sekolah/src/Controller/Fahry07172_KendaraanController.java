
package Controller;

import Entity.Fahry07172_KendaraanEntity;
import Model.Fahry07172_KendaraanModel;
import Entity.Fahry07172_KategoriEntity;
import java.util.ArrayList;

public class Fahry07172_KendaraanController {
    //inisialisasi object
    Fahry07172_KendaraanModel kendaraan_m = new Fahry07172_KendaraanModel();
    Fahry07172_KategoriEntity kategori= new Fahry07172_KategoriEntity();
    
public Fahry07172_KendaraanController() {
        kendaraan_m = new Fahry07172_KendaraanModel();
        
    } 

public ArrayList<Fahry07172_KendaraanEntity> getListKendaraan(){
       return kendaraan_m.getListKendaraan();
    }

public void insertData(String merk, String jenis, String tahunkendaraan,
             String nopol,int indexpilkend){
    Fahry07172_KendaraanEntity kendaraan = new Fahry07172_KendaraanEntity();
    kendaraan.setMerk(merk);
    kendaraan.setJenis(jenis);
    kendaraan.setTahunkendaraan(tahunkendaraan);
    kendaraan.setNopol(nopol);
    kendaraan.setIndexpilkend(indexpilkend);
        kendaraan_m.insert(kendaraan);
}
public void updateData (String merk,String jenis, String tahunkendaraan,
             String nopol,int indexpilkend){
             Fahry07172_KendaraanEntity kendaraan = new Fahry07172_KendaraanEntity();
    kendaraan.setMerk(merk);
    kendaraan.setJenis(jenis);
    kendaraan.setTahunkendaraan(tahunkendaraan);
    kendaraan.setNopol(nopol);
    kendaraan.setIndexpilkend(indexpilkend);
        kendaraan_m.update(indexpilkend, kendaraan);
    }
public void deleteData (int indexpilkend){
    kendaraan_m.delete(indexpilkend);
}

}

