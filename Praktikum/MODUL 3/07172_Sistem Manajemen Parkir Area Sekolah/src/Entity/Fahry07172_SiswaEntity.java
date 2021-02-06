package Entity;

public class Fahry07172_SiswaEntity extends Fahry07172_WargaAbstractEntity{
    private String password,NPM;
    
    public Fahry07172_SiswaEntity(String no,String nama, String alamat, String no_telp, 
            String password, String NPM){
        super(no, nama, alamat, no_telp);
        this.password = password;
        this.NPM = NPM;
    }
    public Fahry07172_SiswaEntity(){
        
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    public String getNPM(){
        return this.NPM;
    }
    public void setNPM(String NPM){
        this.NPM = NPM;
    }
    
    @Override
    public String getNo(){
        return this.no;
    }
    
    public String getPassword(){
        return this.password;
    }
}