// ArrayList

import java.util.ArrayList ;
import java.util.Collections ;

public class Demo {
    public static void main ( String[] args ) {
        
        // Create an ArrayList
        ArrayList<Integer> arList = new ArrayList<Integer>() ;
        
        // Add elements into ArrayList 
        // Using .add( element ) Method
        arList.add(2) ;
        arList.add(5) ;
        arList.add(12) ;
        arList.add(7) ;
        arList.add(9) ;
        arList.add(21) ;
        
        // Print ArrayList
        System.out.println(arList);

        // Get Element from the ArrayList
        // Using .get( index_number ) method
        int getElm = arList.get(4) ;
        System.out.println("Element of the given index is " + getElm ) ;
        
        // Add new element in selected index 
        // Using .add( index_number , value ) 
        arList.add( 2 , 15 ) ;
        System.out.println(arList) ;
        
        // Change selected index value
        // Using .set( index_number , new_value ) 
        arList.set( 4 , 16 ) ;
        System.out.println(arList);
        
        // Delete or Remove selected index Element
        // Using .remove( index_number ) 
        arList.remove(4) ;
        System.out.println(arList) ;
        
        // Get size of the ArrayList
        // Using .size()
        int size = arList.size() ;
        System.out.println("Size : " + size ) ;
        
        // Sorting ArrayList
        // Using Collections.sort( arrayList_name )
        Collections.sort(arList) ;
        System.out.println("Sorting Array : " + arList ) ;
        
        
        // Print elements using Loop
        for ( int i=0 ; i<size ; i++ ) {
            System.out.print(arList.get(i) + " ");
        }
    }
}