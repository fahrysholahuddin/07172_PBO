package Entity;

public class Fahry07172_DaftarKendaraanSiswaEntity {
    private Fahry07172_SiswaEntity siswa;
    private boolean isVerified;
    private int indexKendaraan;
    
public Fahry07172_DaftarKendaraanSiswaEntity(int indexKendaraan,Fahry07172_SiswaEntity siswa,boolean isVerified) {
    this.siswa = siswa;
    this.isVerified = isVerified;
    this.indexKendaraan = indexKendaraan;
}
public Fahry07172_SiswaEntity getSiswa (){
    return siswa;
}
public void setSiswa(Fahry07172_SiswaEntity siswa){
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
