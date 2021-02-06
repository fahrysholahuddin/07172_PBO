package Entity;

public class Fahry07172_AdminEntity extends Fahry07172_WargaAbstractEntity {
    private String password;
    
    public Fahry07172_AdminEntity(String no, String password, String nama,String alamat, String no_telp ){
        super(no, nama, alamat, no_telp);
        this.password = password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    
    @Override
    public String getNo(){
        return this.no;
    }
    
    public String getPassword(){
        return this.password;
    }
}
