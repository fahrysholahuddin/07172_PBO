package Model;

import Entity.SiswaEntity;
import java.util.ArrayList;
import java.util.Scanner;
public class SiswaModel implements ModelInterfaces {
    private ArrayList<SiswaEntity> siswaEntityArrayList;
    private static Scanner input = new Scanner(System.in);
    public SiswaModel (){
        siswaEntityArrayList = new ArrayList <SiswaEntity>();
    }
    public void insert (SiswaEntity siswaEntity){
        siswaEntityArrayList.add(siswaEntity);
    }
    @Override
    public void view(){
        if(siswaEntityArrayList.size()!=0){
        for(SiswaEntity siswaEntity : siswaEntityArrayList){
            System.out.println("===============================================");
            System.out.println("No : "+siswaEntity.getNo()+"\n Nama : "+siswaEntity.getNama ()+"\n Password :"+siswaEntity.getPassword()+"\n No.Telp :"+siswaEntity.getNo_telp()+"\n Status :"+siswaEntity.getStatus()+"\n Tanggal Daftar :"+siswaEntity.getTglDaftar());
            System.out.println("===============================================");
            }
        }else {
            System.out.println("Data Kosong");
        }
        }
    @Override
    public int cek (String no,String password){
        int loop = 0;
        while (!siswaEntityArrayList.get(loop).getNo().equals(no)&&!siswaEntityArrayList.get(loop).getPassword().equals(password)){
            loop++;
        }
        return loop;
    }
    public SiswaEntity getSiswaEntityArrayList (int index){
        return siswaEntityArrayList.get(index);
    }
    public void delete(){
        System.out.print("Pilih Index yang Akan dihapus : ");
        int pilIndex = input.nextInt();
        siswaEntityArrayList.remove(pilIndex);
    }
}
