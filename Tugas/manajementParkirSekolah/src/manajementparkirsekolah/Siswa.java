package manajementparkirsekolah;
import java.util.Date;
public class Siswa {
    String nis,nama,alamat,nopol;
    Date tanggal;
    public Siswa (String nis,String nama,Date tanggal, String alamat){
        this.nis=nis;
        this.nama=nama;
        this.tanggal=tanggal;
        this.alamat=alamat;
        }
    String getNis(){
        return this.nis;    
    }
    String getNama(){
        return this.nama;
    }
    Date getTanggal(){
        return this.tanggal;
    }
    String getAlamat(){
        return this.alamat;
    }
}

