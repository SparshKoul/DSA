
// //Create a class Employee with overloaded constructors to initialize employee details based on different combinations of arguments. Ensure the constructors support the creation of objects in various ways.
// public class zzzzzques {
//     // Main method to test Employee class
//    public static void main(String[] args) {
//        Employee emp1 = new Employee("Geek1");
//        emp1.displayDetails();

//        Employee emp2 = new Employee("Geek2", 101);
//        emp2.displayDetails();

//        Employee emp3 = new Employee("Geek3", 102, "Engineering");
//        emp3.displayDetails();
//    }
// }


// class Employee{
//     String name;
//     int id;
//     String department;

//     // Constructor with only name
//     Employee(String name) {
//         this.name = name;
//         this.id = -1; // Default value
//         this.department = "Not Assigned"; // Default value
//     }

//     // Constructor with name and id
//     Employee(String name, int id) {
//         this.name = name;
//         this.id = id;
//         this.department = "Not Assigned"; // Default value
//     }

//     // Constructor with name, id, and department
//     Employee(String name, int id, String department) {
//         this.name = name;
//         this.id = id;
//         this.department = department;
//     }

//     // Method to display employee details
//     void displayDetails() {
//         System.out.println("Name: " + name + ", ID: " + id + ", Department: " + department);
//     }
// }





















//=======================================q2=========================================
//==================================================================================


//ques 2 -Create a class SeriesCalculator with a method calculateSum(int n) to calculate the sum of the first n numbers in the series 1 + 3 + 5 + 7 + .... Use the formula Sum = (n/2) * [2*a + (n-1)*d], where "a" is the first term and "d" is the common difference.



// class zzzzzques {
//     public static void main(String[] args) {
//         SeriesCalculator calculator = new SeriesCalculator();
//         int n = 5; // Example: Calculate sum of first 5 odd numbers
//         int sum = calculator.calculateSum(n);
//         System.out.println("The sum of the first " + n + " odd numbers is: " + sum);
//     }
// }

// class SeriesCalculator{
//     int calculateSum(int n) {
//         int a = 1; // First term
//         int d = 2; // Common difference
//         int sum = (n / 2) * (2 * a + (n - 1) * d);
//         return sum;
//     }
// } 





//=======================================q3=========================================
//==================================================================================


//Create a class Biggest that contains a single-dimensional array as a data member and a method display() to find and display the largest element of the array.

// class zzzzzques {
//     public static void main(String[] args) {
//         int[] arr = {3, 5, 7, 2, 8};
//         Biggest bigg = new Biggest(arr);
//         bigg.display();
//     }
// }

// class Biggest {
//     int num[];
//     Biggest(int[] arr) {
//         this.num = arr;
//     }
//     void display() {
//         int max = num[0];
//         for (int i = 1; i < num.length; i++) {
//             if (num[i] > max) {
//                 max = num[i];
//             }
//         }
//         System.out.println("The largest element in the array is: " + max);
//     }
    
// }










//=======================================q4=========================================
//==================================================================================

//Create a class Rectangle with attributes length and width, each defaulting to 1. The class should include set and get methods for both attributes, and a method to calculate the area of the rectangle.

// class zzzzzques {
//     public static void main(String[] args) {
//         Rectangle rect = new Rectangle();
//         rect.setLength(5);
//         rect.setWidth(3);
//         System.out.println("Length: " + rect.getLength());
//         System.out.println("Width: " + rect.getWidth());
//         System.out.println("Area: " + rect.calculateArea());
//     }
// }
// class Rectangle{

//     private double length;
//     private double width;

//     // Constructor with default values
//     Rectangle() {
//         this.length = 1;
//         this.width = 1;
//     }

//     // Setter for length
//     void setLength(double length) {
//         this.length = length;
//     }

//     // Getter for length
//     double getLength() {
//         return this.length;
//     }

//     // Setter for width
//     void setWidth(double width) {
//         this.width = width;
//     }

//     // Getter for width
//     double getWidth() {
//         return this.width;
//     }

//     // Method to calculate area
//     double calculateArea() {
//         return length * width;
//     }
// }


















//=======================================q5=========================================
//==================================================================================
//Create a class Circle with an attribute radius defaulting to 1. The class should include set and get methods for the radius, and a method to calculate the area of the circle using the formula Area = π * radius * radius (use Math.PI for π).
// public class zzzzzques {

//     public static void main(String[] args) {
//         Circle circle = new Circle();
//         circle.setRadius(4);
//         System.out.println("Radius: " + circle.getRadius());
//         System.out.println("Area: " + circle.calculateArea());
//     }


// }
// class Circle{

//     private double radius;

//     // Constructor with default value
//     Circle() {
//         this.radius = 1;
//     }

//     // Setter for radius
//     void setRadius(double radius) {
//         this.radius = radius;
//     }

//     // Getter for radius
//     double getRadius() {
//         return this.radius;
//     }

//     // Method to calculate area
//     double calculateArea() {
//         return Math.PI * radius * radius;
//     }
// }













//=======================================q6=========================================
//==================================================================================
//Create a class Person with firstName and lastName as data members. Override the toString() method to return the full name of the person. Define constructors to take appropriate parameters.


// class zzzzzques {

//     public static void main(String[] args) {
//         Person person = new Person("John", "Doe");
//         System.out.println(person.toString());
//     }

// }
// class Person{

//     String firstName;
//     String lastName;

//     // Constructor
//     Person(String firstName, String lastName) {
//         this.firstName = firstName;
//         this.lastName = lastName;
//     }

//     // Overriding toString() method
//     @Override
//     public String toString() {
//         return firstName + " " + lastName;
//     }
// } 









//=======================================q7=========================================
//==================================================================================


//Create a Student class with name, rollNo, and marks as attributes. Write a method to calculate the grade based on the marks and display the grade. Create multiple instances of the Student class and print their grades.
// public class zzzzzques {

//     public static void main(String[] args) {
//         Student s1 = new Student("Alice", 1, 85);
//         Student s2 = new Student("Bob", 2, 72);
//         Student s3 = new Student("Charlie", 3, 58);

//         s1.displayGrade();
//         s2.displayGrade();
//         s3.displayGrade();
//     }
// }
// class Student {
//     String name;
//     int rollNo;
//     int marks;

//     // Constructor
//     Student(String name, int rollNo, int marks) {
//         this.name = name;
//         this.rollNo = rollNo;
//         this.marks = marks;
//     }

//     // Method to calculate and display grade
//     void displayGrade() {
//         char grade;
//         if (marks >= 90) {
//             grade = 'A';
//         } else if (marks >= 80) {
//             grade = 'B';
//         } else if (marks >= 70) {
//             grade = 'C';
//         } else if (marks >= 60) {
//             grade = 'D';
//         } else {
//             grade = 'F';
//         }
//         System.out.println("Student: " + name + ", Roll No: " + rollNo + ", Marks: " + marks + ", Grade: " + grade);
//     }
    
// }




//=======================================q8=========================================
//==================================================================================

//Create a program that keeps track of the number of objects created and displays the count in a function called display().

// public class zzzzzques {

//     public static void main(String[] args) {
//         Counter c1 = new Counter();
//         c1.display();

//         Counter c2 = new Counter();
//         c2.display();

//         Counter c3 = new Counter();

//         Counter.display(); // Display the count of objects created
//     }
// }

// class Counter {
//     static int count = 0; // Static variable to keep track of object count

//     // Constructor
//     Counter() {
//         count++; // Increment count whenever a new object is created
//     }

//     // Static method to display the count of objects created
//     static void display() {
//         System.out.println("Number of objects created: " + count);
//     }
// }








//=======================================q9=========================================
//==================================================================================
//Create a class BankAccount with attributes accountNumber, accountHolderName, and balance. Implement methods to deposit and withdraw money, and display the account details.
// public class zzzzzques {

//     public static void main(String[] args) {
//         BankAccount account = new BankAccount("123456", "John Doe", 1000.0);
//         account.displayAccountDetails();
//         account.deposit(500.0);
//         account.withdraw(200.0);
//         account.displayAccountDetails();

// }
// }
// class BankAccount {
//     String accountNumber;
//     String accountHolderName;
//     double balance;

//     // Constructor
//     BankAccount(String accountNumber, String accountHolderName, double balance) {
//         this.accountNumber = accountNumber;
//         this.accountHolderName = accountHolderName;
//         this.balance = balance;
//     }

//     // Method to deposit money
//     void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("Deposited: " + amount);
//         } else {
//             System.out.println("Invalid deposit amount");
//         }
//     }

//     // Method to withdraw money
//     void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrawn: " + amount);
//         } else {
//             System.out.println("Invalid withdrawal amount");
//         }
//     }

//     // Method to display account details
//     void displayAccountDetails() {
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Account Holder Name: " + accountHolderName);
//         System.out.println("Balance: " + balance);
//     }
// }






//=======================================q10=========================================
//==================================================================================
//Create a class Car with attributes make, model, and year. The class should have a method displayDetails() that prints the details of the car. Include a constructor to initialize these attributes. Create an instance of the Car class and display its details.



// public class zzzzzques {

//     public static void main(String[] args) {
//         Car car = new Car("Toyota", "Camry", 2020);
//         car.displayDetails();
//     }
// }


// class Car{
//     String make;
//     String model;
//     int year;

//     // Constructor
//     Car(String make, String model, int year) {
//         this.make = make;
//         this.model = model;
//         this.year = year;
//     }

//     // Method to display car details
//     void displayDetails() {
//         System.out.println("Car Make: " + make);
//         System.out.println("Car Model: " + model);
//         System.out.println("Car Year: " + year);
//     } 
// }






//=======================================q11=========================================
//==================================================================================
//Create a class BankAccount with members AcctNo, balance, and AcctType. Implement the following operations:
//Deposit an amount of 10,000.
//Withdraw an amount of 5,000.
//Display account details.



// public class zzzzzques {

    
//     public static void main(String[] args) {
//         BankAccount account = new BankAccount(123456, "Savings", 0.0);
//         account.deposit(10000.0);
//         account.withdraw(5000.0);
//         account.displayAccountDetails();

// }   
// }

// class BankAccount {
//     int AcctNo;
//     double balance;
//     String AcctType;
//     // Constructor
//     ////BankAccount(String AcctNo, String AcctType, double balance) {
//         ////this.AcctNo = Integer.parseInt(AcctNo);
//         /// 
//         /// 
//     BankAccount(int AcctNo, String AcctType, double balance) {
//         this.AcctType = AcctType;
//         this.balance = balance;
//         this.AcctNo = AcctNo;
//     }
//     // Method to deposit money
//     void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("Deposited: " + amount);
//         } else {
//             System.out.println("Invalid deposit amount");
//         }
//     }
//     // Method to withdraw money
//     void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrawn: " + amount);
//         } else {
//             System.out.println("Invalid withdrawal amount");
//         }
//     }
//     // Method to display account details
//     void displayAccountDetails() {
//         System.out.println("Account Number: " + AcctNo);
//         System.out.println("Account Type: " + AcctType);
//         System.out.println("Balance: " + balance);
//     }

    
// }





















//=======================================q12=========================================
//==================================================================================

//Create a class Student with data members name, rollNo, and static member schoolName. Implement methods to set and get the name and rollNo. Demonstrate that changing the schoolName for one object affects all objects of the class.
// public class zzzzzques {

//     public static void main(String[] args) {
    
//         Student s1 = new Student();
//         s1.schoolName = "BBPS";

//         Student s2 = new Student();
//         System.out.println(s2.schoolName);

//         Student s3 =new Student();
//         System.out.println(s3.schoolName);

//         Student s4 =new Student();
//         s4.schoolName ="dav";
//         System.out.println(s4.schoolName);
//         //  after this s4 name of all above s123  all will become saqme as s4.
//         System.out.println(s1.schoolName);
//         System.out.println(s2.schoolName);
//         System.out.println(s3.schoolName);
//         System.out.println(s4.schoolName);

// }   

//     //output-bbps bbps bpps dav dav dav dav dav ,,,reason below.
// }   
// class Student{
//     String name;
//     int roll;

//     static String schoolName; 
    
//     // this is is common in all the obj of students .as we ceated s1 with school name bbps then all obj s2 s3 s4 will have same school name bbps until we change it in any one of them like s4 here we changed it to dav so now all obj will have dav as school name.

//     void setName(String name){
//         this.name = name;
//     }
//     String getName(){
//         return this.name;
//     }

// }






//=======================================q13=========================================
//==================================================================================

//Write a program to store N elements in an array of integers. Display the elements, then accept a number to search for. Display whether the number is found using a linear search method within a class.

// import java.util.Scanner;

// public class zzzzzques {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // Accept the size of the array
//         System.out.print("Enter the number of elements: ");
//         int n = scanner.nextInt();
        
//         // Create an instance of LinearSearchArray
//         LinearSearchArray searchArray = new LinearSearchArray(n);
        
//         // Accept elements and display them
//         searchArray.acceptElements();
//         searchArray.displayElements();
        
//         // Accept the number to search for
//         System.out.print("Enter the number to search for: ");
//         int target = scanner.nextInt();
        
//         // Perform linear search and display result
//         if (searchArray.linearSearch(target)) {
//             System.out.println("Number " + target + " is found in the array.");
//         } else {
//             System.out.println("Number " + target + " is not found in the array.");
//         }
        
//         scanner.close();
    
//     }
// }

// class LinearSearchArray {
//     private int[] arr;
//     private int size;

//     // Constructor to initialize the array
//     LinearSearchArray(int size) {
//         this.size = size;
//         arr = new int[size];
//     }

//     // Method to accept elements into the array
//     void acceptElements() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter " + size + " elements:");
//         for (int i = 0; i < size; i++) {
//             arr[i] = scanner.nextInt();
//         }
//     }

//     // Method to display the elements of the array
//     void displayElements() {
//         System.out.println("The elements in the array are:");
//         for (int i = 0; i < size; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     // Method to perform linear search
//     boolean linearSearch(int target) {
//         for (int i = 0; i < size; i++) {
//             if (arr[i] == target) {
//                 return true; // Target found
//             }
//         }
//         return false; // Target not found
//     }
// }















//=======================================q14=========================================
//==================================================================================

//create a class Employee with members empNo, name, department, and salary. In main, create a reference variable of type Employee, allocate memory for the Employee object using the new operator, and initialize the data members using command line arguments. Display the data members.

// import java.util.Scanner;

// public class zzzzzques {

//     public static void main(String[] args) {
        

//         // Display the data members

//        Employee emp = new Employee (101,"Sparsh","IT",75000);
//         emp.displayDetails() ;
//     }
// }



// class Employee {
//     int empNo;
//     String name;
//     String department;
//     double salary;

//     Employee( int empNo, String name, String department, double salary) {
//         // Default constructor
//         this.empNo = empNo;
//         this.name = name;
//         this.department = department;
//         this.salary = salary;

//     }
//     // Method to display employee details
//     void displayDetails() {
//         System.out.println("Employee Number: " + empNo);
//         System.out.println("Name: " + name);
//         System.out.println("Department: " + department);
//         System.out.println("Salary: " + salary);
//     }

  

// }





//=======================================q15=========================================
//==================================================================================
//18..