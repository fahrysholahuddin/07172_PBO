package Model;

import Entity.Fahry07172_SiswaEntity;
import java.util.ArrayList;
import java.util.Scanner;
public class Fahry07172_SiswaModel implements Fahry07172_ModelInterfaces {
    private ArrayList<Fahry07172_SiswaEntity> siswaEntityArrayList;
    private static Scanner input = new Scanner(System.in);
    public Fahry07172_SiswaModel (){
        siswaEntityArrayList = new ArrayList <Fahry07172_SiswaEntity>();
    }
    public void insert (Fahry07172_SiswaEntity siswaEntity){
        siswaEntityArrayList.add(siswaEntity);
    }
    @Override
    public void view(){
        if(siswaEntityArrayList.size()!=0){
        for(Fahry07172_SiswaEntity siswaEntity : siswaEntityArrayList){
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
    public Fahry07172_SiswaEntity getSiswaEntityArrayList (int index){
        return siswaEntityArrayList.get(index);
    }
    public void delete(){
        System.out.print("Pilih Index yang Akan dihapus : ");
        int pilIndex = input.nextInt();
        siswaEntityArrayList.remove(pilIndex);
    }
}
