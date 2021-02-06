package Controller;

import Model.Fahry07172_SiswaModel;
import Entity.Fahry07172_SiswaEntity;
import java.util.ArrayList;

public class Fahry07172_SiswaController {
    Fahry07172_SiswaModel siswa_m = new Fahry07172_SiswaModel();
     
 public ArrayList<Fahry07172_SiswaEntity> getListSiswa(){
       return siswa_m.getAnggota();
    }
    public void insertSiswa(String no,String nama, String alamat, String no_telp, 
            String password, String npm){
        Fahry07172_SiswaEntity data = new Fahry07172_SiswaEntity();
        data.setNo(no);
        data.setNama(nama);
        data.setAlamat(alamat);
        data.setNoTelp(no_telp);
        data.setPassword(password);
        data.setNPM(npm);
        siswa_m.insert(data);
    }
    
}
