package Model;

import Entity.AslabEntity07172;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class AslabModel07172 implements ModelInterfaces07172 {
    private ArrayList<AslabEntity07172> aslabEntityArrayList;
    
    public AslabModel07172(){
        aslabEntityArrayList = new ArrayList <AslabEntity07172>();
    }
    
    public void insertAslab(AslabEntity07172 aslab){
        aslabEntityArrayList.add(aslab);
    }
    
    @Override
    public void view(){
        for(AslabEntity07172 aslabEntity : aslabEntityArrayList){
            System.out.print(aslabEntity.getNpm());
            System.out.print(aslabEntity.getNama());
            System.out.print(aslabEntity.getPassword());
            System.out.print(aslabEntity.getNo_telp());
            System.out.print(new SimpleDateFormat("dd-MM-yy").format(aslabEntity.getTglLahir()));
        }
    }
    public int cekData(String npm, String password){
        int loop = 0;
        for(AslabEntity07172 aslabEntity : aslabEntityArrayList){
            if(aslabEntity.getNpm().equals(npm) && aslabEntity.getPassword().equals(password)){
                break;
            }else{
                loop++;
            }
        }
        return loop;
    }
    public AslabEntity07172 showDataAslab(int index){
        return aslabEntityArrayList.get(index);        
    }

    @Override
    public int cekDate(String npm, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
