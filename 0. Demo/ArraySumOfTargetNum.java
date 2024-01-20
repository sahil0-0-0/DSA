//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]

import java.util.Scanner ;
public class Demo {
    public static void main ( String[] args ) {
        Scanner n = new Scanner ( System.in ) ;
        System.out.print("Enter size of the array : " ) ;
        int size = n.nextInt() ;
        int[] a1 = new int[size] ;
        System.out.println("Enter array Elements : " ) ;
        for ( int i=0 ; i<size ; i++ ) {
            a1[i] = n.nextInt();
        }
        System.out.println("Array Elemets : " ) ;
        for ( int i=0 ; i<size ; i++ ) {
            System.out.println(a1[i]);
        }
        System.out.println("Enter target number : " ) ;
        int target = n.nextInt() ;
        
        System.out.println("Index value for the comput some of the number : " ) ;
        for ( int i=0 ; i<size ; i++ ) {
            for ( int j=0 ; j<size ; j++ ) {
                if ( a1[i] + a1[j] == target ) {
                    System.out.println(i);
                }
            }
        }
    }
}
