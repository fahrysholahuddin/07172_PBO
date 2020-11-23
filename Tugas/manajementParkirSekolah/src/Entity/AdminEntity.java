package Entity;

import java.util.Date;

public class AdminEntity extends WargaSekolahAbstractEntity{
public AdminEntity(String no,String password,String nama,String no_telp,String status,Date TglDaftar){
    super(no,password,nama,no_telp,status,TglDaftar);
}

@Override
public String getNo() {
    return no;
    }
}
