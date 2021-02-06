
package Model;

import Entity.DaftarprakEntity07172;
import Entity.PraktikumEntity07172;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DaftarprakModel07172 implements ModelInterfaces07172 {
    private ArrayList<DaftarprakEntity07172>daftarprakArrayList;
    
    public DaftarprakModel07172(){
        daftarprakArrayList = new ArrayList<DaftarprakEntity07172>();
    }

    public void insertDataDaftarprak(DaftarprakEntity07172 daftarprak){
        daftarprakArrayList.add(daftarprak);
    }
    public ArrayList<DaftarprakEntity07172> getDaftarprakArrayList(){
        return daftarprakArrayList;
    }
    
    @Override
    public void view() {
        for(DaftarprakEntity07172 daftarprak : daftarprakArrayList){
            System.out.println("===================================");
            System.out.print("NPM : "+daftarprak.getPraktikan().getNpm()+"\n Nama"
                    +daftarprak.getPraktikan().getNama()+"\n password : "
                    +daftarprak.getPraktikan().getPassword()+"\n No. Telp :"
                    +daftarprak.getPraktikan().getNo_telp()+"\n Tanggal Lahir : "
                    +new SimpleDateFormat("dd-MM-yyyy").format(daftarprak.getPraktikan().getTglLahir())+"\n Praktikum : "+PraktikumEntity07172.nama[daftarprak.getIndexPrak()]+"\n IsVerivied : ");
            if(daftarprak.isVerified() == false){
                System.out.println("Belum Di Verifikasi Admin");
            }else{
                System.out.println("Telah di Verifikasi");
            }
            System.out.println("===================================");
        }
    }

    @Override
    public int cekDate(String npm, String password) {
        int loop = 0;
        if(daftarprakArrayList.size() == 0){
            loop = -1;//datakosong
        }else{
            for(int i=0; i<daftarprakArrayList.size(); i++){
                if(daftarprakArrayList.get(i).getPraktikan().getNpm().equals(npm)){
                    loop = i;
                    break;
                }else{
                    loop = -2;
                }
            }
        } return loop;
    }
    public DaftarprakEntity07172 showDaftarprak (int index){
        return daftarprakArrayList.get(index);
    }
    public void updateIsVerified(int index, DaftarprakEntity07172 daftarprakEntity){
        daftarprakArrayList.set(index, daftarprakEntity);
    }
}
