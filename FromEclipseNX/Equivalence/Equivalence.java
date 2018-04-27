package Equivalence;


/** This is a class to verify the features of equals operator 
 * @author Stavros Marinis
 *
 */
public class Equivalence {
	
	
	public static void main(String [] args) {
		
		//Object Equality
			//Verdict : False | as they are not pointing to the same object
			//C++ : It would return True
	
		ChildObject obj1 = new ChildObject("stringieto");
		ChildObject obj2 = new ChildObject("stringieto");

		System.out.println("Object Equivalence | equals :"+obj1.equals(obj2));	
		System.out.println("Object Equivalence | == :"+(obj1==obj2));
		
		// String Equality
			// Verdict : True | they do not have to point to the same object 
			//C++ : It would return True
		String str1 = new String();
			   str1 = "stavros";
			   
		String str2 = new String();
			   str2 = "stavros";
		
		System.out.println(str1 == str2 );
		System.out.println(str1.equals(str2));
		
		
	    //Object Cloning
				
		
		
	}
	

}
