package manajementparkirsekolah;
import java.util.Date;
public class kendaraan {
    String noPol,merekKendaraan,namaPemilik;
    Date tanggal;
    public kendaraan (String noPol,String merekKendaraan, String namaPemilik){
        this.noPol=noPol;
        this.merekKendaraan=merekKendaraan;
        this.namaPemilik=namaPemilik;
        }
    String getNopol(){
        return this.noPol;    
    }
    String getMerekKendaraan(){
        return this.merekKendaraan;
    }
    String getNamaPemilik(){
        return this.namaPemilik;
    }
}

