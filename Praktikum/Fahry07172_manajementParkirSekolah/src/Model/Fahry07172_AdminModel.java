package Model;

import Entity.Fahry07172_AdminEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Fahry07172_AdminModel implements Fahry07172_ModelInterfaces {

    private ArrayList<Fahry07172_AdminEntity> adminEntityArrayList;

    public Fahry07172_AdminModel() {
        adminEntityArrayList = new ArrayList<Fahry07172_AdminEntity>();
    }

    public void insertAdmin(Fahry07172_AdminEntity admin) {
        adminEntityArrayList.add(admin);
    }


    @Override
    public int cek(String no, String password) {
        int loop = 0;
        for (Fahry07172_AdminEntity adminEntity : adminEntityArrayList) {
            if (adminEntity.getNo().equals(no) && adminEntity.getPassword().equals(password)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }

    public Fahry07172_AdminEntity showDataAdmin(int index) {
        return adminEntityArrayList.get(index);
    }
}
