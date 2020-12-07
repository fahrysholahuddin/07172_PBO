package Entity;

import java.util.Date;
public class Fahry07172_SiswaEntity extends Fahry07172_WargaSekolahAbstractEntity   {
    public Fahry07172_SiswaEntity(String no,String password,String nama,String no_telp,String status,Date TglDaftar){
        super(no,password,nama,no_telp,status,TglDaftar);
    }
    @Override
    public String getNo(){
        return no;
    }
}
