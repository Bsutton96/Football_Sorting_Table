//Created by Benjamin Sutton Bks5702@psu.edu

package Model;

public class Person
{

   //bring the contents of your Person class from the first assignment

    private String name;
    private int weight;
    private String hometown;
    private String highSchool;
    private Height Height;
    
    public Person() {
    name = null;
    Height = null;
    weight = 0;
    hometown = null;
    highSchool = null;
    }

    Person(String name, Height Height, int weight, String hometown, String highSchool) {
        name = name;
        weight = weight;
        hometown = hometown;
        highSchool = highSchool;
        Height = Height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }
    
    public Height getHeight() {
        return Height;
    }
    
    public void setHeight(Height Height){
        this.Height = Height;
    }
    

    
    
    
    public String toString() {
        return "Person{" + "name=" + name + ", " + "height=" + Height + ", " + "weight=" + weight + ", " + "hometown=" + hometown + ", " + "highschool=" + highSchool + '}';
    }
    
}
