package Controller;

import Entity.Fahry07172_DaftarKendaraanSiswaEntity;
import Entity.Fahry07172_SiswaEntity;
import java.util.Date;

public class Fahry07172_SiswaController implements Fahry07172_ControllerInterface {

    int indexLogin = 0;

    public Fahry07172_SiswaController() {

    }

    public Fahry07172_SiswaEntity getData() {
        return Fahry07172_AllObjectModel.siswaModel.getSiswaEntityArrayList(indexLogin);
    }

    public void daftarSiswa(int indexSiswa, Fahry07172_SiswaEntity siswaEntity, boolean isVerified) {
        Fahry07172_AllObjectModel.daftarKendaraanSiswaModel.insertDataDaftarKendaraan(new Fahry07172_DaftarKendaraanSiswaEntity(indexSiswa, siswaEntity, isVerified));
    }

    @Override
    public void login(String no, String password) {
        indexLogin = Fahry07172_AllObjectModel.siswaModel.cek(no, password);
    }

    public void insert(String no, String password, String nama, String no_telp, String Status, Date tglLahir) {
        Fahry07172_AllObjectModel.siswaModel.insert(new Fahry07172_SiswaEntity(no, password, nama, no_telp, Status, tglLahir));
    }

    public Fahry07172_SiswaEntity siswaEntity() {
        return Fahry07172_AllObjectModel.siswaModel.getSiswaEntityArrayList(indexLogin);
    }

    public int cekDaftarKendaraanSiswa(String no) {
        int cek = Fahry07172_AllObjectModel.daftarKendaraanSiswaModel.cek(no, null);
        return cek;
    }

    public Fahry07172_DaftarKendaraanSiswaEntity showDaftarKendaaraanSiswa(int index) {
        return Fahry07172_AllObjectModel.daftarKendaraanSiswaModel.showDaftarKendaraan(index);
    }
}
