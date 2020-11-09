/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07127_sistem.manajemen.parkir.area.sekolah;

import java.util.Date;

/**
 *
 * @author yogi
 */
public class Yogi07127_SiswaEntity {
    String Yogi07127_nama,Yogi07127_password,Yogi07127_notelp,Yogi07127_kelas,Yogi07127_alamat;
    Date Yogi07127_TanggalLahir;
    int Yogi07127_nis;
    int indexkendaraan;

    public Yogi07127_SiswaEntity(String Yogi07127_nama, String Yogi07127_password, String Yogi07127_notelp, String Yogi07127_kelas, String Yogi07127_alamat, Date Yogi07127_TanggalLahir, int Yogi07127_nis, int indexkendaraan) {
        this.Yogi07127_nama = Yogi07127_nama;
        this.Yogi07127_password = Yogi07127_password;
        this.Yogi07127_notelp = Yogi07127_notelp;
        this.Yogi07127_kelas = Yogi07127_kelas;
        this.Yogi07127_alamat = Yogi07127_alamat;
        this.Yogi07127_TanggalLahir = Yogi07127_TanggalLahir;
        this.Yogi07127_nis = Yogi07127_nis;
        this.indexkendaraan = indexkendaraan;
    }

    Yogi07127_SiswaEntity(String Yogi07127_nama, String Yogi07127_pass, String Yogi07127_notelp, String Yogi07127_kelas, String Yogi07127_alamat, String Yogi07127_nis, int Yogi07127_kendaraan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getYogi07127_nama() {
        return Yogi07127_nama;
    }

    public String getYogi07127_password() {
        return Yogi07127_password;
    }

    public String getYogi07127_notelp() {
        return Yogi07127_notelp;
    }

    public String getYogi07127_kelas() {
        return Yogi07127_kelas;
    }

    public String getYogi07127_alamat() {
        return Yogi07127_alamat;
    }

    public Date getYogi07127_TanggalLahir() {
        return Yogi07127_TanggalLahir;
    }

    public int getYogi07127_nis() {
        return Yogi07127_nis;
    }

    public int getIndexkendaraan() {
        return indexkendaraan;
    }

    
    

    Object getnis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getPassword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

}
