package Controller;
import manajementparkirsekolah.Model.JenisKendaraanModel;
import Entity.JenisKendaraanEntity;
import java.util.Scanner;

public class JenisKendaraanController {
    JenisKendaraanModel JenisKendaraan_model = new JenisKendaraanModel();
    Scanner input = new Scanner(System.in) ;
    public void addJenisKendaraan () {
        System.out.print("Jenis Kendaraan = ");
        String jenis = input.next();
        System.out.print("Nomer Polisi = ");
        String nopol = input.next();
        JenisKendaraan_model.insert(new JenisKendaraanEntity(jenis, nopol));
    }
}
