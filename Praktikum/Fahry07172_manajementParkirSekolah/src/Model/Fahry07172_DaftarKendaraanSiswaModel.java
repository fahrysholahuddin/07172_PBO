package Model;

import Entity.Fahry07172_DaftarKendaraanSiswaEntity;
import Entity.Fahry07172_KendaraanEntity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Fahry07172_DaftarKendaraanSiswaModel implements Fahry07172_ModelInterfaces {

    private ArrayList<Fahry07172_DaftarKendaraanSiswaEntity> daftarKendaraanArrayList;

    public Fahry07172_DaftarKendaraanSiswaModel() {
        daftarKendaraanArrayList = new ArrayList<Fahry07172_DaftarKendaraanSiswaEntity>();
    }

    public void insertDataDaftarKendaraan(Fahry07172_DaftarKendaraanSiswaEntity daftarKendaraan) {
        daftarKendaraanArrayList.add(daftarKendaraan);
    }

    public ArrayList<Fahry07172_DaftarKendaraanSiswaEntity> getDaftarKendaraanArrayList() {
        return daftarKendaraanArrayList;
    }

    @Override
    public int cek(String no, String password) {
        int loop = 0;
        if (daftarKendaraanArrayList.size() == 0) {
            loop = -1; //data kosong
        } else {
            for (int i = 0; i < daftarKendaraanArrayList.size(); i++) {
                if (daftarKendaraanArrayList.get(i).getSiswa().getNo().equals(no)) {
                    loop = i;
                    break;
                } else {
                    loop = -2;
                }
            }
        }
        return loop;
    }

    public Fahry07172_DaftarKendaraanSiswaEntity showDaftarKendaraan(int index) {
        return daftarKendaraanArrayList.get(index);
    }

    public void updateIsVerified(int index, Fahry07172_DaftarKendaraanSiswaEntity daftarKendaraanEntity) {
        daftarKendaraanArrayList.set(index, daftarKendaraanEntity);
    }
}
