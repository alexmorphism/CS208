/**
 * Hiker.java
 * @author a_castro4
 * 
 * This is the Hiker class. It provides basic information about a hiker, name and age.
 */
public class Hiker {
    private String name;
    
    public Hiker(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    
    public void setName(String n){
        name = n;
    }
    
   public String toString(){
        return name + "\n";
    }
    
    public boolean equals(Object obj){
        if (obj == this) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()){ 
            Hiker other = (Hiker) obj;  
            return name.equals(other.name);
        } else{
            return false;
        }
    }
    
    
}
