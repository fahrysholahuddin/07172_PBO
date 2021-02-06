package Entity;

import java.util.Date;

public abstract class MahasiswaAbstractEntity07172 {
    protected String npm, password, nama, no_telp;
    protected Date tglLahir;
    
    public MahasiswaAbstractEntity07172(String npm, String password, String nama, String no_telp, Date tglLahir) {
        this.npm = npm;
        this.password = password;
        this.nama = nama;
        this.no_telp = no_telp;
        this.tglLahir = tglLahir;
    }
    
    public MahasiswaAbstractEntity07172(){
}
    public abstract String getNpm();
    
    public void setNpm(String npm){
        this.npm = npm;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setnama(String nama){
        this.nama = nama;
    }
    
    public String getNo_telp(){
        return no_telp;
    }
    
    public void setNo_telp(String no_telp){
        this.no_telp = no_telp;
    }
    
    public Date getTglLahir(){
        return tglLahir;
    }
    
    public void setTglLahir(Date tglLahir){
        this.tglLahir = tglLahir;
    }
}
