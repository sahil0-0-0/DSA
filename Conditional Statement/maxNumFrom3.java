//Find out max number out of three numbes 
import java.util.Scanner ;
public class Demo {
    public static void main ( String[] args ) {
        
        //Create an object to get input 
        Scanner n = new Scanner ( System.in ) ;
        
        //input three values from user 
        System.out.print("Enter first number : " ) ;
        int n1 = n.nextInt() ;
        System.out.print("Enter second number : " ) ;
        int n2 = n.nextInt() ;
        System.out.print("Enter third number : " ) ;
        int n3 = n.nextInt() ;
        
        //Find out max number 
        if ( n1 > n2 ) {
            if ( n1 > n3 ) {
                System.out.println(n1 + " is maximum . " ) ;
            } 
        } else if ( n2 > n3 ) {
            System.out.println(n2 + " is maximum . " ) ;
        } else {
            System.out.println(n3 + " is maximum . " ) ;
        }
        
    }
}
