//import header file to get input value from user
import java.util.Scanner ;
public class Demo {
    public static void main( String[] args ) {
        
        //create an onject ( n ) to get value from user 
        Scanner n = new Scanner( System.in ) ;
        
        //Boolean value
        //Default : False
        //Size : 1 bit
        //Example : True or False
        System.out.print("Enter boolean value : " ) ;
        boolean myBoolean = n.nextBoolean() ;
        
        //Byte value
        //Default : 0 
        //Size : 8 bits
        //Range : -128 to 127 
        System.out.print("Enter byte value : " ) ;
        byte myByte = n.nextByte() ;
        
        //Char value
        //Defalut : \u0000
        //Size : 16 bits
        //Example : 'a' , '\n' , '\101' , '\u0041'
        //Range : 0 to 255
        System.out.print("Enter char value : " ) ;
        char myChar = n.next().charAt(0) ;
        
        //Short value
        //Default : 0 
        //Size : 16 bits 
        //Range : -32768 to 32767
        System.out.print("Enter short value : " ) ;
        short myShort = n.nextShort() ;
        
        
        //Integer value
        //Default : 0
        //Size : 32 bits
        //Example : -5 , -1 , 0 , 2 , 7
        //Range : -2,147,483,648 to 2,147,483,647
        System.out.print("Enter integer value : " ) ;
        int myInt = n.nextInt() ;
        
        //Long value 
        //Default : 0 
        //Size : 64 bits 
        //Example : -2L , -1L , 0L , 1L , 2L 
        //Range : -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.print("Enter long value : " ) ;
        long myLong = n.nextLong() ;
        
        
        //Float value
        //Default : 0.0
        //Size : 32 bits
        //Example : 12.0 , 52.15 , -15.87
        //Range : upto 7 Decimal digits 
        System.out.print("Enter float value : " ) ;
        float myFloat = n.nextFloat() ;
        
        //Double value
        //Default : 0.0
        //Size : 64 bits 
        //Example : 12.0 , 52.15 , -15.87
        //Range : upto 16 Decimal digits
        System.out.print("Enter double value : " ) ;
        double myDouble = n.nextDouble() ;               
                
        //String value
        //Default : null
        System.out.print("Enter String value : " ) ;
        String myString = n.nextLine() ;
        
        System.out.println("Boolean : " + myBoolean ) ;
        System.out.println("Byte : " + myByte ) ;
        System.out.println("Char : " + myChar ) ;
        System.out.println("Short : " + myShort ) ;
        System.out.println("Integer : " + myInt ) ;
        System.out.println("Long integer : " + myLong ) ;
        System.out.println("Float : " + myFloat ) ;
        System.out.println("Double : " + myDouble ) ;
        System.out.println("String : " + myString ) ;
    }
}