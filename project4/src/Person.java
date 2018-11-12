/* Person.java
 * Alexandre Castro
 * CS208 data structures 11/12/18
 * project4
 * 
 * The purpose of the person class is provide objects of type Person.
 * A person have have only a first name.
 */

public class Person {
	private String name;
	
	public Person(){
		this.name = "generic";
	}
	
	public Person(String name){
		this.name = name;
	}
	
	/******** METHODS *********/
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String toString(){
		return "Name : " + name;
	}
	
	public boolean equals(Object obj){
		if(obj == this)  return true;
		if(obj == null)  return false;
		
		if(this.getClass() == obj.getClass()){
			Person other = (Person) obj;
			return name.equals(other.name);
		} else{
			return false;
		}
	}
	
} // end Person
