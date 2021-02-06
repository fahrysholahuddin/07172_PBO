package Controller;
import java.util.ArrayList;
import Model.Fahry07172_AdminModel;
import Entity.Fahry07172_AdminEntity;


public class Fahry07172_AdminController {
     public Fahry07172_AdminModel admin_m;
   
  
    public Fahry07172_AdminController() {
        admin_m = new Fahry07172_AdminModel(); 
    }

    public ArrayList<Fahry07172_AdminEntity> getListAdmin(){
       return admin_m.getAdmin();
    }
     public void DataAdmin() {
        
       String no []      = {"01","02"};
       String nama []    = {"Petugas_1","Petugas_2"};
       String pass []    = {"01","02"};
       String alamat []  = {"surabaya","surabaya"};
       String no_telp [] = {"111","222"};
        for(int i = 0; i < no.length; i++) {
            admin_m.insert(new Fahry07172_AdminEntity(no[i],pass[i],nama [i],alamat [i],no_telp [i]));
        }
    }
}
