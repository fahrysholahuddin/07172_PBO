package Entity;

import java.util.Date;

public class AslabEntity07172 extends MahasiswaAbstractEntity07172 {
    private String laboratorium;
    public AslabEntity07172(String npm, String password, String nama, String no_telp, Date tglLahir, String lab){
        super(npm, password, nama, no_telp, tglLahir);
        this.laboratorium = lab;
    }
    
    public String getNpm(){
        return npm;
    }
    
    public String getLaboratotium(){
        return laboratorium;
    }
    
    public void setLaboratorium(String laboratorium){
        this.laboratorium = laboratorium;
    }
}
