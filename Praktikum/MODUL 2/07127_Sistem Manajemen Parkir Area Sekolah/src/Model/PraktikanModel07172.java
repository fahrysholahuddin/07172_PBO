package Model;

import Entity.PraktikanEntity07172;
import java.util.ArrayList;

public class PraktikanModel07172 implements ModelInterfaces07172 {
    private ArrayList<PraktikanEntity07172> praktikanEntityArrayList;
    
    public PraktikanModel07172(){
        praktikanEntityArrayList = new ArrayList<PraktikanEntity07172>();    
    }
    
    public void insert(PraktikanEntity07172 praktikanEntity){
        praktikanEntityArrayList.add(praktikanEntity);
    }
    
    @Override
    public void view(){
        for(PraktikanEntity07172 praktikanEntity : praktikanEntityArrayList){
            System.out.println("==========================================");
            System.out.println("NPM :"+praktikanEntity.getNpm()
                    +"\n Nama : "+praktikanEntity.getNama()
                    +"\n Password : "+praktikanEntity.getPassword()
                    +"\n No_telp : "+praktikanEntity.getNo_telp()
                    +"\n Tanggal Lahir : "+praktikanEntity.getTglLahir());
            System.out.println("===========================================");
        }
    }
    
    public int cekData (String npm, String password){
        int loop = 0;
        while(!praktikanEntityArrayList.get(loop).getNpm().equals(npm) && !praktikanEntityArrayList.get(loop).getPassword().equals(password)){
            loop++;
        }
        return loop;
    }
    
    public PraktikanEntity07172 getPraktikanEntityArrayList(int index){
        return praktikanEntityArrayList.get(index);
    }

    @Override
    public int cekDate(String npm, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
