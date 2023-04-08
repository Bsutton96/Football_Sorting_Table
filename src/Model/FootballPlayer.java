//Created by Benjamin Sutton BKS5702@psu.edu
package Model;
import java.util.ArrayList;

public class FootballPlayer extends Person implements TableMember {
    
    private int number;
    private String position;
    
    public FootballPlayer() {
        
        super();
        number = 0;
        position = null;
    }
    
    public FootballPlayer(String name, Height Height, int weight, String hometown, String highSchool, int number, String position) {
        super(name, Height, weight, hometown, highSchool);
        this.number = number;
        this.position = position;
    
    }

    public int getNumber() {
    
        return number;
    
    }
    
    public void setNumber(int number) {
        
        this.number = number;
        
    }
    
    public String getPosition() {
    
        return position;
        
    }
    
    public void setPosition(String position) {
        
        this.position = position;
    }
    
    @Override
    public String toString() {
        return super.toString() + "FootballPlayer {Number= " + number + ", Position= " + position + "}";
    }
    
    public ArrayList<String> getAttributes() {

        ArrayList<String> tuple = new ArrayList<String>();
  

        tuple.add(Integer.toString(this.getNumber()));
        tuple.add(this.getPosition());
        tuple.add(this.getName());
        tuple.add(this.getHeight().toString());
        tuple.add(Integer.toString(this.getWeight()));
        tuple.add(this.getHometown());
        tuple.add(this.getHighSchool());
  
        return tuple;
    }
    
    public ArrayList<String> getAttributeNames() {

        ArrayList<String> attributenames = new ArrayList<String>();
  

        attributenames.add("Number");
        attributenames.add("Position");
        attributenames.add("Name");
        attributenames.add("Height");
        attributenames.add("Weight");
        attributenames.add("Hometown");
        attributenames.add("Highschool");
  
        return attributenames;
    }
    
    public String getAttribute(int n) {

        switch(n) {

            case 0: return Integer.toString(this.getNumber());
            case 1: return this.getPosition();
            case 2: return this.getName();
            case 3: return this.getHeight().toString();
            case 4: return Integer.toString(this.getWeight());
            case 5: return this.getHometown();
            case 6: return this.getHighSchool();
            default : return null;
        }
    }

    public String getAttributeName(int n) {

        switch(n) {

            case 0: return "Number";
            case 1: return "Position";
            case 2: return "Name";
            case 3: return "Height";
            case 4: return "Weight";
            case 5: return "Hometown";
            case 6: return "HighSchool";
            default : return null;
        }
    }
    
}
