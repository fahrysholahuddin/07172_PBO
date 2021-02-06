package Model;

import Entity.Fahry07172_AdminEntity;
import java.util.ArrayList;
public class Fahry07172_AdminModel implements Fahry07172_ModelInterfaces{
     private ArrayList<Fahry07172_AdminEntity> Admin;
    
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
}
