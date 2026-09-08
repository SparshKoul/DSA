package filehandling;
//serialization 4: is the process of converting an object into a byte stream, so that it can be easily saved to a file or transmitted over a network. In Java, this is typically done using the `Serializable` interface and the `ObjectOutputStream` and `ObjectInputStream` classes.






//Step 1: Create a Student Class
import java.io.*;
class Student implements Serializable {
     String name;
     int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}


//Writing an Object (Serialization) 
//Step 2: Save the Object


// public class serialization {
    
//     public static void main(String[] args) {
//         Student s= new Student("John Doe", 20);

//         // Serialize the object
//         try{

//             ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("student.dat"));

//             out.writeObject(s);//This performs the serialization.
//              // any chnges made here like s.name ="hello" will not be reflected in the file because the object is already serialized and saved to the file.
//                  // still it will show old value ie "John Doe" when we deserialize it.

//             out.close();

//             System.out.println("Object Saved");

//         }
//         catch(Exception e) {
//             e.printStackTrace();
//         }
    
// }}


//after  serialization the student file contains only bytes the notepad shows them as "ÿØÿàJFIF����"












//Reading an Object (Deserialization): It does not read it as text,It reads the raw bytes..

public class serialization {
    public static void main(String[] args) {
         try {

            ObjectInputStream in =new ObjectInputStream(new FileInputStream("student.dat"));

            Student s = (Student) in.readObject();//"These bytes were created from a Student object. I'll rebuild that object."

            // so  Now the object exists again in RAM.

            System.out.println(s.name);
            System.out.println(s.age);

            in.close();   

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}




// we dont want some of the data to be saved / serialized, for example password,otps,
//  so we can use the transient keyword to mark that variable as non-serializable.


//class Student implements Serializable {

//    String name;

//    transient String password;

//}

