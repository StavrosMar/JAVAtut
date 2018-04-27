
/** This is a class to verify regionMatches function for Strings
 *  and function calls inside the method 
 * @author Stavros Marinis
 *
 */

public class StringTests {
	
	//Instance method - i.e. not static so we need an object to invoke it
	private void test_regionMatches() {
		
		String str1 = new String("EMMA_EXEC");
		String str2 = new String("EXEC");
		
		System.out.print("Return value: ");
		System.out.println(str1.regionMatches(5, str2, 0, 4));
		
	}
	
	//Static method - i.e. does not need an object to be called.
	private static void test_regionMatches_static() {
		
		String str1 = new String("EMMA_EXEC");
		String str2 = new String("EXEC");
		
		System.out.print("Return value: ");
		System.out.println(str1.regionMatches(5, str2, 0, 4)+"  (static)");
		
	}
	
	public static void main (String args[]) {
		
		//regionMatches function
		
		//1st way - call via the object
		StringTests strtest = new StringTests();
		strtest.test_regionMatches();
		
		//2nd way - call the static implementation
		test_regionMatches_static();
		
	};

}
