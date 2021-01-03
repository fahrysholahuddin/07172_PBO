package Controller;

import Entity.Fahry07172_AdminEntity;
import Entity.Fahry07172_DaftarKendaraanSiswaEntity;
import Entity.Fahry07172_SiswaEntity;
import java.util.ArrayList;
import java.util.Date;

public class Fahry07172_AdminController implements Fahry07172_ControllerInterface {

    int indexLogin = 0;

    public Fahry07172_AdminController() {

    }

    public void dataAdmin() {
        String noAdmin[] = {"01", "02"};
        String passwordAdmin[] = {"01", "02"};
        String namaAdmin[] = {"Petugas_1", "Petugas_2"};
        String notelpAdmin[] = {"111111", "222222"};
        String statusAdmin[] = {"Online", "Online"};
        String tglLahir[] = {"10/01/1990", "01/10/1990"};
        for (int i = 0; i < noAdmin.length; i++) {
            Fahry07172_AllObjectModel.adminModel.insertAdmin(new Fahry07172_AdminEntity(noAdmin[i], passwordAdmin[i], namaAdmin[i], notelpAdmin[i], statusAdmin[i], new Date(tglLahir[i])));
        }
    }

    @Override
    public void login(String no, String password) {
        indexLogin = Fahry07172_AllObjectModel.adminModel.cek(no, password);
    }

    public Fahry07172_AdminEntity adminEntity() {
        return Fahry07172_AllObjectModel.adminModel.showDataAdmin(indexLogin);
    }

    public void updateIsVerified(int index, int indexSiswa, Fahry07172_SiswaEntity siswaEntity) {
        Fahry07172_AllObjectModel.daftarKendaraanSiswaModel.updateIsVerified(index, new Fahry07172_DaftarKendaraanSiswaEntity(indexSiswa, siswaEntity, true));
    }

 

}
