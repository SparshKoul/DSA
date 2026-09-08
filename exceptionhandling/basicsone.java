package exceptionhandling;


//example1 

// public class basicsone {
//     public static void main(String[] args) {
//         int a = 20;
//         int b = 0;

//         System.out.println(a / b);
//         System.out.println("Done");

//         // This will throw an ArithmeticException because we are trying to divide by zero.
//         //done is never printed because the program terminates.
        
//     }
    
// }






//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx


//example2

// public class basicsone {

    
//     public static void main(String[] args) {
//         System.out.println("A");

//         int x = 10 / 0;

//         System.out.println("B");

//         //prints:

//         //A
//         //Exception in thread "main" java.lang.ArithmeticException: / by zero
//         //never prints B because the program terminates when the exception is thrown.
    
// }}



/**
 *  exception handling..
//  */
// public class basicsone {

//     public static void main(String[] args) {
//         System.out.println("A");

//         try {
//             int x = 10 / 0;
//         } catch (ArithmeticException e) {
//             System.out.println("Exception caught: " + e.getMessage());
//         }

//         System.out.println("B");
//         //outputs:
//         //A
//         //Exception caught: / by zero
//         //B
//         // This will be printed because the exception is caught and handled.
//     }
//}



//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//example 3



