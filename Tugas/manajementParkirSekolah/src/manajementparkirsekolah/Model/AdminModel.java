package manajementparkirsekolah.Model;

import Entity.AdminEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class AdminModel implements ModelInterfaces {
    private ArrayList<AdminEntity> adminEntityArrayList;

public AdminModel (){
adminEntityArrayList = new ArrayList <AdminEntity>();
}
public void insertAdmin (AdminEntity admin){
    adminEntityArrayList.add(admin);
}
@Override
public void view(){
    for (AdminEntity adminEntity : adminEntityArrayList){
        System.out.print(adminEntity.getNo());
        System.out.print(adminEntity.getNama());
        System.out.print(adminEntity.getPassword());
        System.out.print(adminEntity.getNo_telp());
            System.out.println();
    }
}
public int cek(String no,String password){
        int loop = 0;
        for (AdminEntity adminEntity : adminEntityArrayList){
            if (adminEntity.getNo().equals(no) &&  adminEntity.getPassword().equals(password)){
                break;
} else {
    loop ++;
        }
    }
    return loop;
}
public AdminEntity showDataAdmin(int index){
    return adminEntityArrayList.get(index);
    }
}