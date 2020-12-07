package Controller;
import Model.Fahry07172_JenisKendaraanModel;
import Entity.Fahry07172_JenisKendaraanEntity;
import java.util.Scanner;

public class Fahry07172_JenisKendaraanController {
    Fahry07172_JenisKendaraanModel JenisKendaraan_model = new Fahry07172_JenisKendaraanModel();
    Scanner input = new Scanner(System.in) ;
    public void addJenisKendaraan () {
        System.out.print("Jenis Kendaraan = ");
        String jenis = input.next();
        System.out.print("Nomer Polisi = ");
        String nopol = input.next();
        JenisKendaraan_model.insert(new Fahry07172_JenisKendaraanEntity(jenis, nopol));
    }
}
