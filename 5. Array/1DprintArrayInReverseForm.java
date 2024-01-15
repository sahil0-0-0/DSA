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
        System.out.println("Odd number from the Array : " ) ;
        for ( int i=size-1 ; i>=0 ; i-- ) {
            System.out.print(ar[i] + " " );
        }
    }
}
