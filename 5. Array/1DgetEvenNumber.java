import java.util.Scanner ;
public class Demo {
    public static void main ( String[] args ) {
        Scanner n = new Scanner( System.in ) ;
        System.out.print("Enter size of the Array : ") ;
        int size = n.nextInt() ;
        int[] ar = new int[size] ;
        System.out.println("\nEnter Array elements : ");
        for ( int i=0 ; i<size ; i++ ) {
            ar[i] = n.nextInt() ;
        }
        System.out.println("Even number from the Array : " ) ;
        for ( int i=0 ; i<size ; i++ ) {
            if ( ar[i] % 2 == 0 ) {
                System.out.print(ar[i] + " ");
            }
        }
    }
}
