import java.util.Scanner ;
public class Demo {
    public static void main ( String[] args ) {
        Scanner n = new Scanner(System.in) ;
        System.out.print("Enter size of the array : " ) ;
        int size = n.nextInt() ;
        String[] strArr = new String[size + 1] ;
        System.out.println("\nEnter String Array elements : " ) ;
        for ( int i=0 ; i<=size ; i++ ) {
            strArr[i] = n.nextLine() ;
        }
        System.out.println("Array elemets : " );
        for ( String str : strArr ) {
            System.out.println(str);
        }
    }
}