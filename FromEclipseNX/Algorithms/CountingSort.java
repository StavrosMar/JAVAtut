
public class CountingSort {
	
	public static int[] counting_sort(int[] A, int maxA) {
		
		int   sizeA = A.length; 
		
		int[] Ind	 = new int[maxA+1];
		int[] Sorted = new int[sizeA];
		
		//Populate Ind - O(A.length)
		for (int i=0 ; i<sizeA ; i++) {
			
			Ind[A[i]]++;
			System.out.println("Increasing "+Integer.toString(A[i]) + " to " + Ind[A[i]]);
		}

		//Rearrange  O(Max(A))
		for(int i=1 ; i<= maxA; i++) {
			
			//System.out.println("Before i is : " + i + " and Ind[i] = " + Ind[i]);
			Ind[i] = Ind[i]+Ind[i-1];
			System.out.println("i is : " + i + " and Ind[i] = " + Ind[i]);
			
		}
		
		//Build Sorted O(A.length)
		for (int i=0; i < sizeA ; i++) {
			
			Ind[A[i]]--;
			Sorted[Ind[A[i]]] = A[i];
				
		}		
		
		//Return Sorted
		return Sorted;	
	}	
	
	
	
	// 
	public static void main(String [] args) {		
		
		int[] A = { 10, 4, 11, 20, 9, 10};
		
		int   maxA = 20;
		
		int[] Sorted = counting_sort(A,maxA);
		
		//Check sorted table
		for (int elem : Sorted ) {
					
			System.out.println("Sorted Element will be "+ elem  );
		}
		
	}

}
