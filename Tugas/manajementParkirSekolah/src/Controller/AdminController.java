package Controller;
import java.util.ArrayList;
import Model.AdminModel;
import Entity.AdminEntity;


public class AdminController {
     public AdminModel admin_m;
   int indexLogin = 0;
  
    public AdminController() {
        admin_m = new AdminModel(); 
    }

    public ArrayList<AdminEntity> getListAdmin(){
       return admin_m.getAdmin();
    }
     public void DataAdmin() {
        
       String no []      = {"01","02"};
       String nama []    = {"Petugas_1","Petugas_2"};
       String pass []    = {"01","02"};
       String alamat []  = {"surabaya","surabaya"};
       String no_telp [] = {"111","222"};
        for(int i = 0; i < no.length; i++) {
            admin_m.insert(new AdminEntity(no[i],pass[i],nama [i],alamat [i],no_telp [i]));
        }
    }
     public int cekData (String npm, String password){
        int loop = 0;
        if(getListAdmin().size()==0){
            loop=-1; //data kosong
        } else {
            for(int i=0 ; i<getListAdmin().size();i++){
                if(getListAdmin().get(i).getPassword().equals(password)){
                    loop= i;
                    break;
                }else{
                    loop = -2;
                }
            }
        } return loop; 
    }
    public void login(String npm,String password){
        indexLogin = cekData(npm, password);
    }
    public AdminEntity adminEntity(){
         return admin_m.showDataAdmin(indexLogin);
}
}