package Project;

import Entity.*;
import Model.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main07172 {
    private static AslabModel07172 aslabModel = new AslabModel07172();
    private static Scanner input = new Scanner(System.in);
    private static PraktikanModel07172 praktikanModel = new PraktikanModel07172();
    private static DaftarprakModel07172 daftarprakModel = new DaftarprakModel07172();
    private static int pilPrak;
    static int cekpraktikan;
    static int cekAslab;
    
    public static void main(String[] args){
        int loop = 0;
        dataAslab();
        
        do{
            int pilih = 0;
            System.out.print("Selamat Datang di Laboratorium Informatika ITATS !!"+
                    "\n 1. Login"+
					"\n 2. Daftar Praktikan"+
					"\n 0. Stop"+
					"\n Masukkan Pilihan Anda : ");
					pilih = input.nextInt();
					if(pilih == 1){
						int pilLogin = 0;
						System.out.print(" 1. Login Aslab" + "\n 2. Login Praktikan " + "\n Pilih : ");
                                                pilLogin = input.nextInt();
						if(pilLogin == 1){
							loginAdmin();
						}else{
							login();
						}
					}else if (pilih == 2){
						register();
					}else if (pilih == 3){
						aslabModel.view();
					}else if (pilih == 4){
						
					}else{
						break;
					}
            
            
        }while (loop!=1);
    }
	
	static void dataAslab(){
		String npmAslab[] = {"01","02","03","04","05","06","07"};
		String passwordAslab[] = {"01","02","03","04","05","06","07"};
		String namaAslab[] = {"Michael","Alan","Odil","Fitria","Sita","Eric","Fernanda"};
                String notelpAslab[] = {"01","02","03","04","05","06","07"};
		String tglLahirAslab[] ={"04/05/2000","01/12/2000","03/3/2000","23/06/2000","11/7/2000","13/9/2000","22/12/2000"};
		String laboratorium[] ={"RPL","SO","BASPROG","BASPROG","SO","RPL","RPL"};
		for(int i = 0;i<npmAslab.length; i++){
			aslabModel.insertAslab(new AslabEntity07172(npmAslab[i],passwordAslab[i],namaAslab[i],notelpAslab[i],new Date(tglLahirAslab[i]),laboratorium[i]));
		}
	}
        
	static void register(){
		System.out.print("Input NPM = ");
		String npm = input.next();
		System.out.print("Input nama = ");
		String nama = input.next();
		System.out.print("Input Password = ");
		String pass = input.next();
		System.out.print("Input notelp = ");
		String notelp = input.next();
		System.out.print("Input Tanggal Lahir dd/mm/yyyy = ");
                Date tanggal = new Date(input.next());
                System.out.print("Kelas = ");
                String kelas = input.next();
                praktikanModel.insert(new PraktikanEntity07172(npm,pass,nama,notelp,tanggal,kelas));
        }
        
        static void login(){
            System.out.print("NPM  : ");
            String npm = input.next();
            System.out.print("Password : ");
            String password = input.next();
            cekpraktikan = praktikanModel.cekData(npm, password);
            System.out.print("Selamat datang "+praktikanModel.getPraktikanEntityArrayList(cekpraktikan).getNama());
            int cekpraktikum = daftarprakModel.cekDate(npm, password);
            if(cekpraktikum == -1){
                System.out.println("\nAnda Belum Daftar Praktikum");
                daftarPrak();
            }else if(cekpraktikum == -2){
                System.out.println("\nAnda Belum Daftar Praktikum");
                daftarPrak();
            }else {
                System.out.println("\nNPM = "+daftarprakModel.showDaftarprak(cekpraktikan).getPraktikan().getNpm());
                System.out.println("No Telp = "+daftarprakModel.showDaftarprak(cekpraktikan).getPraktikan().getNo_telp());
                System.out.println("Praktikum = "+PraktikumEntity07172.nama[daftarprakModel.showDaftarprak(cekpraktikan).getIndexPrak()]);
                System.out.println("IsVrefied = "+daftarprakModel.showDaftarprak(cekpraktikan).isVerified());
            }
        }
        
        static void daftarPrak(){
            System.out.println("Pilih Praktikum :");
            for(int i = 0; i<PraktikumEntity07172.nama.length;i++){
                System.out.println(i+". "+PraktikumEntity07172.nama[i]);
            }
            System.out.print("Pilih Praktikum : ");
            pilPrak = input.nextInt();
            daftarprakModel.insertDataDaftarprak(new DaftarprakEntity07172(pilPrak,praktikanModel.getPraktikanEntityArrayList(cekpraktikan),false));
        }
        
        static void loginAdmin(){
            System.out.print("NPM : ");
            String npm = input.next();
            System.out.print("Password : ");
            String password= input.next();
            cekAslab = aslabModel.cekData(npm, password);
            
            System.out.println("Selamat datang "+aslabModel.showDataAslab(cekAslab).getNama());
            praktikanModel.view();
            updateIsVerified();
        }
        
        static void updateIsVerified(){
            System.out.print("NPM Praktikan = ");
            String npm = input.next();
            int index = daftarprakModel.cekDate(npm, null);
            daftarprakModel.updateIsVerified(index, new DaftarprakEntity07172(pilPrak, praktikanModel.getPraktikanEntityArrayList(index),true));
        }
}
