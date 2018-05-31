public class HelloWorld{

// Does not work - I DONT KNOW WHY


public class Quick3way
{
    
    private static void exch(int[] a, int inda, int indb) {
        
         int temp = a[inda];
        a[inda] = a[indb];
        a[indb] = temp;
    }
    
    private static void sort(Comparable[] a, int lo, int hi)
    { // See page 289 for public sort() that calls this method.
    if (hi <= lo) return;
    int lt = lo, i = lo+1, gt = hi;
    Comparable v = a[lo];
    while (i <= gt)
    {
    int cmp = a[i].compareTo(v);
    if (cmp < 0) exch(a, lt++, i++);
    else if (cmp > 0) exch(a, i, gt--);
    else i++;
    } // Now a[lo..lt-1] < v = a[lt..gt] < a[gt+1..hi].
    sort(a, lo, lt - 1);
    sort(a, gt + 1, hi);
    }
    
    public static void main(String []args){
        
     int[] A = {90,112,789,8,234,726,9,2,-1,65,7,76,0,65,89};
        
        
     }
    
}


     
}
