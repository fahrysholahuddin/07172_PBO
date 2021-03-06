package Controller;

import Model.Fahry07172_SiswaModel;
import Entity.*;
import View.allobjctrl;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Fahry07172_SiswaController {
    Fahry07172_SiswaModel siswa_m = new Fahry07172_SiswaModel();
    int indexLogin = 0;
     
 public ArrayList<Fahry07172_SiswaEntity> getListSiswa(){
       return siswa_m.getAnggota();
    }
 public Fahry07172_SiswaEntity getData(){
     return getData();
 }

 public DefaultTableModel listkendaraan(){
    DefaultTableModel dtmlistkend = new DefaultTableModel();
    Object[] kolom ={"kategori","merk","tahun kendaraan","jenis","nopol","nama"};
    dtmlistkend.setColumnIdentifiers(kolom);
    int size = allobjctrl.kendaraan.getListKendaraan().size();
    for (int i=0; i<size; i++){
        Object [] kendaraan = new Object[7];
        kendaraan[0] = Fahry07172_KategoriEntity.kategoripilkend[allobjctrl.kendaraan.getListKendaraan().get(i).getIndexpilkend()];
        kendaraan[1] = allobjctrl.kendaraan.getListKendaraan().get(i).getMerk();
        kendaraan[2] = allobjctrl.kendaraan.getListKendaraan().get(i).getJenis();
        kendaraan[3] = allobjctrl.kendaraan.getListKendaraan().get(i).getTahunkendaraan();
        kendaraan[4] = allobjctrl.kendaraan.getListKendaraan().get(i).getNopol();
        kendaraan[5] = allobjctrl.anggota.getListSiswa().get(i).getNama();
        dtmlistkend.addRow(kendaraan);
    }
    return dtmlistkend;
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
    public int cekData (String no, String password){
        int loop = 0;
        if(getListSiswa().size()==0){
            loop=-1; //data kosong
        } else {
            for(int i=0 ; i<getListSiswa().size();i++){
                if(getListSiswa().get(i).getNo().equals(no)){
                    loop= i;
                    break;
                }else{
                    loop = -2;
                }
            }
        } return loop; 
    }
    public void login(String no,String password){
        indexLogin = cekData(no, password);
    }
    public Fahry07172_SiswaEntity siswaEntity(){
        return
                siswa_m.showsiswa(indexLogin);
}
    public int  cekdaftar(String no){
        int cek = cekData(no,null);
        return cek;
    }
}