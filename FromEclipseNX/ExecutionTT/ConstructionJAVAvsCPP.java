package ExecutionTT;

public class ConstructionJAVAvsCPP {
    
		    
		  private static class class1 {
		        
		      public class1() { 
		          
		          System.out.println("Calling constructor");
		        }
		        
		    }
		    
		    
		    public static void main (String []args) {
		        
		    	// No constructor calling like that - in C++ it would run constructor
		    	System.out.println("Without new");
		    	class1 b;
		    	
		    	// This is where the object is created - unlike C++
		        System.out.println("Without new");
		        class1 a = new class1();
		        
		    }
		 
	
	
}
