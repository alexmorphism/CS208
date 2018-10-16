/**
 * Hiker.java
 * @author a_castro4
 * 
 * This is the Hiker class. It provides basic information about a hiker, name and age.
 */
public class Hiker {
    private String name;
    private int age;
    
    public Hiker(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setAge(int a){
        age = a;
    }
    
   public String toString(){
        return "Hiker: " + name + ". Age: " + age +"\n";
    }
    
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        
        Hiker other = (Hiker) obj;  
        return name.equals(other.name) && age == other.age;
    }
    
    
}
