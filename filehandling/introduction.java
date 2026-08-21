package filehandling;

import java.io.*;

// public class introduction {
//     public static void main(String[] args) throws IOException {

//         File f = new File("abc.txt");
//         //This only creates a File object, not the actual file.

//         if (f.createNewFile()) {// this method creates the actual file in the specified path if it does not exist.
//             System.out.println("File Created");
//         } else {
//             System.out.println("Already Exists");
//         }
//     }
// }

//output: File Created (actually as well)
//if code ran again then output will be: Already Exists












//Check if File Exists

// class introduction {
//     public static void main(String[] args) throws IOException {

//         File f = new File("abc.txt");

//         if (f.exists()) {
//             System.out.println("File Exists");
//         } else {
//             System.out.println("File does not exist");
//         }
//     }
// }



//Delete a File

// class introduction {
//     public static void main(String[] args) throws IOException {

//         File f = new File("abc.txt");

//         if (f.delete()) {
//             System.out.println("File Deleted");
//         } else {
//             System.out.println("File not found");
//         }
//     }
// }


//Get File Name

// class introduction {
//     public static void main(String[] args) throws IOException {

//         File f = new File("abc.txt");

//         System.out.println("File Name: " + f.getName());
//     }
// }
//output: File Name: abc.txt even if file does not exist because getName() method returns the name of the file or directory denoted by this abstract pathname. It does not check if the file exists or not.




//Get File Path
// class introduction {
//     public static void main(String[] args) throws IOException {

//         File f = new File("abc.txt");

//         System.out.println("File Path: " + f.getAbsolutePath());
//         System.out.println("File Path: " + f.getPath());

//     }
// }

//File Path: C:\Users\Sparsh\OneDrive\Desktop\DSA\abc.txt
//File Path: abc.txt






//Check if Readable


public class introduction {

    public static void main(String[] args) throws IOException {

        File f = new File("abc.txt");

        if (f.canRead()) {
            System.out.println("File is Readable");
        } else {
            System.out.println("File is not Readable");
        }


        //Check if Writable
        if (f.canWrite()) {
            System.out.println("File is Writable");
        } else {
            System.out.println("File is not Writable");
        }



        //File Length
        System.out.println("File Length: " + f.length());
        //file length returns the length of the file in bytes. If the file does not exist, it returns 0. If the file is a directory, it returns 0 as well.
    }
}