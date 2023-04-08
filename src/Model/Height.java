//Created by Benjamin Sutton BKS5702@psu.edu
package Model;

public class Height {
    
    private int feet;
    
    private int inch;
    
        public Height() {
        
        //No Parameter
        
        feet = 0;
        
        inch = 0;
    }
    
    Height(int feet, int inch) {
        
        //Full Parameter
        
        this.feet = feet;
        
        this.inch = inch;
}
    
    public int getFeet() {
        
        return feet;
        
    }    
    
    public int getInch() {
        
        return inch;
        
    }
    
    public void setFeet(int feet){
        
        this.feet = feet;
        
    }
    
    public void setInches(int inch){
        
        this.inch = inch;
        
    }
    
    
    @Override
    public String toString(){
        
        return feet + "'" + inch + '"';
    }
    
}
