package manajementparkirsekolah;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class ManajementParkirSekolah {
int selectedMenu;
Scanner input = new Scanner(System.in);
int pil;
ArrayList <Siswa> datasiswa = new ArrayList();
ArrayList <Kendaraan> datakendaraan = new ArrayList();
    public static void main(String[] args) {
        ManajementParkirSekolah menu = new ManajementParkirSekolah();
        do{
        System.out.println("Selamt datang di Program Parkir Siswa");
        System.out.println("=== Menu Program ===");
        System.out.println("[1] Lihat Data");
        System.out.println("[2] Tambah Data");
        System.out.println("[3] Edit Data");
        System.out.println("[4] Hapus Data");
        System.out.println("[0] Keluar");
        System.out.println("---------------------");
        System.out.print("Pilih menu> ");
        menu.selectedMenu = menu.input.nextInt();
            switch (menu.selectedMenu){
                case 1:
                    
            menu.View();
            break;
                case 2:
            menu.Baru();
            break;
                case 3:
            menu.Edit();
            break;
                case 4:
            menu.Delete();
        }
        }while(menu.selectedMenu != 0);
    }
    
    void Baru(){
        System.out.print("Input NIS = ");
        String nis = input.next();
        System.out.print("Input Nama = ");
        String nama = input.next();
        System.out.print("Alamat = ");
        String alamat = input.next();
        System.out.print("Nomor Polisi = ");
        String nopol = input.next();
        System.out.print("Tanggal Masuk (dd/mm/yyyy) = ");
        Date tanggal = new Date(input.nextInt());
        System.out.print("Merek Kendaraan = ");
        String merek = input.next();
        System.out.print("Nama Pemilik = ");
        String nama_pemilik = input.next();
        datasiswa.add(new Siswa(nis,nama,tanggal,alamat));
        datakendaraan.add(new Kendaraan(nopol,merek,nama_pemilik));
        
    }
    
    void View(){
        for(int i=0;i<datasiswa.size();i++){
            int no=i+1;
        System.out.println("Data siswa ke "+no+" : ");
        System.out.println("NIS = "+datasiswa.get(i).getNis());
        System.out.println("Nama = "+datasiswa.get(i).getNama());
        System.out.println("Alamat  = "+datasiswa.get(i).getAlamat());
        System.out.println("Nomor Polisi = "+datakendaraan.get(i).getNopol());
        System.out.println("Tanggal Masuk = "+new SimpleDateFormat("dd-mm-yyyy").format(datasiswa.get(i).getTanggal()));
        System.out.println("Merek Kendaraan = "+datakendaraan.get(i).getMerekKendaraan());
        System.out.println("Nama Pemilik = "+datakendaraan.get(i).getNamaPemilik());
        }
    }
    void Edit(){
        boolean lanjutkanInput = true;
        int selectIndex;
        do{
        System.out.print("Pilih index data dirubah : ");
        selectIndex = input.nextInt();
        if ( selectIndex <= datasiswa.size() ){     
        System.out.print("Input NIS = ");
        String nis = input.next();
        System.out.print("Input Nama = ");
        String nama = input.next();
        System.out.print("Alamat = ");
        String alamat = input.next();
        System.out.print("Nomor Polisi = ");
        String nopol = input.next();
        System.out.print("Tanggal Masuk = ");
        Date tanggal = new Date(input.nextInt());
        System.out.print("Merek Kendaraan = ");
        String merek = input.next();
        System.out.print("Nama Pemilik = ");
        String nama_pemilik = input.next();
        datasiswa.set(selectIndex, new Siswa(nis,nama,tanggal,alamat));
        datakendaraan.set(selectIndex, new Kendaraan(nopol,merek,nama_pemilik));       
        }else {
            System.out.println("Inputan anda melebihi batas index data silahkan ulangi !");
        }
        }while (!lanjutkanInput);
          }
    
    void Delete(){
        System.out.print("Index data yang dihapus : ");
        int selectIndex = input.nextInt();
        datasiswa.remove(selectIndex);
        System.out.println("Index "+selectIndex+" berhasil dihapus");
    }
    
}

