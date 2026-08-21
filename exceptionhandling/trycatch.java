package exceptionhandling;
//try catch three :try-catch is used to handle exceptions so that the program doesn't terminate abruptly..

//try {
    // Code that may cause an exception
//}
//catch (ExceptionType e) {
    // Code to handle the exception
//}
//finally {
    // Code that will always execute, regardless of whether an exception occurred or not
//}





// public class trycatch {
//     public static void main(String[] args) {
//         try {
//             int a = 10;
//             int b = 2;
//             System.out.println(a / b);
//         }
//         catch (ArithmeticException e) {
//             System.out.println("Error");
//         }

//         System.out.println("Program Ends");
//     }
 
// }



//outputs:
//5
//Program Ends
//no type of exception is thrown in the try block, so the catch block is not executed. The program continues to execute normally and prints "Program Ends".







//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx




//only the first exception matters, if there are multiple exceptions in try block , only the first is caught and rest in terminated.

// class trycatch {
//     public static void main(String[] args) {
//         try {
//             int a = 10;
//             int b = 0;
//             System.out.println(a / b); // This will throw ArithmeticException
//             String str = null;
//             System.out.println(str.length()); // This will throw NullPointerException
//         } catch (ArithmeticException e) {
//             System.out.println("Arithmetic Exception caught: " + e.getMessage());
//         } catch (NullPointerException e) {
//             System.out.println("Null Pointer Exception caught: " + e.getMessage());
//         }

//         System.out.println("Program Ends");
//     }
// }



//outputs:
//Arithmetic Exception caught: / by zero
//Program Ends
















//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

//order of catch blocks matters, if the parent class is caught first, the child class will never be caught.

// class trycatch {
//     public static void main(String[] args) {
//         try {
//             int a = 10;
//             int b = 0;
//             System.out.println(a / b); // This will throw ArithmeticException
//         } catch (Exception e) { // Catching the parent class first
//             System.out.println("Exception caught: " + e.getMessage());
//         } catch (ArithmeticException e) { // This catch block will never be reached
//             System.out.println("Arithmetic Exception caught: " + e.getMessage());
//         }

//         System.out.println("Program Ends");
//     }
// }

//outputs:
//compiler error: "error: exception ArithmeticException has already been caught" because the parent class Exception is caught first, so the child class ArithmeticException will never be reached. The order of catch blocks matters, and the child class should be caught before the parent class.



// but what if we use only the parent class Exception in the catch block, then it will catch all the exceptions that are thrown in the try block, and the program will not terminate abruptly.

// class trycatch {
//     public static void main(String[] args) {
//         try {
//             int a = 10;
//             int b = 0;
//             System.out.println(a / b); // This will throw ArithmeticException
//         } catch (Exception e) { // Catching the parent class first
//             System.out.println("Exception caught: " + e.getMessage());
//         } 

//         System.out.println("Program Ends");
//     }
// }


//outputs:
//Exception caught: / by zero
//Program Ends



// there these parent classes should be used in end of the catch block, so that the child classes can be caught first, and the parent class can catch any other exceptions that are not caught by the child classes.




class trycatch {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b); // This will throw ArithmeticException
        } 
        catch (ArithmeticException e) { // This catch block will never be reached
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        }
        catch (Exception e) { // Catching the parent class first
            System.out.println("Exception caught: " + e.getMessage());
        } 

        System.out.println("Program Ends");
    }
}
//outputs:
//Arithmetic Exception caught: / by zero
//Program Ends