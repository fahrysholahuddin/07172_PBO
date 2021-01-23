
package Controller;

import Entity.KendaraanEntity;
import Model.KendaraanModel;
import Entity.KategoriEntity;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import View.allobjctrl;

public class KendaraanController {
    //inisialisasi object
    KendaraanModel kendaraan_m = new KendaraanModel();
    KategoriEntity kategori = new KategoriEntity();
    
public KendaraanController() {
        kendaraan_m = new KendaraanModel();
        
    } 

public ArrayList<KendaraanEntity> getListKendaraan(){
       return kendaraan_m.getListKendaraan();
    }



public void insertData(String merk, String jenis, String tahunkendaraan,
             String nopol,int indexpilkend){
    KendaraanEntity kendaraan = new KendaraanEntity();
    kendaraan.setMerk(merk);
    kendaraan.setJenis(jenis);
    kendaraan.setTahunkendaraan(tahunkendaraan);
    kendaraan.setNopol(nopol);
    kendaraan.setIndexpilkend(indexpilkend);
        kendaraan_m.insert(kendaraan);
}
public void updateData (String merk,String jenis, String tahunkendaraan,
             String nopol,int indexpilkend){
             KendaraanEntity kendaraan = new KendaraanEntity();
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

