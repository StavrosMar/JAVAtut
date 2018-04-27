package ExecutionTT;
public class HelloWorld{

     public static void main(String []args){
 
    	
    	 Dog nik = new Dog("Snoop");
    	 
    	
    	       
    	 //Call chronicUnchanged
    	 chronicUnchanged(nik);
    	 System.out.println("ChronicUnchanged: " + nik.getName());
         
    	 //Call chronic
    	 nik.setName("Snoop");
    	 chronic(nik);
    	 System.out.println("Chronic : " + nik.getName());
    	 
     }
     
     
     public static void chronic(Dog snoop) {
         
         System.out.println(snoop.getName().equals("Snoop"));
         
         //snoop points to where it was initially called.
         snoop.setName("DoggyDog");
         
         snoop = new Dog("NateDogg");
         
     } 
     
     public static void chronicUnchanged(Dog snoop) {
         
         System.out.println(snoop.getName().equals("Snoop"));
         
         //Now snoop points to a new Dog instance
         snoop = new Dog("NateDogg");
         
         snoop.setName("DoggyDog");
         
     } 
     
    
}
