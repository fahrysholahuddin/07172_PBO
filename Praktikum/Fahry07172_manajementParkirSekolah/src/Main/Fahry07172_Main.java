package Main;

import Entity.Fahry07172_JenisKendaraanEntity;
import Controller.Fahry07172_AdminController;
import Controller.Fahry07172_AllObjectModel;
import Controller.Fahry07172_SiswaController;
import Entity.Fahry07172_KendaraanEntity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Fahry07172_Main {

    private static Scanner input = new Scanner(System.in);
    private static Fahry07172_AdminController admin = new Fahry07172_AdminController();
    private static Fahry07172_SiswaController siswa = new Fahry07172_SiswaController();

    private static int pilMerk;
    static String cekSiswa;

    public static void main(String[] args) {
        int loop = 0;
        admin.dataAdmin();
        do {
            int pilih = 0;
            System.out.print("** Sistem Manajemen Parkir **"
                    + "\n 1. Login"
                    + "\n 2. Daftar"
                    + "\n 0. Berhenti"
                    + "\n Masukkan Pilihan Anda :");
            pilih = input.nextInt();
            if (pilih == 1) {
                int pilLogin = 0;
                System.out.print("1. Login Admin "
                        + "\n2. Login Anggota"
                        + "\nPilih : ");
                pilLogin = input.nextInt();
                if (pilLogin == 1) {
                    loginAdmin();
                } else {
                    login();
                }
            } else if (pilih == 1) {
                int pilLogin = 0;
                System.out.print("1. Login Admin"
                        + "\n2. Login Siswa"
                        + "\nPilih : ");
                pilLogin = input.nextInt();
                if (pilLogin == 1) {
                    loginAdmin();
                } else {
                    login();
                }
            } else if (pilih == 2) {
                register();
            } else {
                break;
            }
        } while (loop != 1);
    }

    static void register() {
        try {
            System.out.print("Input No[NIS/NRP] = ");
            String no = input.next();
            System.out.print("Input Nama = ");
            String nama = input.next();
            System.out.print("Input Password = ");
            String pass = input.next();
            System.out.print("Input notelp = ");
            String notelp = input.next();
            System.out.print("Input Tgl Daftar dd/mm/yyyy = ");
            Date tanggal = new Date(input.next());
            System.out.print("Status [Siswa/Guru]= ");
            String status = input.next();
            siswa.insert(no, pass, nama, notelp, status, tanggal);
            System.out.print("Data Berhasil Di Simpan !!\n");
        } catch (Exception exception) {
            System.out.print("Format Pengisian Salah!!");
        }
    }

    static void login() {

        System.out.println("");
        System.out.print("No[NIS/NRP] : ");
        String no = input.next();
        System.out.print("Password : ");
        String password = input.next();
        siswa.login(no, password);
        System.out.println("\nSELAMAT DATANG " + siswa.siswaEntity().getNama() + " di SISTEM MANAJEMEN PARKIR");
        int cekData = siswa.cekDaftarKendaraanSiswa(siswa.siswaEntity().getNo());
        if (cekData == -1) {
            System.out.println("Masukan Data :");
            System.out.print("");
            daftarMerk();
        } else if (cekData == -2) {
            System.out.println("Masukan Data");
            System.out.print("");
            daftarMerk();
        } else {
            System.out.println("Nama =" + siswa.showDaftarKendaaraanSiswa(cekData).getSiswa().getNama());
            System.out.println("No = " + siswa.showDaftarKendaaraanSiswa(cekData).getSiswa().getNo());
            System.out.println("No Telp = " + siswa.showDaftarKendaaraanSiswa(cekData).getSiswa().getNo_telp());
            System.out.println("Merk = " + Fahry07172_KendaraanEntity.merk[siswa.showDaftarKendaaraanSiswa(cekData).getIndexKendaraan()]);
            System.out.println("isVerified = " + siswa.showDaftarKendaaraanSiswa(cekData).isVerified());
        }

    }

    static void daftarMerk() {
        System.out.println("Pilih Merk = ");
        for (int i = 0; i < Fahry07172_KendaraanEntity.merk.length; i++) {
            System.out.println(i + ". " + Fahry07172_KendaraanEntity.merk[i]);
        }
        System.out.print("Pilih Merk = ");
        pilMerk = input.nextInt();
        siswa.daftarSiswa(pilMerk, siswa.getData(), false);
    }

    static void loginAdmin() {
        System.out.print("No : ");
        String no = input.next();
        System.out.print("Password :");
        String password = input.next();
        admin.login(no, password);
        System.out.print("");
        System.out.println("Selamat Datang " + admin.adminEntity().getNama() + " Selamat Bertugas!!!");
        System.out.print("");

        System.out.println("**MENU ADMIN**");
        System.out.print(" Verifikasi Data Parkir:");
        updateIsverified();

    }

    static void updateIsverified() {
        System.out.print("No [NIS/NRP] = ");
        String no = input.next();
        System.out.print("Data DiVerifikasi");
        System.out.print("");
        int index = Fahry07172_AllObjectModel.daftarKendaraanSiswaModel.cek(no, null);
        admin.updateIsVerified(index, siswa.showDaftarKendaaraanSiswa(index).getIndexKendaraan(), siswa.showDaftarKendaaraanSiswa(index).getSiswa());
    }
}
