package Model;

import Entity.Fahry07172_AdminEntity;
import java.util.ArrayList;
public class Fahry07172_AdminModel implements Fahry07172_ModelInterfaces{
     private ArrayList<Fahry07172_AdminEntity> Admin;
     int indexLogin = 0;
    public Fahry07172_AdminModel(){
        Admin = new ArrayList<>();
    }
    
    public ArrayList<Fahry07172_AdminEntity> getAdmin(){
       return Admin;
    }   

    @Override
    public void insert(Object x) {
        Admin.add((Fahry07172_AdminEntity) x);
    }

    @Override
    public void update(int index, Object x) {
        Admin.set(index ,(Fahry07172_AdminEntity) x);
    }

    @Override
    public void delete(int index) {
        Admin.remove(index);
    } 
    
    public int cekData (String npm, String password){
        int loop = 0;
        if(getAdmin().size()==0){
            loop=-1; //data kosong
        } else {
            for(int i=0 ; i<getAdmin().size();i++){
                if(getAdmin().get(i).getPassword().equals(password)){
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
    public Fahry07172_AdminEntity showDataAdmin(int index){
        return Admin.get(index);
}
}
