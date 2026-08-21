package filehandling;
import java.io.*;

//Topic 5: Writing Files (FileWriter)

//Just like FileReader reads characters from a file, FileWriter writes characters to a file.

// public class writing {

    
//     public static void main(String[] args) {
        
//         try {
//             // Create a FileWriter object to write to the file
//             FileWriter fw = new FileWriter("xyz.txt");

//             // Write some text to the file
//             fw.write("This is a sample text written to the file.\n");
//             fw.write("You can write multiple lines of text.\n");
//             fw.write("File writing is easy in Java!\n");


//             //if wanna add numbers.
//             //fw.write(65); // This will write the character 'A' (ASCII value 65) to the file not the number 65.

//             fw.write(String.valueOf(65));
//             fw.write("65");

//             // Close the FileWriter to save changes and release resources
//             fw.close();

//             System.out.println("Text written to the file successfully.");
//         } catch (IOException e) {
//             e.printStackTrace(); // Print any exceptions that occur during file writing
//         }
//     }
// }


//what ever written earlier in the file will be deleted and new text will be written. (overridden)











//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


//Topic 6: Append Mode in FileWriter
//To keep the old data and add new data, use:




// class writing {

//     public static void main(String[] args) {
        
//         try {
//             // Create a FileWriter object in append mode (true)
//             FileWriter fw = new FileWriter("xyz.txt", true);
//             // The second parameter 'true' indicates that we want to append to the file instead of overwriting it.

//             // Write some text to the file
//             fw.write("This is an additional line of text.\n");
//             fw.write("Appending data to the existing file.\n");

//             // Close the FileWriter to save changes and release resources
//             fw.close();

//             System.out.println("Text appended to the file successfully.");
//         } catch (IOException e) {
//             e.printStackTrace(); // Print any exceptions that occur during file writing
//         }
//     }
// }

















//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


//Topic 7: BufferedWriter :Instead of writing every character directly to the disk, it first stores data in memory (buffer) and writes it in larger chunks.


//example 1
//
//old text in the file will be deleted and new text will be written. (overridden)


// public class writing {
    
//     public static void main(String[] args) {
        
//         try {
//             // Create a BufferedWriter object to write to the file
//            //FileWriter fw = new FileWriter("xyz.txt");
//            // BufferedWriter bw = new BufferedWriter(fw);
//             BufferedWriter bw = new BufferedWriter(new FileWriter("xyz.txt"));

//             // Write some text to the file using BufferedWriter
//             bw.write("This is a sample text written to the file using BufferedWriter.\n");
//             bw.write("BufferedWriter improves performance by reducing disk I/O operations.\n");
//             bw.write("You can write multiple lines of text efficiently.\n");

//             // Close the BufferedWriter to save changes and release resources
//             bw.close();

//             System.out.println("Text written to the file successfully using BufferedWriter.");
//         } catch (IOException e) {
//             e.printStackTrace(); // Print any exceptions that occur during file writing
//         }
// }
// }


//Example 2: Write Multiple Lines



// public class writing {

//     public static void main(String[] args) {
        
//         try {
//             // Create a BufferedWriter object to write to the file
//             BufferedWriter bw = new BufferedWriter(new FileWriter("xyz.txt"));

//             // Write multiple lines of text to the file using BufferedWriter
//             String[] lines = {
//                 "This is the first line.",
//                 "This is the second line.",
//                 "This is the third line.",
//                 "BufferedWriter allows writing multiple lines efficiently."
//             };

//             for (String line : lines) {
//                 bw.write(line);
//                 bw.newLine(); // Add a new line after each line
//             }

//             bw.write("rahul");
//             bw.newLine();
//             bw.write("kumar");
//             bw.newLine();
//             bw.write("singh");
//             bw.newLine();
//             bw.write("tony\n");
//             bw.write("stark");

//             //if these newline() are not used, then all the text will be written in a single line.
//             //or use \n both are same. newLine() is more readable and platform-independent.

//             // Close the BufferedWriter to save changes and release resources
//             bw.close();

//             System.out.println("Multiple lines written to the file successfully using BufferedWriter.");
//         } catch (IOException e) {
//             e.printStackTrace(); // Print any exceptions that occur during file writing
//         }
// }}














//flush() method: It is used to flush the stream, ensuring that any buffered data is written to the underlying output stream immediately. This is useful when you want to make sure that all data is written to the file before closing the stream or performing other operations.


// public class writing {

//     public static void main(String[] args) {
//         try{
//             BufferedWriter bw = new BufferedWriter(new FileWriter("xyz.txt"));
//             bw.write("Hello, World!");
//             bw.flush(); // Ensure data is written to the file immediately.
//             bw.write("This is a test.");
//             bw.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }
// //btw  no \n or newLine() is used here, so all the text will be written in a single line.



//anything wriiten after flush can be added to the file, but if the stream is closed, then no more data can be written to the file. So flush() is used to write the data to the file without closing the stream.
//like if .closes() is usen then file cant be edited as file gets closed.









//append mode with BufferedWriter: To append data to an existing file instead of overwriting it, you can use the FileWriter constructor with the append flag set to true. This allows you to add new content to the end of the file without losing the existing data.


// public class writing {

  
//     public static void main(String[] args) {
//         try{
            
//             BufferedWriter bw = new BufferedWriter(new FileWriter("xyz.txt", true)); // Append mode
//             bw.write("Appending this line to the existing file.\n");
//             bw.write("BufferedWriter in append mode is useful for adding data.\n");
//             bw.close();
//             System.out.println("Data appended to the file successfully using BufferedWriter.");
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
// }}
















//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

//Topic 8: PrintWriter : It is a character-based class that provides convenient methods for writing formatted text to a file. It is often used for writing text data in a human-readable format.


// public class writing {

//     public static void main(String[] args) {
        
//         try {
//             // Create a PrintWriter object to write to the file
//             PrintWriter pw = new PrintWriter("xyz.txt");
//             //orPrintWriter pw = new PrintWriter(new FileWriter("xyz.txt")); 

//             pw.print("hellooo");
//             pw.print(" world");
//             //this will write hellooo world in a single line as no new line is used here.


//             //to print in new line, use println() method instead of print() method.

//             pw.println("This is a line written using PrintWriter.");
//             pw.println("PrintWriter provides convenient methods for writing text.");


//             // to write numbers, you can use the print() or println() methods as well. For example:

//             int number = 42;
//             pw.println( number);
//             pw.println(78.65);


//             pw.println(true);

//             // Close the PrintWriter to save changes and release resources
//             pw.close();

//             System.out.println("Text written to the file successfully using PrintWriter.");
//         } catch (IOException e) {
//             e.printStackTrace(); // Print any exceptions that occur during file writing
//         }
//     }

// }

















//using printf() method of PrintWriter to write formatted text to a file. The printf() method allows you to format the output using format specifiers, similar to how you would use printf in C or other programming languages.


public class writing {

    public static void main(String[] args) {
        try{
            
            PrintWriter pw = new PrintWriter("xyz.txt");

            // Using printf() to write formatted text to the file
            String name = "Rahul";
            int age = 25;
            double salary = 50000.75;

            pw.printf("Name: %s\n", name);
            pw.printf("Age: %d\n", age);
            pw.printf("Salary: %.2f\n", salary);

            // Close the PrintWriter to save changes and release resources
            pw.close();

            System.out.println("Formatted text written to the file successfully using PrintWriter.");
        } catch (IOException e) {
            e.printStackTrace(); // Print any exceptions that occur during file writing
        }
        
    }
}