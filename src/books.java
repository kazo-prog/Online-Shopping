
public class books extends product implements price {
    public void name(){
    super.nameprd("fire and blood");
    
    }
    
    
    protected String writer;
    protected String genre;

   public void genre() {
     
    }

    
    public void changecurency() {
        throw new UnsupportedOperationException("15$"); 
    
    }
    
    public void changetodinar() {
        throw new UnsupportedOperationException("25 dinars"); 
    
    
    }

    
    public void discountprice() {
        
        throw new UnsupportedOperationException("black friday discaount"); 
    }
     private electronics bk;
    books(electronics bk){
    bk.publisher();
    
    
    }
}
