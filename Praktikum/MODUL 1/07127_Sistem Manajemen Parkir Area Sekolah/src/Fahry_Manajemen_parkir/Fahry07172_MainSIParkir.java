
package Fahry_Manajemen_parkir;
import java.util.ArrayList;
import java.util.Scanner;

public class Fahry07172_MainSIParkir {
    ArrayList <Fahry07172_SiswaEntity> Fahry07172_dataSiswa = new ArrayList();
    ArrayList <Fahry07172_KendaraanEntity> Fahry07172_dataKendaraan = new ArrayList();
    Scanner Fahry07172_input = new Scanner(System.in);
    
    public static void main(String args[]) {
        System.out.print("SELAMAT DATANG DI SEKOLAH MAJU MUNDUR !! ");
        int Fahry07172_pil;
        Fahry07172_MainSIParkir fahry = new Fahry07172_MainSIParkir ();
        Scanner input = new Scanner(System.in);
        do{
           System.out.println(" ");
           System.out.println("***** MENU ***** ");
           System.out.println("1. Daftar");
           System.out.println("2. Login");
           System.out.println("3. Exit");
           System.out.println("Pilih = ");
           Fahry07172_pil= input.nextInt();
           switch(Fahry07172_pil){
               case 1:
                    fahry.Fahry07172_Daftar();
                    break;
               case 2:
                   System.out.println("NIS = ");
                   String Fahry07172_nis = input.next();
                   System.out.println("Password = ");
                   String Fahry07172_password = input.next();
                   fahry.Fahry07172_Login(Fahry07172_nis,Fahry07172_password);
           }
        }while(Fahry07172_pil != 3);
    }
    
    void Fahry07172_Daftar(){
        System.out.println("Input NIS = ");
        String Fahry07172_nis = Fahry07172_input.next();
        System.out.println("Input Nama = ");
        String Fahry07172_nama = Fahry07172_input.next();
        System.out.println("Input Password = ");
        String Fahry07172_password = Fahry07172_input.next();
        System.out.println("Input Alamat = ");
        String Fahry07172_alamat = Fahry07172_input.next();
        System.out.println("Input No Telepon = ");
        String Fahry07172_notelp = Fahry07172_input.next();
        
        Fahry07172_dataSiswa.add(new Fahry07172_SiswaEntity(Fahry07172_nis,Fahry07172_nama,Fahry07172_password,Fahry07172_alamat,Fahry07172_notelp));
        System.out.print("Data Berhasil Di Simpan !!\n");
    }
    
    void Fahry07172_Login(String Fahry07172_nis, String Fahry07172_password){
        boolean Fahry07172_cekLogin = false;
        int Fahry07172_j;
        
        for(Fahry07172_j=0;Fahry07172_j<Fahry07172_dataSiswa.size();Fahry07172_j++){
           
         if(Fahry07172_nis.equals(Fahry07172_dataSiswa.get(Fahry07172_j).Fahry07172_getNis()) && Fahry07172_password.equals(Fahry07172_dataSiswa.get(Fahry07172_j).Fahry07172_getPassword())){
             Fahry07172_cekLogin = true;
             break;
        }else{
             Fahry07172_cekLogin = true;
             break;
            }
        }
        
        //get index login
        if(Fahry07172_cekLogin){
            System.out.println("");
            System.out.println("Hallo "+Fahry07172_dataSiswa.get(Fahry07172_j).Fahry07172_getNama()+" Selamat Datang di Sekolah Maju Mundur!!");
            Fahry07172_MenuAwal();
        }else{
            System.out.print("Maaf Password atau ID SALAH!!");
        }
    }
    
    void Fahry07172_MenuAwal(){
        Fahry07172_MainSIParkir  fahry1 = new Fahry07172_MainSIParkir ();
        int Fahry07172_pilih;
        do{
             System.out.println("===== PILIHAN =====");
             System.out.println("1. Tambah ");
             System.out.println("2. Lihat ");
             System.out.println("3. Ubah ");
             System.out.println("4. Hapus ");
             System.out.println("5. Keluar ");
             System.out.println("Pilih : ");
             Fahry07172_pilih = Fahry07172_input.nextInt();
             
             switch(Fahry07172_pilih){
                case 1 :
                    Fahry07172_TambahData();
                    break;
                case 2 : 
                    Fahry07172_LihatData();
                    break;
                case 3 : 
                    Fahry07172_UbahData();
                    break;
                case 4 : 
                    Fahry07172_Hapus();
                    break;
                }  
             }while(Fahry07172_pilih != 5);

    }
    void Fahry07172_TambahData(){
        System.out.println("Masukkan Nis = ");
        String Fahry07172_nomer = Fahry07172_input.next();
        
        System.out.println("Masukkan Merk Kendaraan = ");
        String Fahry07172_merk = Fahry07172_input.next();
        
        System.out.println("Masukkan Nomer Polisi = ");
        String Fahry07172_nopol = Fahry07172_input.next();
        
        System.out.println("Masukkan Warna = ");
        String Fahry07172_warna = Fahry07172_input.next();
        
        
        Fahry07172_dataKendaraan.add(new Fahry07172_KendaraanEntity(Fahry07172_nomer, Fahry07172_merk, Fahry07172_nopol, Fahry07172_warna));
        System.out.println("Data Berhasil Disimpan !!\n");
    }
    
    void Fahry07172_LihatData(){
        if(Fahry07172_dataKendaraan.size()>0){
            int Fahry07172_noUrut = 0;
            for (int j = 0; j < Fahry07172_dataKendaraan.size(); j++) {
                Fahry07172_noUrut++;
                System.out.println("[Merk " + Fahry07172_noUrut + "]");
                System.out.println(Fahry07172_dataKendaraan.get(j).Fahry07172_getnomer());
                System.out.println(Fahry07172_dataKendaraan.get(j).Fahry07172_getmerk());
                System.out.println(Fahry07172_dataKendaraan.get(j).Fahry07172_getnopol());
                System.out.println(Fahry07172_dataKendaraan.get(j).Fahry07172_getwarna());
                System.out.println("-------------------------");
            }
        }else{
            System.out.println("Data Kosong");
        }
    }
    void Fahry07172_UbahData(){
        if(Fahry07172_dataKendaraan.size()>0){
            for (int j = 0; j < Fahry07172_dataKendaraan.size(); j++) {
                System.out.println("["+j+"] "+Fahry07172_dataKendaraan.get(j).Fahry07172_getmerk());
            }
             
            System.out.println("Pilih Index Kendaraan : ");
            int selectIndex = Fahry07172_input.nextInt();
            
            // Update            
            System.out.println("Masukkan Nomer : ");
            String Fahry07172_nomer = Fahry07172_input.next();

            System.out.println("Masukkan Merk : ");
            String Fahry07172_merk = Fahry07172_input.next();

            System.out.println("Masukkan Nomer Polisi : ");
            String Fahry07172_nopol = Fahry07172_input.next();

            System.out.println("Masukkan Warna Kendaraan = ");
            String Fahry07172_warna = Fahry07172_input.next();

            Fahry07172_dataKendaraan.set(selectIndex, new Fahry07172_KendaraanEntity(Fahry07172_nomer, Fahry07172_merk, Fahry07172_nopol, Fahry07172_warna));
            System.out.println("Data Berhasil Diubah !!\n");
        }else{
            System.out.println("Data Kosong\n");
        }
    }
    void Fahry07172_Hapus(){
        if(Fahry07172_dataKendaraan.size()>0){
            for (int j = 0; j < Fahry07172_dataKendaraan.size(); j++) {
                System.out.println("["+j+"] "+Fahry07172_dataKendaraan.get(j).Fahry07172_getmerk());
            }
            
            System.out.println("Pilih Index Kendaraan : ");
            int selectIndex = Fahry07172_input.nextInt();
            
            Fahry07172_dataKendaraan.remove(selectIndex);
            System.out.print("Data Berhasil Dihapus !!\n");
        }else{
            System.out.println("Data Kosong\n");
        }
    }
}
