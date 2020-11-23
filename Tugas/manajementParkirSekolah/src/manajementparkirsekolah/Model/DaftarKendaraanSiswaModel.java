package manajementparkirsekolah.Model;

import Entity.DaftarKendaraanSiswaEntity;
import Entity.KendaraanEntity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DaftarKendaraanSiswaModel implements ModelInterfaces {
    private ArrayList<DaftarKendaraanSiswaEntity> daftarKendaraanArrayList;
    public DaftarKendaraanSiswaModel(){
daftarKendaraanArrayList = new ArrayList<DaftarKendaraanSiswaEntity>();
    }
    public void insertDataDaftarKendaraan(DaftarKendaraanSiswaEntity daftarKendaraan){
        daftarKendaraanArrayList.add(daftarKendaraan);
    }
    public ArrayList<DaftarKendaraanSiswaEntity> getDaftarKendaraanArrayList(){
        return daftarKendaraanArrayList;
    }
    @Override
    public void view(){
        for(DaftarKendaraanSiswaEntity daftarKendaraan : daftarKendaraanArrayList){
            System.out.println("===============================================");
            System.out.print("No :"+daftarKendaraan.getSiswa().getNo()+
                    "\n Nama :"+daftarKendaraan.getSiswa().getNama()+
                    "\n Password :"+daftarKendaraan.getSiswa().getPassword()+
                    "\n No.Telp :"+daftarKendaraan.getSiswa().getNo_telp()+
                    "\n Tanggal Daftar :"+new SimpleDateFormat ("dd-MM-yyyy").format(daftarKendaraan.getSiswa().getTglDaftar())+
                    "\n Merk :"+KendaraanEntity.merk[daftarKendaraan.getIndexKendaraan()]+"\n IsVerified :");
            if (daftarKendaraan.isVerified()==false){
                System.out.println("Belum Terdaftar");
            } else{
                System.out.println("Telah Terdaftar");
            }
            System.out.println("===============================================");
        }
    }
    @Override
    public int cek (String no, String password){
        int loop = 0;
        if(daftarKendaraanArrayList.size()==0){
            loop=-1; //data kosong
        } else {
            for(int i=0 ; i<daftarKendaraanArrayList.size();i++){
                if(daftarKendaraanArrayList.get(i).getSiswa().getNo().equals(no)){
                    loop= i;
                    break;
                }else{
                    loop = -2;
                }
            }
        } return loop; 
    }
    public DaftarKendaraanSiswaEntity showDaftarKendaraan(int index){
        return daftarKendaraanArrayList.get(index);
    }
    public void updateIsVerified(int index,DaftarKendaraanSiswaEntity daftarKendaraanEntity){
        daftarKendaraanArrayList.set(index,daftarKendaraanEntity);
    }
}
