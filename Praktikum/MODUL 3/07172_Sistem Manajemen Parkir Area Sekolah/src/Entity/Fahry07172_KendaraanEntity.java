package Entity;

public class Fahry07172_KendaraanEntity {
    private String merk,tahunkendaraan,jenis,nopol;
    int indexpilkend;
    // Constructor
    public Fahry07172_KendaraanEntity(String merk,String jenis, String tahunkendaraan,
             String nopol,int indexpilkend){
        
        
        this.merk = merk;
        this.tahunkendaraan = tahunkendaraan;
        this.jenis = jenis;
        this.nopol = nopol;
        this.indexpilkend = indexpilkend;
  
    }

    
    public Fahry07172_KendaraanEntity(){
        
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setTahunkendaraan(String tahunkendaraan) {
        this.tahunkendaraan = tahunkendaraan;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setNopol(String nopol) {
        this.nopol = nopol;
    }

    public void setIndexpilkend(int indexpilkend) {
        this.indexpilkend = indexpilkend;
    }

    

    public String getMerk() {
        return merk;
    }

    public String getTahunkendaraan() {
        return tahunkendaraan;
    }

    public String getJenis() {
        return jenis;
    }

    public String getNopol() {
        return nopol;
    }

    public int getIndexpilkend() {
        return indexpilkend;
    }

    
    
}

    

