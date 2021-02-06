package Entity;

public class DaftarprakEntity07172 {
    private PraktikanEntity07172 pratikan;
    private boolean isVerified;
    private int indexPraktikum;
    
    public DaftarprakEntity07172(int indexPraktikum, PraktikanEntity07172 pratikan, boolean isVerified){
        this.pratikan = pratikan;
        this.isVerified = isVerified;
        this.indexPraktikum = indexPraktikum;
    }
    
    public PraktikanEntity07172 getPraktikan(){
        return pratikan;
    }
    
    public void setPratikan(PraktikanEntity07172 pratikan){
        this.pratikan = pratikan;
    }
    
    public boolean isVerified(){
        return isVerified;
    }
    
    public void setVerified(boolean verified){
        isVerified = verified;
    }
    
    public int getIndexPrak(){
        return indexPraktikum;
    }
    
    public void setIndexPrak(int indexPrak){
            this.indexPraktikum = indexPrak;
    }
}
