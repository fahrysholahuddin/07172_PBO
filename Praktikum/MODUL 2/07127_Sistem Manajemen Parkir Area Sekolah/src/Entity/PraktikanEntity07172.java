
package Entity;

import java.util.Date;

public class PraktikanEntity07172 extends MahasiswaAbstractEntity07172 {
    private String kelas;
    public PraktikanEntity07172(String npm, String password, String nama, String no_telp, Date tglLahir, String kelas){
        super(npm, password, nama, no_telp, tglLahir);
        this.kelas = kelas;
    }
    @Override
    public String getNpm(){
        return npm;
    }
    public String getkelas(){
    return kelas;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
}