package exceptionhandling;
//finally 4 :finally block is used to execute important code such as closing resources, regardless of whether an exception occurred or not. It is executed after the try and catch blocks, and it is optional. If a finally block is present, it will always be executed, even if an exception is thrown or caught.

// Example 1: Exception Occurs
// public class finallyy {

//     public static void main(String[] args) {
//         try {
//             int a = 10;
//             int b = 0;
//             System.out.println(a / b); // This will throw ArithmeticException
//         } catch (ArithmeticException e) {
//             System.out.println("Error: " + e.getMessage());
//         } finally {
//             System.out.println("This block is always executed.");
//         }
//         System.out.println("Program Ends");
//     }

// }

//outputs:
//Error: / by zero
//This block is always executed.
//Program Ends

// No Exception Occurs

// class finallyy {

//     public static void main(String[] args) {
//         try {
//             int a = 10;
//             int b = 2;
//             System.out.println(a / b); // This will not throw an exception
//         } catch (ArithmeticException e) {
//             System.out.println("Error: " + e.getMessage());
//         } finally {
//             System.out.println("This block is always executed.");
//         }
//         System.out.println("Program Ends");
//     }
// }

//outputs:
//5
//This block is always executed.
//Program Ends

//Example 3: Exception Not Caught

// class finallyy {

//     public static void main(String[] args) {
//         try {
//             int a = 10;
//             int b = 0;
//             System.out.println(a / b); // This will throw ArithmeticException
//         } 
//         catch (NullPointerException e) {
//             System.out.println("Error: " + e.getMessage());
//         }finally {
//             System.out.println("This block is always executed.");
//         }
//         System.out.println("Program Ends");
//     }
// }

//outputs:
//This block is always executed.
//Exception in thread "main" java.lang.ArithmeticException: / by zero

//Example 4:  with Return Statement

// public class finallyy {

//     public static int test() {
//         try {
//             System.out.println("Tryyyy");
//             return 10;
//         } finally {
//             System.out.println("Finallyyyy");
//         }

//     }

//     public static void main(String[] args) {

//         System.out.println(test());
//     }
// }

//outputs:
//Tryyyy
//Finallyyyy
//10




//Example 5: Return in catch

// class finallyy {

//     public static int test() {
//         try {
//             System.out.println("Tryyyy");
//             int a = 10 / 0; // This will throw ArithmeticException
//             return 10;
//         } catch (ArithmeticException e) {
//             System.out.println("Catchhhh");
//             return 20;
//         } finally {
//             System.out.println("Finallyyyy");
//         }

//     }

//     public static void main(String[] args) {

//         System.out.println(test());
//     }
// }

//outputs:
//Tryyyy
//Catchhhh
//Finallyyyy
//20

// no return 10 as error was caught and then it went to catch.




//example 6: Return in catch and finally
//The finally block's return overrides the try /catch block's return.

// class finallyy {

//     public static int test() {
//         try {
//             System.out.println("Tryyyy");
//             int a = 10 / 0; // This will throw ArithmeticException
//             return 10;
//         } catch (ArithmeticException e) {
//             System.out.println("Catchhhh");
//             return 20;
//         } finally {
//             System.out.println("Finallyyyy");
//             return 30;
//         }

//     }

//     public static void main(String[] args) {

//         System.out.println(test());
//     }
// }



//outputs:
//Tryyyy
//Catchhhh
//Finallyyyy
//30






//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

// When does finally NOT execute?


public class finallyy {

    public static void main(String[] args) {

        try{
            System.out.println("tryyyyyy");
            System.exit(0);
        }
        finally{
            System.out.print("finallyyyyyy");
        }
    }
}
//output :  tryyyyy only as code gets terminated before finally block could execute.