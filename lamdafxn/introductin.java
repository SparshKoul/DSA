 package lamdafxn;
 import java.util.*;

// public class introductin {
//     public static void main(String[] args) {
//         List<Student> list = new ArrayList<>();
//         list.add(new Student("John", 20, 85));
//         list.add(new Student("Alice", 19, 90));
//         list.add(new Student("Bob", 21, 75));
//         list.add(new Student("Eve", 22, 95));

//         //Collections.sort(list); this is throw error. so we use class Student implements Comparable<Student> and override the compareTo method to sort the list of students based on their marks in ascending order.

//         Collections.sort(list);
//         for(Student s : list) {
//             System.out.println(s.name + " " + s.age + " " + s.marks);
//         }

//     }
    
// }
// class Student implements Comparable<Student> {
//     String name;
//     int age;
//     int marks;

//     public Student(String name, int age, int marks) {
//         this.name = name;
//         this.age = age;
//         this.marks = marks;
//     }
//     @Override
//     public int compareTo(Student other) {
//         return Integer.compare(this.marks, other.marks);
//     }
// }


// we can do all this as well using lambda function and comparator interface. we can use the compare method of the Comparator interface to sort the list of students based on their marks in ascending order.


// public class introductin {
//     public static void main(String[] args) {

//         List<Student> list = new ArrayList<>();
//         list.add(new Student("John", 20, 85));
//         list.add(new Student("Alice", 19, 90));
//         list.add(new Student("Bob", 21, 75));
//         list.add(new Student("Eve", 22, 95));

//         Comparator<Student> c1 =new sortByMarks();
//         Comparator<Student> c2 =new sortByName();
//         Comparator<Student> c3 =new sortByAge();


//         //
//         Collections.sort(list, c1);
//         System.out.println("Sorted by Marks:");
//         for(Student s : list) {
//             System.out.println(s.name + " " + s.age + " " + s.marks);
//         }

//         Collections.sort(list, c2);
//         System.out.println("\nSorted by Name:");
//         for(Student s : list) {
//             System.out.println(s.name + " " + s.age + " " + s.marks);
//         }

//         Collections.sort(list, c3);
//         System.out.println("\nSorted by Age:");
//         for(Student s : list) {
//             System.out.println(s.name + " " + s.age + " " + s.marks);
//         }

        
//     }

    
// }
// class Student {
//     String name;
//     int age;
//     int marks;

//     public Student(String name, int age, int marks) {
//         this.name = name;
//         this.age = age;
//         this.marks = marks;
//     }
// }



// class sortByMarks implements Comparator<Student> {
//     @Override
//     public int compare(Student s1, Student s2) {
//         return Integer.compare(s1.marks, s2.marks);
//     }
// }

// class sortByName implements Comparator<Student> {
//     @Override
//     public int compare(Student s1, Student s2) {
//         return s1.name.compareTo(s2.name);
//     }
// }

// class sortByAge implements Comparator<Student> {
//     @Override
//     public int compare(Student s1, Student s2) {
//         return Integer.compare(s1.age, s2.age);
//     }
// }



































// this way the code becomes too long and we can use lambda function to make it short and simple. we can use the compare method of the Comparator interface to sort the list of students based on their marks in ascending order.



class Student {
    String name;
    int age;
    int marks;

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}



public class introductin {
    public static void main(String[] args) {
        
        List<Student> list = new ArrayList<>();
        list.add(new Student("John", 20, 85));
        list.add(new Student("Alice", 19, 90));
        list.add(new Student("Bob", 21, 75));
        list.add(new Student("Eve", 22, 95));


        //using anonmous class as well (lamda is done after this )
        Collections.sort(list,new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
            return Integer.compare(s1.marks, s2.marks); 
            //or return s1.marks-s2.marks; but this is not recommended because it can cause overflow if the marks are very large.
            }    
        }

        );

        System.out.println("sort using anaon class marks:");
        for(Student s :list){
            System.out.println(s.name + " " + s.age + " " + s.marks);

        }




        // using lambda function to sort the list of students based on their marks in ascending order.

        //syntax  :   parameter -> expression
        Collections.sort(list, (s1, s2) -> Integer.compare(s1.marks, s2.marks));
        System.out.println("Sorted by Marks:");
        for(Student s : list) {
            System.out.println(s.name + " " + s.age + " " + s.marks);
        }




        //reverse
        Collections.sort(list, (s1, s2) -> Integer.compare(s2.marks, s1.marks));
        System.out.println("\nSorted by Marks in reverse:");
        for(Student s : list) {
            System.out.println(s.name + " " + s.age + " " + s.marks);
        }




        // using lambda function to sort the list of students based on their name in ascending order.
        Collections.sort(list, (s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("\nSorted by Name:");
        for(Student s : list) {
            System.out.println(s.name + " " + s.age + " " + s.marks);
        }


        //reverse
        Collections.sort(list, (s1, s2) -> s2.name.compareTo(s1.name));
        //or Collections.sort(list, (s1, s2) -> -s1.name.compareTo(s2.name));
        //Collections.sort(list, (s1, s2) -> s1.name.compareTo(s2.name) * -1);
        System.out.println("\nSorted by Name in reverse:");
        for(Student s : list) {
            System.out.println(s.name + " " + s.age + " " + s.marks);
        }

        // using lambda function to sort the list of students based on their age in ascending order.
        Collections.sort(list, (s1, s2) -> Integer.compare(s1.age, s2.age));
        System.out.println("\nSorted by Age:");
        for(Student s : list) {
            System.out.println(s.name + " " + s.age + " " + s.marks);
        }
    }

    
}