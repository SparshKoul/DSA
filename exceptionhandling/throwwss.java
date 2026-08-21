package exceptionhandling;
//throws 6: The throws keyword is used in the method signature to declare that a method may throw one or more exceptions. It indicates that the method does not handle the specified exceptions itself but instead passes the responsibility of handling them to the calling code. When a method declares exceptions using throws, it allows the caller to be aware of the potential exceptions and handle them appropriately.

import java.io.FileReader;
import java.io.IOException;

//returnType methodName() throws ExceptionType {
//    // code
//}







// class throwwss {
//     public static void readFile() throws IOException {

//         FileReader fr = new FileReader("abc.txt");

//     }

//     public static void main(String[] args) {

//         readFile();

//     }
// }

//output : Exception in thread "main" java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)




// class throwwss {
//     public static void readFile() throws IOException {

//         FileReader fr = new FileReader("abc.txt");

//     }

//     public static void main(String[] args) {

//         try {
//             readFile();
//         } catch (IOException e) {
//             System.out.println("File not found: " + e.getMessage());
//         }
//     }
// }


//output : File not found: abc.txt (The system cannot find the file specified)












//throws with Multiple Methods

class throwwss {
    static void C() throws IOException {

        FileReader fr = new FileReader("abc.txt");

    }

    static void B() throws IOException {

        C();

    }

    static void A() throws IOException {

        B();

    }

    public static void main(String[] args) throws IOException {
        try {
            A();
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
//output : File not found: abc.txt (The system cannot find the file specified)