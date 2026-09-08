package exceptionhandling;
//RuntimeException 2

//      │
//      ├── ArithmeticException
//      ├── NullPointerException
//      ├── NumberFormatException
//      ├── IndexOutOfBoundsException
//      │        ├── ArrayIndexOutOfBoundsException
//      │        └── StringIndexOutOfBoundsException

// public class hierarchytwo {
//     public static void main(String[] args) {
//         try {
//             int x = 10 / 0;
//         } catch (ArithmeticException e) {
//             System.out.println("Arithmetic Errorrrrrr: " + e.getMessage());
//         }
//         //Since ArithmeticException inherits from RuntimeException, Java knows this catch block can handle it.
//         //
//         //even if instead of Arthmeticrx in cath block we directly write Runtimeexc it will work normally
//     }

// }





// public class hierarchytwo {

//     public static void main(String[] args) {
//         try {
//             int[] arr = { 1, 2, 3 };
//             System.out.println(arr[5]);
//         } catch (RuntimeException e) {
//             System.out.println("Runtime Exceptionnn");
//         }
//         //outputs:  Runtime Exceptionnn
//         //as => ArrayIndexOutOfBoundsException--> IndexOutOfBoundsException --> RuntimeException
//         //Since ArrayIndexOutOfBoundsException inherits from RuntimeException, Java knows this catch block.

//     }
// }








//  Exception
//  │
//  ├── ClassNotFoundException
//  │
//  ├── SQLException
//  │
//  ├── IOException
//  │   └── FileNotFoundException
//  │
//  └── RuntimeException
//      ├── ArithmeticException
//      ├── NullPointerException
//      ├── NumberFormatException
//      ├── IndexOutOfBoundsException
//            ├── ArrayIndexOutOfBoundsException
//            └── StringIndexOutOfBoundsException







// public class hierarchytwo {

//     public static void main(String[] args) {
//         try {
//             int[] arr = { 1, 2, 3 };
//             System.out.println(arr[5]);
//         } catch (Exception e) {
//             System.out.println("Exception occurred: " + e.getMessage());
//         }
//         //outputs:  Exception occurred: Index 5 out of bounds for length 3
//         //exception class is the parent class of all exceptions, so it can catch any exception that occurs in the try block.

//     }
// }







//CATCHING THROWABLE EXCEPTIONS


//  Throwable
//  │
//  ├── Error
//  │   ├── OutOfMemoryError
//  │   └── StackOverflowError
//  │
//  └── Exception
//    │
//    ├── ClassNotFoundException
//    │
//    ├── SQLException
//    │
//    ├── IOException
//    │   └── FileNotFoundException
//    │
//    └── RuntimeException
//         ├── ArithmeticException
//         ├── NullPointerException
//         ├── NumberFormatException
//         └── IndexOutOfBoundsException
//             ├── ArrayIndexOutOfBoundsException
//             └── StringIndexOutOfBoundsException


// class hierarchytwo {

//     public static void main(String[] args) {
//         try {
//             int[] arr = { 1, 2, 3 };
//             System.out.println(arr[5]);
//         } catch (Throwable e) {
//             System.out.println("Throwable Exception occurred: " + e.getMessage());
//         }
//         //outputs:  Throwable Exception occurred: Index 5 out of bounds for length 3
//         //Throwable is the superclass of all errors and exceptions in Java, so it can catch any throwable that occurs in the try block.

//     }
// }




//so when to use throwable when to use Exception or when for runtime 





// public class hierarchytwo {

//     public static void main(String[] args) {
//         try {
//             String s = null;
//             System.out.println(s.length());
//         }
//         catch (NullPointerException e) {
//             System.out.println("Caught: NullPointerException");
//             System.out.println("Message: " + e.getMessage());
//         }
//     }
// }


//output: Caught: NullPointerException
//          Message: Cannot invoke "String.length()" because "s" is null



public class hierarchytwo {

    public static void main(String[] args) {
        try {
            String s = args.length == 0 ? null : args[0];
            if (s != null) {
                System.out.println(s.length());
            }
        }
        catch (RuntimeException  e) {
            System.out.println("Caught: Runtime");
            System.out.println("Message: " + e.getMessage());
        }        
    }
}

//output: Caught: Runtime
//          Message: Cannot invoke "String.length()" because "s" is null



// and so on changes for throwable e and Exception e as well.
//better to use Exception e all the time because it will catch all the exceptions and errors as well.