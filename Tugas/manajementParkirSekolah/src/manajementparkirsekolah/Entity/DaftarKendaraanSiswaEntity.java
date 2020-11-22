package Entity;

public class DaftarKendaraanSiswaEntity {
    private SiswaEntity siswa;
    private boolean isVerified;
    private int indexKendaraan;
    
public DaftarKendaraanSiswaEntity(int indexKendaraan,SiswaEntity siswa,boolean isVerified) {
    this.siswa = siswa;
    this.isVerified = isVerified;
    this.indexKendaraan = indexKendaraan;
}
public SiswaEntity getSiswa (){
    return siswa;
}
public void setSiswa(SiswaEntity siswa){
    this.siswa = siswa;
}
public boolean isVerified(){
    return isVerified;
}
public void setVerified (boolean verified) {
    isVerified = verified;
}
public int getIndexKendaraan() {
    return indexKendaraan;
}
public void setIndexKendaraan(int indexKendaraan){
    this.indexKendaraan = indexKendaraan;
}
}
