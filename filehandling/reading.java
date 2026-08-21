package filehandling;
//file reading 1: In Java, you can read the contents of a file using various classes and methods provided by the Java I/O (Input/Output) API. The most commonly used classes for reading files are BufferedReader, FileReader, and Scanner..
import java.util.*;
import java.io.*;

// class reading {
//     public static void main(String[] args) throws IOException {

//         FileReader fr = new FileReader("abc.txt");

//         int ch;

//         while ((ch = fr.read()) != -1) {
//             //works as fr.read reurns the asci value of char that gets assignes in ch then it if check if != -1.

//             System.out.print((char) ch);
//         }

//         fr.close();
//     }

// }

//fr.read returns asci value of the character and we are typecasting it to char to print the character instead of its ascii value.


















//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX













//BufferedReader is used to read text from a file efficiently.

//Unlike FileReader, which reads one character at a time, BufferedReader reads larger chunks of data into memory (a buffer), making it much faster for large files.





// public class reading {

//     public static void main(String[] args) throws IOException {

//         FileReader fr = new FileReader("abc.txt");
//         BufferedReader br = new BufferedReader(fr);

//         String line;

//         while ((line = br.readLine()) != null) {
//             System.out.println(line);
//         }

//         br.close();
//         fr.close();
//     }

// }
//output: This code will read the contents of the file "abc.txt" line by line and print each line to the console. If the file does not exist, it will throw a FileNotFoundException.









//better way to write the above code is to use try with resources so that we don't have to close the resources explicitly.
// public class reading {

//     public static void main(String[] args) {

//         try {
//             // Create a FileReader to read the file
//             FileReader fileReader = new FileReader("abc.txt");

//             // Create a BufferedReader to read the file line by line
//             BufferedReader bufferedReader = new BufferedReader(fileReader);

//             String line;
//             // Read each line of the file until the end is reached
//             while ((line = bufferedReader.readLine()) != null) {
//                 System.out.println(line); // Print the line to the console
//             }

//             // Close the BufferedReader and FileReader
//             bufferedReader.close();
//             fileReader.close();
//         } catch (Exception e) {
//             e.printStackTrace(); // Print any exceptions that occur during file reading
//         }
//     }

// }





//What is printStackTrace()?

//It is a method of the Throwable class (the parent of all exceptions) that prints detailed information about the exception.




















//Reading Files using Scanner




// //read line by line .
// class reading {

//     public static void main(String[] args) {

//         try {
//             // Create a File object to represent the file
//             File file = new File("abc.txt");

//             // Create a Scanner to read the file
//             Scanner scanner = new Scanner(file);

//             // Read each line of the file until the end is reached
//             while (scanner.hasNextLine()) {
//                 String line = scanner.nextLine();
//                 System.out.println(line); // Print the line to the console
//             }

//             // Close the Scanner
//             scanner.close();
//         } catch (Exception e) {
//             e.printStackTrace(); // Print any exceptions that occur during file reading
//         }
//     }

// }


//output :
//hi 
//hello
//410
//this is for filehandling folder


//here all the output is printed as string coz of nextLine().




//read word by word

// public class reading {
//     public static void main(String[] args) {
        
//         try {
//             // Create a File object to represent the file
//             File file = new File("abc.txt");

//             // Create a Scanner to read the file
//             Scanner scanner = new Scanner(file);

//             // Read each word of the file until the end is reached
//             while (scanner.hasNext()) {
//                 String word = scanner.next();
//                 System.out.println(word); // Print the word to the console
//             }

//             // Close the Scanner
//             scanner.close();
//         } catch (Exception e) {
//             e.printStackTrace(); // Print any exceptions that occur during file reading
//         }
//     }
// }


//output :
//hi
//hello
//410
//this
//is
//for
//filehandling
//folder


//all the output is printed as string coz of next() method which reads word by word and returns string.





//reading data of different types from file using scanner

class reading {
    public static void main(String[] args) {
        
        try {
            // Create a File object to represent the file
            File file = new File("abc.txt");

            // Create a Scanner to read the file
            Scanner scanner = new Scanner(file);

            // Read each token of the file until the end is reached
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    System.out.println("Integer: " + number);
                } else if (scanner.hasNextDouble()) {
                    double decimal = scanner.nextDouble();
                    System.out.println("Double: " + decimal);
                } else {
                    String word = scanner.next();
                    System.out.println("String: " + word);
                }
            }

            // Close the Scanner
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace(); // Print any exceptions that occur during file reading
        }
    }
}










