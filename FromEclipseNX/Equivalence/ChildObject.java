package Equivalence;

public class ChildObject extends Object {
	
	private String name;
	
	public ChildObject(String nom) {
		
		this.setName(nom);
	}
	
	public void setName(String a) {
		
		name = a;
		
	}
	
	public String getName() {
		
		return name;
		
	}

}
