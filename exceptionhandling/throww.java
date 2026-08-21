package exceptionhandling;
//throw 5 :The throw keyword is used to explicitly throw an exception in Java according to our requirement. It can be used to throw both checked and unchecked exceptions. When an exception is thrown using the throw keyword, the normal flow of the program is disrupted, and the control is transferred to the nearest catch block that can handle that specific type of exception..


// public class throww {
    
//     public static void main(String[] args) {
        
//         try {
//             int a = 10;
//             int b = 0;

//             if (b == 0) {
//                 throw new ArithmeticException("Division by zero is not allowed.");
//             }

//             System.out.println(a / b);
//         } catch (ArithmeticException e) {
//             System.out.println("Error: " + e.getMessage());
//         }

//         System.out.println("Program Ends");
//     }
    
// }



//OUTPUT:
//Error: Division by zero is not allowed.
//Program Ends





//  IllegalArgumentException is more appropriate than ArithmeticException because the input value is invalid.
// class throww {
    
//     public static void main(String[] args) {

//         int marks = 120;

//         if (marks > 100 || marks < 0) {
//             throw new IllegalArgumentException("Invalid marks.");
//         }

//         System.out.println("Marks Accepted");

//     }    
// }
//OUTPUT:
//Exception in thread "main" java.lang.IllegalArgumentException: Invalid marks.

//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx



//same code but with ArthemeticException instead of IllegalArgumentException


// class throww {
    
//     public static void main(String[] args) {

//         int marks = 120;

//         if (marks > 100 || marks < 0) {
//             throw new ArithmeticException("Invalid marks.");
//         }

//         System.out.println("Marks Accepted");

//     }    
// }
//OUTPUT:
//Exception in thread "main" java.lang.ArithmeticException: Invalid marks.


















// same code but with try catch block to handle the exception and print the message instead of terminating the program.
// class throww {
    
//     public static void main(String[] args) {

//         int marks = 120;

//         try {
//             if (marks > 100 || marks < 0) {
//                 throw new IllegalArgumentException("Invalid marks.");
//             }
//             System.out.println("Marks Accepted");
//         } catch (IllegalArgumentException e) {
//             System.out.println("Error: " + e.getMessage());
//         }

//         System.out.println("Program Ends");
//     }    
// }
//OUTPUT:
//Error: Invalid marks.
//Program Ends





















